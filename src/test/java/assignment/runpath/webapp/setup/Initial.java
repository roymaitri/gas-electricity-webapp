package assignment.runpath.webapp.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

public class Initial {
	public static WebDriver driver = null;

	@Given("^Initialize the webdriver$")
	public void initialize_the_webdriver() {
		setWebDriver();
	}

	public void setWebDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
		}
	}
}
