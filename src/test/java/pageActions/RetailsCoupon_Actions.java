package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import pageLocators.RetailsCoupon_Locators;
import utils.SeleniumDriver;

public class RetailsCoupon_Actions {
	public static WebDriver driver;
	RetailsCoupon_Locators hL = new RetailsCoupon_Locators();

	public void enterUserName() {
		hL.username.sendKeys("Admin");
	}

	public void enterPassword() {
		hL.password.sendKeys("Admin@123");
	}

	public void clickOnSubmitButton() {
		hL.submitButton.click();
	}

	public void validateHome() {
		hL.home.isDisplayed();
	}

	public void clickOnCoupon() {
		hL.couponMenu.click();
		Actions builder = new Actions(SeleniumDriver.getDriver());

		builder.moveToElement(hL.marketingLink).perform();

		hL.couponLink.click();
	}
	
	public void validateAddCouponHomePage() {
		Assert.assertTrue(hL.addLink.isDisplayed());
	}


	public void clickAddCoupon() {
		hL.addLink.click();
	}

	public void enterCouponName() {
		hL.couponName.sendKeys("123");
	}

	public void enterCouponCode() {
		hL.codeTextField.sendKeys("123");
	}

	public void clickOnSaveButton() {
		hL.saveCoupon.click();
	}

	public void clickOnEditCoupon() {
		hL.editButton.click();
	}

	public void reEnterCouponCode() {
		hL.codeTextField.sendKeys("1234");
	}

	public void selectCouponToDelete() {
		hL.checkboxToselectCoupon.click();
	}

	public void clickOnDeleteCoupon() {
		hL.deleteButton.click();
	}

	public void verifyDeleteSuccessMessage() {
		Assert.assertTrue(hL.successMessage.isDisplayed());
	}
}
