package StepDefinitions;

import java.net.MalformedURLException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import Helpers.SeleniumDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void TestStartUp() throws MalformedURLException {
    	SeleniumDriver.CreateDriver();
    }

    @After
    public void TestShutDown(Scenario scenario) {
        if(scenario.isFailed()) {
        	try {
        		scenario.write("Current Page URL is " + SeleniumDriver.Instance().getCurrentUrl());
        		byte[] screenshot = ((TakesScreenshot)SeleniumDriver.Instance()).getScreenshotAs(OutputType.BYTES);
        		scenario.embed(screenshot, "image/png");
        	} catch (WebDriverException somePlatformsDontSupportScreenshots) {
        		System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        	}
        }
        SeleniumDriver.Instance().quit();
    } 
}