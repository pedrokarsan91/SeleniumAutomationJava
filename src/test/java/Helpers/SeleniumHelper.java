package Helpers;

import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumHelper {

	public static WebElement FindElement(By by)
	{
		return SeleniumDriver.Instance().findElement(by);
	}
	
	public static List<WebElement> FindElements(By by)
	{
		return SeleniumDriver.Instance().findElements(by);
	}
	
	public static void GoToUrl(String url)
	{
		SeleniumDriver.Instance().navigate().to(url);
	}
	
	public static String GetPageTitle()
	{
		return SeleniumDriver.Instance().getTitle();
	}
	
	public static String GetText(WebElement element)
	{
		try
		{
			return element.getText();
		}
		catch (NoSuchElementException exception)
		{
			return "";
		}
	}
	
	public static boolean UrlContaints(String value)
	{
		return SeleniumDriver.Instance().getCurrentUrl().contains(value);
	}
	
	public static String GetUrl()
	{
		return SeleniumDriver.Instance().getCurrentUrl();
	}
	
	public static void PressEnter(WebElement element)
	{
		try
		{
			if(element == null)
			{
				return;
			}
			else
			{
				element.sendKeys(Keys.RETURN);
			}
		}
		catch(NullPointerException exception)
		{
			throw exception;
		}
	}
	
	public static void AssertIsTextPresent(WebElement element, String expectedText)
	{
		boolean isPresent = element != null && element.getText().contains(expectedText);
		Assert.assertTrue(isPresent);
	}
	
	public static String GetAttributeValue(WebElement element, String attributeName)
	{
		if(element == null)
		{
			return "Element is null";
		}
		else
		{
			return element.getAttribute(attributeName);
		}
		//return element != null ? element.getAttribute(attributeName) : "";
	}
	
	public static void ContextClick(WebElement element)
	{
		Actions action = new Actions(SeleniumDriver.Instance()).contextClick(element);
		action.build().perform();
	}
	
	public static WebDriver GetDriver()
	{
		return SeleniumDriver.Instance();
	}
	
	public static void SwitchFrameBySelector(By by)
	{
		SeleniumDriver.Instance().switchTo().frame(SeleniumDriver.Instance().findElement(by));
	}
	
	public static void Click(WebElement element)
	{
		try
		{
			element.click();
		}
		catch(Exception exception)
		{
			throw exception;
		}
	}
	
	public static boolean IsDisplayed(WebElement element)
	{
		try
		{
			return element.isDisplayed();
		}
		catch(NoSuchElementException exception)
		{
			throw exception;
		}
	}
	
	public static boolean IsEnabled(WebElement element)
	{
		try
		{
			return element.isEnabled();
		}
		catch(NoSuchElementException exception)
		{
			throw exception;
		}
	}
	
	public static boolean IsSelected(WebElement element)
	{
		try
		{
			return element.isSelected();
		}
		catch(NoSuchElementException exception)
		{
			throw exception;
		}
	}
	
	public static void Wait() throws InterruptedException
	{
		Thread.sleep(1500);
	}
	
	public static void SendKeys(WebElement element, String input)
	{
		try
		{
			if(element == null || input == null)
			{
				return;
			}
			else
			{
				element.clear();
				element.sendKeys(input);
			}
		}
		catch(NullPointerException exception)
		{
			throw exception;
		}
	}
	
	public static void ClearText(WebElement element)
	{
		element.clear();
	}
	
	public static String GetCssValue(WebElement element, String cssValue)
	{
		return element.getCssValue(cssValue);
	}
	
	public static String GetElementText(WebElement element)
	{
		return element.getText();
	}
}
