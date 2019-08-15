package assignment.runpath.webapp.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import assignment.runpath.webapp.setup.Utils;

public class SearchPage extends BasePage {
	Utils elementUtil = null;
	By searchHeaderLocator = By.cssSelector(".page-title");

	public SearchPage() {
		elementUtil = new Utils();
	}

	public void verifyURL(String expectedUrl) {
		try {
			//elementUtil.waitForLoad(); // Wait for the page to load.
			//String actualURL = driver.getCurrentUrl();
			//Assert.assertTrue("Search page title didn't match", actualURL.equals(expectedUrl));
			elementUtil.waitForURLChange(expectedUrl);
		} catch (TimeoutException e) {
			Assert.assertTrue("Timeout in navigating to Searchpage.", false);
		} catch (Exception e) {
			Assert.assertTrue("Error in navigating to Searchpage.", false);
			e.printStackTrace();
		}
	}

	public void verifySearchHeader(String expectedTitle) {
		WebElement pageTitle;
		try {
			// elementUtil.unconditionalWait();
			pageTitle = elementUtil.loadElement(searchHeaderLocator);
			String actualTitle = pageTitle.getText();
			Assert.assertTrue("Search page title didn't match", actualTitle.equals(expectedTitle));
		} catch (TimeoutException e) {
			Assert.assertTrue("Timeout in finding Searchpage title.", false);
		} catch (Exception e) {
			Assert.assertTrue("Error at finding Searchpage title.", false);
			e.printStackTrace();
		}
	}
}
