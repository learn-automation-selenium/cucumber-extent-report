package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.GoogleSearch;

public class GoogleSearchSteps extends GoogleSearch {

	@Given("^chrome browser open$")
	public void chrome_browser_open() throws Throwable {
		launchBrowser();
	}

	@Given("^google url is launched$")
	public void google_url_is_launched() throws Throwable {
		launchGoogle();
	}

	@When("^google search page loaded successfully$")
	public void google_search_page_loaded_successfully() throws Throwable {
		 searchBoxVisibility();
	}

	@Then("^enter search item \"([^\"]*)\"$")
	public void enter_search_item(String searchString) throws Throwable {
		enterSearchBoxVisibility(searchString);
	}
}
