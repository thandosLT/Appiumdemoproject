package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Config.ConfigFileReader;

public class timeouts {
	public RemoteWebDriver _driver;
	//ConfigFileReader configfilereader;
	WebDriverWait wait;
		
	public timeouts(RemoteWebDriver driver) {
		this._driver = driver;
		//configfilereader = new ConfigFileReader();
		//wait = new WebDriverWait(driver, configfilereader.getDefaultWait());
		wait = new WebDriverWait(driver, 40);
	}
	
	public void waitVisibility(By by){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
	
	public void waitClickable(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
}
