package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckOutPage;
import pages.EndPage;
import pages.HomePage;
import pages.Information;
import pages.LoginPage;
import utilities.ReadXLData;

public class TestCase_TC3_OrderBookTest extends BaseTest {

	@Test(dataProviderClass = ReadXLData.class, dataProvider = "validcredential")
	public static void orderTest(String username, String password) throws InterruptedException {

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
		HomePage home = new HomePage(driver);
		home.selectProduct();
		home.cartButtonClick();
		CartPage cart = new CartPage(driver);
		cart.clickCheckout();
		Information info = new Information(driver);
		info.enterFirstName();
		info.enterLastName();
		info.enterZipcode();
		info.clickContinue();
		CheckOutPage checkout = new CheckOutPage(driver);
		checkout.clickFinish();
		EndPage endpage = new EndPage(driver);
		Assert.assertEquals(endpage.getThankyouMessage(), "THANK YOU FOR YOUR ORDER");

	}

}
