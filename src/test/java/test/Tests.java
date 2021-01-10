package test;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pages.homepage;

public class Tests extends BaseClass{
	public RemoteWebDriver _driver;
	public homepage home;
	
	public Tests()
	{
		home = new homepage(_driver);
		_driver = setup();
	}
		
	@Test
	public void ThandoServicesHomeLoad()
	{
		home.MobileNavigateToHome(_driver, "https://thandoservices.co.za");
	}
	
	@Test
	public void Ow2OneFaceBookLink()
	{
		home.MobileNavigateToHome(_driver, "https://ow2one.co.za");
		
		home.goToHeaderMenu(_driver)
		.MobileMenuAboutClick(_driver)
		.clickFacebookIcon(_driver);
	}
	
}
