package assignment.runpath.webapp.pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {

	private HomePage homepage;
	private String homepageurl = "https://www.runpathdigital.com/gas-electricity";

	public HomePageSteps() {
		this.homepage = new HomePage();
	}

	@And("^I navigate to the Web application URL$")
	public void i_navigate_to_the_web_application_url() {
		homepage.goToHomePage(homepageurl);
	}

	@When("^the page loading is complete$")
	public void the_page_loading_is_complete() {
		homepage.waitForPageLoad();
	}

	@Then("^the main header of the page is \"([^\"]*)\"$")
	public void the_main_header_of_the_page_is_compare_gas_electricity(String header) {
		homepage.verifyPageTitle(header);
	}

	@When("^the Postcode and Email text entry fields are not populated$")
	public void the_postcode_and_email_text_entry_fields_are_not_populated() {
		homepage.enterPostCode("");
	}

	@And("^I Click on FIND A BETTER DEAL button$")
	public void i_click_on_find_a_better_deal_button() {
		homepage.clickBetterDealButton();
	}

	@Then("^a validation error message: \"([^\"]*)\" is displayed$")
	public void a_validation_error_message_something_is_displayed(String errorMessage) {
		homepage.verifyErrorMessage(errorMessage);
	}

	@When("^the Postcode text entry field is populated with the text \"([^\"]*)\"$")
	public void the_postcode_text_entry_field_is_populated_with_the_text_something(String postcode) {
		homepage.enterPostCode(postcode);
	}

}
