package pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	String expectedProductsTitle = "Products";

	public static final String EXPECTED_URL = "https://www.saucedemo.com/v1/index.html";

	@FindBy(xpath = "//div[@class='product_label']")
	WebElement actualProductsTitle;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	WebElement addToCart;

	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'][normalize-space()='ADD TO CART'])[1]")
	WebElement product;

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	WebElement cartButton;

	@FindBy(xpath = "//button[normalize-space()='Open Menu']")
	WebElement menu;

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logout;

	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement logo;

	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	WebElement about;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getProducTitle() {
		return actualProductsTitle.getText();

	}

	public void selectProduct() {
		product.click();
	}

	public void cartButtonClick() {
		cartButton.click();
	}

	public void clickMenu() {
		menu.click();
	}

	public void clickLogout() {
		logout.click();
	}

	public void getLogo() {
		logo.getText();
		System.out.println(logo.getText());
	}

	public void clickAbout() {
		about.click();
	}

}
