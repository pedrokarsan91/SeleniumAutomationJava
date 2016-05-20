package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helpers.SeleniumHelper;

public class SignInPage extends BaseClass {
	
	@FindBy(how = How.LINK_TEXT, using = "register")
	private WebElement RegisterLink;
	
	public SignInPage() 
	{
		
	}
	
	public void NavigateToRegister()
	{
		SeleniumHelper.Click(RegisterLink);
	}

}
