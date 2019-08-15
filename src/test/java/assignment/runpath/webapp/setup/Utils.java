package assignment.runpath.webapp.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	private WebDriver driver;
	private WebDriverWait wait;
	private int timeout = 5; // seconds

	public Utils() {
		this.driver = Initial.driver;
		wait = new WebDriverWait(driver, timeout);
	}

	public WebElement loadButton(By locator) throws Exception {
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return elem;
	}

	public WebElement loadElement(By locator) throws Exception {
		WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return elem;
	}

	public void unconditionalWait(int timeout_ms) {
		try {
			Thread.sleep(timeout_ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForURLChange(String newURL) throws Exception {
		wait.until(ExpectedConditions.urlToBe(newURL));
	}
	
	public void waitForLoad() {
		ExpectedCondition<Object> condition = ExpectedConditions
				.jsReturnsValue("return document.readyState==\"complete\";");
		wait.until(condition);
	}

}
