package stepDefs;

import org.junit.Assert;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReusableMethods;

public class HomePageStepdefs {

	private Base base;
	private LoginPage loginPage ;
	private HomePage homePage ;
	
	public HomePageStepdefs(Base base) {
		this.base = base;
	}
	
	@Given("^user logs in to CRMPRO site$")
	public void user_logs_in_to_CRMPRO_site() throws Throwable {
		loginPage = new LoginPage(base.driver);
		homePage = loginPage.login();
	}

	@Then("^user should be able to see username at the upper left corner$")
	public void user_should_be_able_to_see_username_at_the_upper_left_corner() throws Throwable {
		ReusableMethods.switchtoFrame(base.driver, "mainpanel");
		Assert.assertEquals("User: tech nox", homePage.getHomePageUserName());
	}
}
