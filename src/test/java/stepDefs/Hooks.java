package stepDefs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import base.Base;
import config.ReadProperties;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReusableMethods;
import utilities.UtilityVariables;

public class Hooks {

	private Base base;

	public Hooks(Base base) {
		this.base = base;
	}

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().version("76.0.3809").setup();
		base.driver = new ChromeDriver();
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().pageLoadTimeout(UtilityVariables.PAGELOAGD_TIMEOUTS, TimeUnit.SECONDS);
		base.driver.manage().timeouts().implicitlyWait(UtilityVariables.IMPLICIT_WAIT_TIMEOUTS, TimeUnit.SECONDS);
		base.driver.get(ReadProperties.fecthProp().getProperty("url"));
		Reporter.assignAuthor("TECHNOX");
		Reporter.setSystemInfo("machine", "MacBook Air");
		Reporter.setSystemInfo("Java Version", "1.8");
		Reporter.setSystemInfo("Selenium Version", "3.141.59");
	}

	@After(order = 1)
	public void extentReportScreenshotForFailedTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				String screenShotName = scenario.getName().replace(" ", "_");
				String screenshotPath = System.getProperty("user.dir") + "/target/cucumber-reports/Screenshots/"
						+ screenShotName + ".png";
				ReusableMethods.screenCapture(base.driver, screenshotPath);
				Reporter.addScreenCaptureFromPath(screenshotPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@After(order = 0)
	public void tearDown() {
		base.driver.quit();
	}

}
