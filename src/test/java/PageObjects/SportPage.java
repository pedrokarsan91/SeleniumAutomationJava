package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helpers.SeleniumHelper;

public class SportPage extends BaseClass {
	
	public SportPage()
	{
		
	}
	
	public String pageName = "";
	public String relativeUrl = "";
	public String title = "Home - BBC Sport";
	public String url = "http://www.bbc.com/sport/0/";
	
	public void NavigateToHomePage()
	{
		SeleniumHelper.FindElement(By.cssSelector(".orb-nav-blocks a")).click();
	}
}
