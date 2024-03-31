package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement zipcode;

	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement continueButton;

	public Information(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName() {
		firstName.sendKeys("ashok");
	}

	public void enterLastName() {
		lastName.sendKeys("sharma");
	}

	public void enterZipcode() {
		zipcode.sendKeys("575412");
	}

	public void clickContinue() {
		continueButton.click();
	}
}
