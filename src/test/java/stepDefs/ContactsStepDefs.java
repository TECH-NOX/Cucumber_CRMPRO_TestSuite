package stepDefs;

import java.util.List;

import base.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;

public class ContactsStepDefs {

	private Base base;
	private LoginPage loginPage ;
	private HomePage homePage ;
	private ContactsPage contactsPage;

	public ContactsStepDefs(Base base) {
		this.base = base;
	}

	@Given("^user navigates to New Contacts page by hovering over Contacts tab$")
	public void user_navigates_to_New_Contacts_page_by_hovering_over_Contacts_tab() throws Throwable {
		loginPage = new LoginPage(base.driver);
		homePage = loginPage.login();
		contactsPage = homePage.navigateToContactsPage();
		contactsPage.clickCreateNewContactBtn();
	}

	@When("^user enters the below details$")
	public void user_enters_the_below_details(DataTable contactsDetails) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> raw = contactsDetails.raw();
		contactsPage.createNewContact("Dr.", raw.get(1).get(0), "mName", raw.get(1).get(1), "nickName", raw.get(1).get(3), raw.get(1).get(2));
		
	}

	@Then("^a new contact with the entered details should be created$")
	public void a_new_contact_with_the_entered_details_should_be_created() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
