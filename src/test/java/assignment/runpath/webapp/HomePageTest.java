package assignment.runpath.webapp;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"src/test/java/assignment/runpath/webapp/features/HomePage.feature"},
	        glue = {"assignment.runpath.webapp.pages","assignment.runpath.webapp.setup"},
	        plugin={"json:target/cucumber-reports/cucumber.json"}
	)
	public class HomePageTest {
	}

