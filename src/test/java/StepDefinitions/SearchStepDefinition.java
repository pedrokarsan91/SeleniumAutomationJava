package StepDefinitions;

import org.junit.Assert;

import PageFactory.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefinition {
	
	@When("^I search for \"(.*?)\"$")
	public void ISearchFor(String keyword) {
		Pages.homepage().Search(keyword);
	}
	
	@Then("^I should see a list of articles related to \"(.*?)\"$")
	public void IShouldSeeAListOfArticlesRelatedTo(String keyword) {
		Pages.searchpage().DoesArticleTitleListContainKeyword(keyword);
	}
	
	@When("^I open an article$")
	public void IOpenAnArticle() {
		Pages.searchpage().OpenArticle();
	}

	@Then("^I should be on the correct article$")
	public void IShouldBeOnTheCorrectArticle() {
		Pages.searchpage().IsOnCorrectArticle();
	}
}
