package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetching;

public class HomePageEvents {
	
	ElementFetching ef= new ElementFetching();
	public void LoginButton() {
		ef.getWebElement("XPATH", HomePageElements.loginButtonText).click();
	}

}
