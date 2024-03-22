package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetching;

public class LoginPageEvents {
	
	ElementFetching ef=new ElementFetching();
	public void verifyIfLoginPageIsLoaded() {
		
		Assert.assertTrue(ef.getWebElements("XPATH", LoginPageElements.loginText).size()==0,"Element Not found");
		
	}
public void enterCredentials() {
	
	ef.getWebElement("XPATH",LoginPageElements.emailId).sendKeys("jackpsgtech@gmail.com");
	ef.getWebElement("XPATH",LoginPageElements.emailPwd).sendKeys("Jack@1234");

	}

}
