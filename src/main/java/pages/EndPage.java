package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndPage {

	public WebDriver driver;

	@FindBy(xpath = "//h2[@class='complete-header']")
	WebElement thankyouMessage;

	public EndPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getThankyouMessage() {
		return thankyouMessage.getText();
	}

}
