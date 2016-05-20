package Helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumDriver {

	public static WebDriver driver;

	public static WebDriver Instance()
	{
		if(driver == null)
		{
			CreateDriver();
			return driver;
		}
		else
		{
			return driver;
		}
	}
	
	public static WebDriver CreateDriver()
	{
		//*Download ChromeDriver from https://sites.google.com/a/chromium.org/chromedriver/ , set path below to location of ChromeDriver.*
		//System.setProperty("webdriver.chrome.driver", "/Users/pedrokarsan/Documents/Drivers/chromedriver");
		//driver = new ChromeDriver();		
		
		driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
}
