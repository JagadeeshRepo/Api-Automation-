package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetching;

public class LoginTests extends BaseTest {
	
	ElementFetching ef=new ElementFetching();
	HomePageEvents homepage= new HomePageEvents();
	LoginPageEvents loginpage=new LoginPageEvents();
	
	@Test
	public void enteringCredentials() {
		logger.info("Clicked LoginButton");
		homepage.LoginButton();
		logger.info("Verified LoginPage");
		loginpage.verifyIfLoginPageIsLoaded();
		logger.info("Entered Credentials");
		loginpage.enterCredentials();
	}
	

}
