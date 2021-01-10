package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class confirm {
	public RemoteWebDriver _driver;
	public timeouts wait; 
	
	public confirm(RemoteWebDriver driver) {
		this._driver = driver;
	}
	
	public boolean ConfirmElementIsDisplayed(RemoteWebDriver driver, By elementLocation) {
		boolean returnValue = false;
		if (driver != null)
		{
			if(!driver.findElement(elementLocation).isDisplayed()){
		        System.out.println("Element is displayed");
		        returnValue = true;
		    }else{
		    	System.out.println("Element is not displayed");
		    	returnValue = false;
		    }
		}
		return returnValue;
	}
	
	public boolean ConfirmElementIsEnabled(By elementLocation, RemoteWebDriver driver) {
		boolean returnValue = false;
		if (driver != null)
		{
			if(!driver.findElement(elementLocation).isEnabled()){
				System.out.println("Element is enabled");
		        returnValue = true;
		    }else{
		    	System.out.println("Element is not Enabled");
		    	returnValue = false;
		    }
		}
		return returnValue;
    }
}
