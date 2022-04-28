package stepDef;


import org.openqa.selenium.Alert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.RetailsCoupon_Actions;
import utils.SeleniumDriver;

public class stepDef {

	RetailsCoupon_Actions hA = new RetailsCoupon_Actions();

	@Given("I am on retail login page")
	public void i_am_on_retail_login_page() {
	    SeleniumDriver.getDriver().get("http://retailm1.upskills.in/admin");
	    
	}
	@When("I enter username and password")
	public void i_enter_username_and_password() {
		hA.enterUserName();
	    hA.enterPassword();
	    
	}
	@When("I click on submit")
	public void i_click_on_submit() {
	    hA.clickOnSubmitButton();
	    
	}
	@Then("I should see retail home page")
	public void i_should_see_retail_home_page() {
	    hA.validateHome();
	    
	}
	@When("I click on Coupon link")
	public void i_click_on_coupon_link() {
	    hA.clickOnCoupon();
	    
	}
	@Then("I should see Coupon page")
	public void i_should_see_coupon_page() {
	    
	    hA.validateAddCouponHomePage();
	}
	
	@When("I click on Add Coupon button")
	public void i_click_on_add_coupon_button() {
		hA.clickAddCoupon();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("I should be able to add coupon")
	public void i_should_be_able_to_add_coupon() {
	   hA.enterCouponName();
	   hA.enterCouponCode();
	   hA.clickOnSaveButton();
	   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("I click edit coupon")
	public void i_click_edit_coupon() {
	    hA.clickOnEditCoupon();
	}
	@Then("I should be able to edit coupon")
	public void i_should_be_able_to_edit_coupon() {
	   hA.reEnterCouponCode();
	   hA.clickOnSaveButton();
	  
	   
	}
	@When("I select a coupon and click delete coupon")
	public void i_select_a_coupon_and_click_delete_coupon() {
		hA.selectCouponToDelete();
	    hA.clickOnDeleteCoupon();
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   SeleniumDriver.getDriver().switchTo().alert().accept();
	}
	@Then("I should see coupon got deleted")
	public void i_should_see_coupon_got_deleted() {
		hA.verifyDeleteSuccessMessage();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
