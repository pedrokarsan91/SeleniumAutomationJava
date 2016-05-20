package StepDefinitions;

import org.junit.Assert;
import Helpers.SeleniumHelper;
import PageFactory.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BBCHomepageStepDefinition {
	
	@Given("^I am on the BBC website$")
	public void IAmOnTheBBCWebsite() throws InterruptedException {
		Pages.homepage().NavigateToBBC();
	}
	
	@When("^I navigate to \"([^\"]*)\"$")
	public void INavigateTo(String pageName) {
		Pages.homepage().NavigateToPage(pageName);
	}
	
	@Then("^I should be on the \"([^\"]*)\" page$")
	public void IShouldBeOnThePage(String pageName) {
		if(pageName.equals("Home"))
		{
			Assert.assertEquals(Pages.homepage().title, SeleniumHelper.GetPageTitle());
		}
		else if (pageName.equals("Sport"))
		{
			Assert.assertEquals(Pages.sportpage().title, SeleniumHelper.GetPageTitle());
		}
	}
}
