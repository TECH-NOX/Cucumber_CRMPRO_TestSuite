package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ReusableMethods;

public class ContactsPage {

	private WebDriver driver;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Search Contacts elements
	@FindBy(xpath = "//a[@title='Calendar']")
	public WebElement status_dropDown_name;

	@FindBy(name = "cs_category")
	public WebElement category_dropDown_name;

	@FindBy(name = "cs_name")
	public WebElement name_text_name;

	@FindBy(name = "cs_company_name")
	public WebElement comapanyName_text_name;

	@FindBy(name = "cs_email")
	public WebElement email_text_name;

	@FindBy(name = "cs_notes")
	public WebElement notes_text_name;

	// New Contact Elements

	@FindBy(xpath = "//input[@type = 'button' and @value ='New Contact']")
	public WebElement newContact_btn_xpath;

	@FindBy(id = "first_name")
	public WebElement firstName_text_id;

	@FindBy(id = "middle_initial")
	public WebElement midName_text_id;

	@FindBy(id = "surname")
	public WebElement lastName_text_id;

	@FindBy(name = "nickname")
	public WebElement nickName_text_name;

	@FindBy(name = "client_lookup")
	public WebElement company_text_name;

	@FindBy(id = "email")
	public WebElement email_text_id;

	@FindBy(xpath = "//form[@id='contactForm']//input[@type = 'submit' and @value ='Save']")
	public WebElement save_btn_xpath;

	@FindBy(css = "select[name='title']")
	public WebElement title_dropDown_css;

//	Assertions Xpath

	String prefixNewContact_value_xpath = "//table[@class='datacard']//td[@class='datacardtitle'][contains(text(),'";
	String suffixNewContact_value_xpath = "')]";
	String newContactName = "";

	By newContact_value_xpath = By.xpath(prefixNewContact_value_xpath + newContactName + suffixNewContact_value_xpath);

	public void clickCreateNewContactBtn() {
		newContact_btn_xpath.click();
	}

	public void createNewContact(String title, String fName, String mName, String lName, String nickName,
			String company, String mail) {

		ReusableMethods.selectDropDownValue(title_dropDown_css, title);

		firstName_text_id.clear();
		firstName_text_id.sendKeys(fName);
		midName_text_id.clear();
		midName_text_id.sendKeys(mName);
		lastName_text_id.clear();
		lastName_text_id.sendKeys(lName);
		nickName_text_name.clear();
		nickName_text_name.sendKeys(nickName);
		company_text_name.clear();
		company_text_name.sendKeys(company);
		email_text_id.clear();
		email_text_id.sendKeys(mail);
		save_btn_xpath.click();
	}

	public String getNewAddedContact(String title, String fName, String lName) {
		newContactName = title + " " + fName + " " + lName;
		return driver.findElement(newContact_value_xpath).getText().trim();
	}

}
