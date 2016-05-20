package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helpers.SeleniumDriver;
import Helpers.SeleniumHelper;

public abstract class BaseClass {
	
	public String pageName = "";
	public String relativeUrl = "";
	public String title = "";
	public String url = "";
	
	public void NavigateToBBC() throws InterruptedException
	{
		SeleniumHelper.GoToUrl("http://www.bbc.co.uk");
	}
	
	public void NavigateToPage(String linkText)
	{
		SeleniumDriver.Instance().findElement(By.linkText(linkText)).click();
	}
	
	public void Search(String keyword)
	{	
		SeleniumHelper.FindElement(By.id("orb-search-q")).sendKeys(keyword);
		SeleniumHelper.FindElement(By.id("orb-search-button")).click();
	}
}
