package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public static final String EXPECTED_URL = "https://www.saucedemo.com/v1/index.html";

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usrname;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwd;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username) {
		usrname.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwd.sendKeys(password);
	}

	public void clickLoginButton() {
		login.click();

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	public static String expectedUrl() {
		return EXPECTED_URL;
	}

}
