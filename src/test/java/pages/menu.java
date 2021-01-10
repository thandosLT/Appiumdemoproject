package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import test.BaseClass;
import actions.click;

public class menu extends BaseClass{
	
	public RemoteWebDriver _driver;
	public click aClick;
	
	public menu(RemoteWebDriver driver)
	{
		this._driver = driver;
		aClick = new click(driver);
	}
	
	By eHeaderLogo = By.xpath("//a[@class='custom-logo-link']");
	By eFooter = By.xpath("//Section[@data-id='d900daf']");
	By HeaderMenu = By.xpath("//span[@class='menu-toggle-icon']");
	By MenuAbout = By.xpath("//a[@class='menu-link' and text()='About']");
	
	public void clickBurgerMenu(RemoteWebDriver driver, By element)
	{
		aClick.Click(driver, element);
	}
	
	public about MobileMenuAboutClick(RemoteWebDriver driver)
	{
		clickMenuItem(_driver, MenuAbout);
		return new about(driver);
	}
	
	private void clickMenuItem(RemoteWebDriver driver, By element)
	{
		aClick.Click(driver, element);
	}
}

 
