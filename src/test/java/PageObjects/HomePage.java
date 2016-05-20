package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helpers.SeleniumHelper;

public class HomePage extends BaseClass {

	@FindBy(how = How.ID, using = "idcta-link")
	private WebElement BtnSignIn;
	
	public HomePage()
	{
		
	}
	
	public void NavigateToSignIn()
	{
		SeleniumHelper.Click(BtnSignIn);
	}

	
	public String pageName = "";
	public String relativeUrl = "";
	public String title = "BBC - Home";
	public String url = "http://bbc.co.uk";
}
