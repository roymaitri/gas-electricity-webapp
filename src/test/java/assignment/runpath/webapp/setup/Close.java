package assignment.runpath.webapp.setup;

import cucumber.api.java.en.Then;

public class Close {
	@Then("^Quit the webdriver$")
	public void quit_the_webdriver() {
		quitWebDriver();
	}

	public void quitWebDriver() {
		Initial.driver.quit();
	}
}
