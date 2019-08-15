package assignment.runpath.webapp.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import assignment.runpath.webapp.setup.Utils;

public class HomePage extends BasePage {

	Utils elementUtil = null;

	By mainHeaderLocator = By.cssSelector("span[data-bind='text: pageTitle']");
	By postcodeLocator = By.cssSelector("#postCode");
	By emailLocator = By.cssSelector("#emailAddress");
	By findABetterDealLocator = By.cssSelector("#landingNext");
	By postcodeErrorMessageLocator = By.cssSelector(".input-error.color-alert");

	public HomePage() {
		elementUtil = new Utils();
	}

	void goToHomePage(String URL) {
		driver.get(URL);
	}

	void waitForPageLoad() {
		elementUtil.waitForLoad();
	}

	void clickBetterDealButton() {
		try {
			WebElement button = elementUtil.loadButton(findABetterDealLocator);
			button.click();
		} catch (TimeoutException e) {
			Assert.assertTrue("Timeout finding the better deal button.", false);
		} catch (Exception e) {
			Assert.assertTrue("Error at clicking better deal button.", false);
			e.printStackTrace();
		}
	}

	void enterPostCode(String postcode) {
		driver.findElement(postcodeLocator).clear();
		driver.findElement(postcodeLocator).sendKeys(postcode);
		elementUtil.unconditionalWait(1000);
	}

	void verifyPageTitle(String expectedTitle) {
		try {
			WebElement pageTitle = elementUtil.loadElement(mainHeaderLocator);
			String actualTitle = pageTitle.getText();
			Assert.assertTrue("Page title didn't match", actualTitle.equals(expectedTitle));
		} catch (TimeoutException e) {
			Assert.assertTrue("Timeout in finding Homepage title.", false);
		} catch (Exception e) {
			Assert.assertTrue("Error at finding Homepage title.", false);
			e.printStackTrace();
		}

	}

	void verifyErrorMessage(String expectedError) {
		try {
			WebElement postcodeErrorMessage = elementUtil.loadElement(postcodeErrorMessageLocator);
			String actualErrorMessage = postcodeErrorMessage.getText();
			Assert.assertTrue("Error message didn't match", actualErrorMessage.contains(expectedError));
		} catch (TimeoutException e) {
			Assert.assertTrue("Timeout finding the error message.", false);
		} catch (Exception e) {
			Assert.assertTrue("Error at finding the error message.", false);
			e.printStackTrace();
		}
	}
}
