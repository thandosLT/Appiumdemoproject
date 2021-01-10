package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import actions.click;
import actions.confirm;
import actions.scroll;

public class about {
	
	public RemoteWebDriver _driver;
	public click aClick;
	public confirm aConfirm;
	public scroll aScroll;

	public about(RemoteWebDriver driver)
	{
		this._driver = driver;
		aClick = new click(driver);
		aConfirm = new confirm(driver);
		aScroll = new scroll(driver);
	}
	
	//WebElement temp = _driver.findElement(By.xpath("//i[@class='fab fa-facebook-f'][1]"));
	By faceBookLink = By.xpath("//i[@class='fab fa-facebook-f'][1]");
	By faceBookPage = By.cssSelector("#header > div > a > i > u");
	
	public void clickFacebookIcon(RemoteWebDriver driver)
	{
		aScroll.ScrollBy(driver);
		//aScroll.ScrollToElement(driver, faceBookLink);
		aClick.Click(driver, faceBookLink);
		confirmAboutElements(driver, faceBookPage);
		
	}
	
	private void confirmAboutElements(RemoteWebDriver driver,By element)
	{
		aConfirm.ConfirmElementIsDisplayed(driver, element);
	}
}
