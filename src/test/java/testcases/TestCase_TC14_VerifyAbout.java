package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AboutPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReadXLData;

public class TestCase_TC14_VerifyAbout extends BaseTest {
	@Test(dataProviderClass = ReadXLData.class, dataProvider = "validcredential")
	public void verifyAboutNavigation(String username, String password) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
		HomePage home = new HomePage(driver);
		home.clickMenu();
		home.clickAbout();
		AboutPage about = new AboutPage(driver);
		Assert.assertEquals(about.getAboutActualUrl(), AboutPage.EXPECTED_ABOUTURL);

	}
}
