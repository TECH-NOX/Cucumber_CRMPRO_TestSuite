package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ReusableMethods;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Calendar']")
	public WebElement calendar_btn_xpath;

	@FindBy(xpath = "//a[@title='Companies']")
	public WebElement companies_btn_xpath;

	@FindBy(xpath = "//a[@title='Contacts']")
	public WebElement contacts_btn_xpath;

	@FindBy(xpath = "//a[@title='Deals']")
	public WebElement deals_btn_xpath;

	@FindBy(xpath = "//a[@title='Tasks']")
	public WebElement tasks_btn_xpath;

	@FindBy(xpath = "//a[@title='Cases']")
	public WebElement cases_btn_xpath;

	@FindBy(xpath = "//a[@title='Call']")
	public WebElement call_btn_xpath;

	@FindBy(xpath = "//a[@title='Email']")
	public WebElement email_btn_xpath;

	@FindBy(xpath = "//a[@title='Text/SMS']")
	public WebElement text_SMS_btn_xpath;

	@FindBy(xpath = "//a[@title='Print']")
	public WebElement print_btn_xpath;

	@FindBy(xpath = "//a[@title='Campaigns']")
	public WebElement campaigns_btn_xpath;

	@FindBy(xpath = "//a[@title='Docs']")
	public WebElement docs_btn_xpath;

	@FindBy(xpath = "//a[@title='Forms']")
	public WebElement forms_btn_xpath;

	@FindBy(xpath = "//a[@title='Reports']")
	public WebElement reports_btn_xpath;

	@FindBy(xpath = "//td[@class='headertext' and contains(text(),'tech nox')]")
	public WebElement username_text_xpath;

	public void navigateToCalendarPage() {
		ReusableMethods.switchtoFrame(driver, "mainpanel");
		calendar_btn_xpath.click();
	}

	public ContactsPage navigateToContactsPage() {
		ReusableMethods.switchtoFrame(driver, "mainpanel");
		contacts_btn_xpath.click();
		return new ContactsPage(driver);
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getHomePageUserName() {
		ReusableMethods.explitWaitForElements(driver, 10, username_text_xpath);
		return username_text_xpath.getText().trim();
	}

}