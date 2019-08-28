package testRunner;

import org.junit.After;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feats/Login.feature"}, 
		glue = {"stepDefs" }, 
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty", "html:target/HtmlReport",
				  "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/LoginFeaturereport.html" })
public class LoginTestRunner {

	@After
	public void generateExtentReports() {
		Reporter.loadXMLConfig(System.getProperty("user.dir") + "/src/main/java/config/extentReports.xml");
	}

}
