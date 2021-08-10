package sstepDefinationn;

import com.pageAction.qa.QA_homePageAction;

import Qa.Util.QA_TestBase;
import Qa.Util.Qa_Util;
import cucumber.api.java.en.Then;

public class QA_homeStepDefination extends QA_TestBase{
	
	QA_homePageAction qA_homePageAction = new QA_homePageAction();
	
	@Then("^Click ON SACUCE LABS BACKPACK$")
	public void click_ON_SACUCE_LABS_BACKPACK() throws Throwable {
		qA_homePageAction.Click_ON_SACUCE_LABS_BACKPACK();
		Thread.sleep(5000);
	}

	@Then("^CLICK ON ADD TO CART$")
	public void click_ON_ADD_TO_CART() throws Throwable {
		qA_homePageAction.addingToBackPACK();
		Thread.sleep(5000);
	}

	@Then("^CLICK ON BACK TO PRODUCTS$")
	public void click_ON_BACK_TO_PRODUCTS() throws Throwable {
		qA_homePageAction.CLICK_ON_BACK_TO_PRODUCTS();
		Thread.sleep(5000);
	}

	@Then("^CLICK ON SAUCE LABS BIKE LIGHT$")
	public void click_ON_SAUCE_LABS_BIKE_LIGHT() throws Throwable {
		qA_homePageAction.CLICK_ON_SAUCE_LABS_BIKE_LIGHT();
		Thread.sleep(5000);
	}
	
	@Then("^CLICK ON ADD TO CART AGAIN$")
	public void click_ON_ADD_TO_CART_AGAIN() throws Throwable {
		qA_homePageAction.addingToBackPACKagain();
		Thread.sleep(5000);
	}
	
	@Then("^CLICK ON CART SIGN BY TOP CORNER$")
	public void click_ON_CART_SIGN_BY_TOP_CORNER() throws Throwable {
		qA_homePageAction.CLICK_ON_CART_SIGN_BY_TOP_CORNER();
		Thread.sleep(5000);
	}

	@Then("^CLICK ON REMOVE SAUCE LABS BIKE LIGHT$")
	public void click_ON_REMOVE_SAUCE_LABS_BIKE_LIGHT() throws Throwable {
		qA_homePageAction.CLICK_ON_REMOVE_SAUCE_LABS_BIKE_LIGHT();
		Thread.sleep(5000);
	}

	@Then("^VARIFY ITEM ADDED AND REMOVED TO THE CART SUCCESSFULLY$")
	public void varified_ITEM_ADDED_AND_REMOVED_TO_THE_CART_SUCCESSFULLY() throws Throwable {
		qA_homePageAction.VARIFY_ITEM_ADDED_AND_REMOVED_TO_THE_CART_SUCCESSFULLY();
		Thread.sleep(5000);

	}

	//@swaglabs_checkout_page
	
	@Then("^CLICK ON CHECK OUT$")
	public void click_ON_CHECK_OUT() throws Throwable {
		qA_homePageAction.CLICK_ON_CHECK_OUT();
		Thread.sleep(5000);
	}

	@Then("^FIRST NAME LAST NAME AND ZIP CODE$")
	public void first_NAME_LAST_NAME_AND_ZIP_CODE() throws Throwable {
		qA_homePageAction.userdetails(properti.getProperty("fname"),properti.getProperty("lname"),properti.getProperty("zip")); 
		Thread.sleep(5000);
	
	}

	@Then("^CLICK CONTINUE$")
	public void click_CONTINUE() throws Throwable {
		qA_homePageAction.CLICK_CONTINUE();
		Thread.sleep(5000);
	}

	@Then("^CLICK ON FINISH$")
	public void click_ON_FINISH() throws Throwable {
		qA_homePageAction.CLICK_ON_FINISH();
		Thread.sleep(5000);
	}

	@Then("^VERIFY THE CHECKOUT HOMEPAGE$")
	public void verify_THE_CHECKOUT_HOMEPAGE() throws Throwable {
		qA_homePageAction.VERIFY_THE_CHECKOUT_HOMEPAGE();
		Thread.sleep(5000);
		Qa_Util.takescreenshot(driver, "Checkout Result Page");
	}
	
	
	
	
}
