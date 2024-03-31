package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReadXLData;

public class TestCase_TC10_LogoutTest extends BaseTest {

	@Test(dataProviderClass = ReadXLData.class, dataProvider = "validcredential")
	public void logout(String username, String password) throws InterruptedException {

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
		HomePage home = new HomePage(driver);
		home.clickMenu();
		home.clickLogout();
		loginpage.getCurrentUrl();
		Assert.assertEquals(loginpage.getCurrentUrl(), LoginPage.EXPECTED_URL);
	}

}
