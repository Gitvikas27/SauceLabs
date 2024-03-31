package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.ReadXLData;

public class TestCse_TC2_MultipleLoginTest extends BaseTest {

	@Test(dataProviderClass = ReadXLData.class, dataProvider = "multiplelogin")
	public void loginTest(String username, String password) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();

	}

}
