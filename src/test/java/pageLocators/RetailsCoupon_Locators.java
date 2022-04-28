package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;

public class RetailsCoupon_Locators {

	@FindBy(xpath = "//*[@name='username']")
	public WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	public WebElement password;

	@FindBy(xpath = "//*[@class='btn btn-primary']")
	public WebElement submitButton;

	@FindBy(xpath = "//*[text()='Home']")
	public WebElement home;

	@FindBy(xpath = "//*[@class='fa fa-share-alt fw']")
	public WebElement couponMenu;

	@FindBy(xpath = "//*[@class='fa fa-share-alt fw']/../../ul/li[1]/a")
	public WebElement marketingLink;

	@FindBy(xpath = "//*[@class='fa fa-share-alt fw']/../../ul/li[3]/a")
	public WebElement couponLink;

	@FindBy(xpath = "//*[@class='fa fa-plus']/..")
	public WebElement addLink;

	@FindBy(xpath = "//input[@id='input-name']")
	public WebElement couponName;

	@FindBy(xpath = "//input[@id='input-code']")
	public WebElement codeTextField;

	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
	public WebElement saveCoupon;

	@FindBy(xpath = "//*[text()='123']/following-sibling::td[6]")
	public WebElement editButton;

	@FindBy(xpath = "//*[text()='123']/preceding-sibling::td/input")
	public WebElement checkboxToselectCoupon;

	@FindBy(xpath = "//*[@class=\"fa fa-trash-o\"]/..")
	public WebElement deleteButton;
	
	@FindBy(xpath = "//*[text()=' Success: You have modified coupons!      ']")
	public WebElement successMessage;
	

	public RetailsCoupon_Locators() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);

	}

}
