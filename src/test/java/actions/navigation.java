package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class navigation {
	public RemoteWebDriver _driver;
		
	public navigation(RemoteWebDriver driver) {
		this._driver = driver;
	}

	public void GoToUrl(RemoteWebDriver driver, String url)
	{
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void MobileGoToUrl(RemoteWebDriver driver, String url)
	{
		//driver.manage().window().maximize();
		driver.get(url);
	}
}
