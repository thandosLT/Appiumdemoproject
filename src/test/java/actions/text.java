package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class text {
	public RemoteWebDriver _driver;
	public timeouts wait;
	
	public text(RemoteWebDriver driver) {
		this._driver = driver;
	}
	
	public String readText(By elementLocation) {
        wait.waitVisibility(elementLocation);
        return _driver.findElement(elementLocation).getText();
    }
	
	public void writeText(By elementLocation, String text) {
	    wait.waitVisibility(elementLocation);
	    _driver.findElement(elementLocation).sendKeys(text);
	}
}
