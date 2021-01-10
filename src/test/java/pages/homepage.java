package pages;

import actions.navigation;
import test.BaseClass;
import actions.click;
import actions.confirm;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class homepage extends BaseClass{
  public RemoteWebDriver _driver;
  
  public navigation nav;
  public click aClick;
  public confirm aConfirm;
  
  public homepage(RemoteWebDriver driver) {
	  this._driver = driver;
	  nav = new navigation(driver);
	  aClick = new click(driver);
  }
  
  //Elements
  By eHeaderLogo = By.xpath("//a[@class='custom-logo-link']");
  By eFooter = By.xpath("//Section[@data-id='d900daf']");
  By HeaderMenu = By.xpath("//span[@class='menu-toggle-icon']");
  
  public homepage NavigateToHome(RemoteWebDriver driver)
  {
	  assertThat(aConfirm.ConfirmElementIsDisplayed(driver, eHeaderLogo)).isTrue();
	  	  
	  return new homepage(_driver);
  }
  public void NavigateToHome(RemoteWebDriver driver, String url)
  {
	 nav.GoToUrl(driver,url);
  }
  public void MobileNavigateToHome(RemoteWebDriver driver, String url)
  {
	 nav.MobileGoToUrl(driver,url);
  }
  
  public menu goToHeaderMenu(RemoteWebDriver driver)
  {
	  aClick.Click(driver, HeaderMenu);
	  return new menu(driver);
  }
}
