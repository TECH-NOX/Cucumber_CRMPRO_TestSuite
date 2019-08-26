package stepDefs;

import org.junit.Assert;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;

public class LoginStepDefs {

	private Base base;

	public LoginStepDefs(Base base) {
		this.base = base;
	}

	@Given("^user is in CRMPro Url$")
	public void user_is_in_CRMPro_Url() throws Throwable {
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",
				base.driver.getTitle());
	}

	@Then("^user provides valid username and password and logs-in to Home Page$")
	public void user_provides_valid_username_and_password_and_logs_in_to_Home_Page() throws Throwable {

		LoginPage loginPage = new LoginPage(base.driver);
		loginPage.login();
	}

	@Then("^user validates the title and username in HomePage$")
	public void user_validates_the_title_and_username_in_HomePage() throws Throwable {
		System.out.println(base.driver.getTitle());
		base.driver.quit();
	}

}
