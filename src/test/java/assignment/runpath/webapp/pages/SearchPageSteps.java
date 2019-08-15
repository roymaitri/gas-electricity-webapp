package assignment.runpath.webapp.pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageSteps {
	private SearchPage searchpage;
	private String searchpageurl = "https://www.runpathdigital.com/gas-electricity/step1";

	public SearchPageSteps() {
		this.searchpage = new SearchPage();
	}

	@Then("^the user is taken to a new search page with the following URL$")
	public void the_user_is_taken_to_a_new_search_page_with_the_following_url() {
		searchpage.verifyURL(searchpageurl);
	}

	@And("^the Heading text \"([^\"]*)\" is present$")
	public void the_heading_text_something_is_present(String headingText) {
		searchpage.verifySearchHeader(headingText);
	}
}
