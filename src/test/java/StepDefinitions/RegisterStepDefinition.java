package StepDefinitions;

import org.testng.Assert;
import PageFactory.Pages;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition {

	@Given("^I navigate to register$")
	public void INavigateToRegister() {
	    Pages.homepage().NavigateToSignIn();
	    Pages.signinpage().NavigateToRegister();
	}

	@When("^I register with the following details$")
	public void IRegisterWithTheFollowingDetails(DataTable registerDetails) throws InterruptedException {
		Pages.registerpage().EnterRegistrationDetails(registerDetails);
	}

	@Then("^my account should be created$")
	public void MyAccountShouldBeCreated() {
		Assert.assertTrue(Pages.registerpage().IsRegistrationComplete());
	}
	
	@Then("^I should see the error message \"(.*?)\"$")
	public void IShouldSeeTheErrorMessage(String errorMessage) {
	    Pages.registerpage().DoesErrorMessageExist(errorMessage);
	}
}
