package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReadXLData;

public class TestCase_TC1_VerifyLogin extends BaseTest {

	@Test(dataProviderClass = ReadXLData.class, dataProvider = "validcredential")
	public void getTitle(String username, String password) throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
		HomePage home = new HomePage(driver);
		Assert.assertEquals(home.getProducTitle(), "Products");

	}

}
