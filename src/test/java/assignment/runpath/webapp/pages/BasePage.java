package assignment.runpath.webapp.pages;

import org.openqa.selenium.WebDriver;

import assignment.runpath.webapp.setup.Initial;

public class BasePage {
	 WebDriver driver;

    public BasePage() {
        this.driver = Initial.driver;
    }
}
