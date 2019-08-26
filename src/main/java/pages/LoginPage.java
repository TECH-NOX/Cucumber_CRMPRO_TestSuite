package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.ReadProperties;
import utilities.ReusableMethods;

public class LoginPage {
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	@FindBy(name = "username")
	public WebElement userName_textInput_name ;
	
	@FindBy(name = "password")
	public WebElement password_textInput_name ;
	
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement login_button_xpath ;
	
	public HomePage login() {
		userName_textInput_name.clear();
		userName_textInput_name.sendKeys(ReadProperties.fecthProp().getProperty("username"));
		password_textInput_name.clear();
		password_textInput_name.sendKeys(ReadProperties.fecthProp().getProperty("password"));
		ReusableMethods.javaScriptExecutorClick(driver, login_button_xpath);
		return new HomePage(driver);
	}
	
	public HomePage login(String uname, String pWord) {
		userName_textInput_name.clear();
		userName_textInput_name.sendKeys(uname);
		password_textInput_name.clear();
		password_textInput_name.sendKeys(pWord);
		ReusableMethods.javaScriptExecutorClick(driver, login_button_xpath);
		return new HomePage(driver);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
		
	}

}
