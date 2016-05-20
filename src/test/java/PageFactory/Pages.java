package PageFactory;

import org.openqa.selenium.support.PageFactory;

import Helpers.SeleniumHelper;
import PageObjects.HomePage;
import PageObjects.RegisterPage;
import PageObjects.SearchPage;
import PageObjects.SignInPage;
import PageObjects.SportPage;

public class Pages {

	public static HomePage homepage()
	{
		return PageFactory.initElements(SeleniumHelper.GetDriver(), HomePage.class);
	}
	
	public static SportPage sportpage()
	{
		return PageFactory.initElements(SeleniumHelper.GetDriver(), SportPage.class);
	} 
	
	public static SearchPage searchpage()
	{
		return PageFactory.initElements(SeleniumHelper.GetDriver(), SearchPage.class);
	} 
	
	public static SignInPage signinpage()
	{
		return PageFactory.initElements(SeleniumHelper.GetDriver(), SignInPage.class);
	}
	
	public static RegisterPage registerpage()
	{
		return PageFactory.initElements(SeleniumHelper.GetDriver(), RegisterPage.class);
	}
}
