package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {

	WebDriver driver;

	public static final String EXPECTED_ABOUTURL = "https://saucelabs.com/";

	public AboutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getAboutActualUrl() {
		return driver.getCurrentUrl();
	}

	public static String expectAboutUrl() {
		return EXPECTED_ABOUTURL;
	}

}
