package test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.homepage;

public class BaseClass {

	public RemoteWebDriver _driver;
	//protected AndroidDriver<AndroidElement> _driver = null;

	public homepage homePage;	
	
	
	
	//@BeforeTest
	public RemoteWebDriver setup() {
		
		String browserType = "DesktopMobileEmulator";
		
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			
			if(browserType == "DesktopMobileEmulator") {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\thandos\\Documents\\Software\\chromedriver.exe");
				Map<String, String> mobileEmulation = new HashMap<String, String>();
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

				_driver = new ChromeDriver(chromeOptions);
				
			}
			else if(browserType == "DesktopChromeBrowser") {
				
			}
			else if(browserType == "Appium") {
				/*caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
				caps.setCapability(MobileCapabilityType.UDID, "");
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				//native app
				//caps.setCapability(MobileCapabilityType.APP, "");
				//Browser
				caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");*/
				
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "8.1");
				caps.setCapability("browser", "Chrome");
				caps.setCapability("resolution", "1366x768");
				caps.setCapability("browser_version", "latest");
				//caps.setCapability("browserstack.local", "false");
				//caps.setCapability("browserstack.selenium_version", "3.14.0");
				
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				
				//_driver = new AppiumDriver<MobileElement>(url,caps);
			}
			else if (browserType == "AndroidDevice") {
				
				//caps.setCapability("reportDirectory", reportDirectory);
		        //caps.setCapability("reportFormat", reportFormat);
		        caps.setCapability("testName", "Test1");
		        caps.setCapability(MobileCapabilityType.UDID, "MQK9K20A31910299");
		        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		        
		        //caps.setBrowserName(MobileBrowserType.CHROMIUM);
		        _driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
		        //driver.setLogLevel(Level.INFO);

			}
			_driver.manage().window().maximize();
			
		}catch(Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
		}
		return _driver;
	}
	
	@BeforeMethod
    public void methodLevelSetup() {
        homePage = new homepage(_driver);
    }
	 
	@AfterTest
	public void teardown() {
		_driver.close();
		_driver.quit();
	}
}
