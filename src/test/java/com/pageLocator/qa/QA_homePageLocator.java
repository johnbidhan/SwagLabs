package com.pageLocator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Qa.Util.QA_TestBase;

public class QA_homePageLocator extends QA_TestBase{
public QA_homePageLocator() {
		
		PageFactory.initElements(driver, this);	
	}

//@Ap_add_reomve_ToCart

	@FindBy(how=How.XPATH, using="//div[text()='Sauce Labs Backpack']")
	public WebElement Sauce_Labs_Backpack;
	
	@FindBy(how=How.XPATH, using="//button[@data-test='add-to-cart-sauce-labs-backpack']")
	public WebElement addingbackpack;
	
	@FindBy(how=How.ID, using="back-to-products")
	public WebElement back_to_products;
	
	@FindBy(how=How.XPATH, using="//div[text()='Sauce Labs Bike Light']")
	public WebElement Sauce_Labs_Bike_Light;
	
	@FindBy(how=How.NAME, using="add-to-cart-sauce-labs-bike-light")
	public WebElement addingbackpack2;
	
	@FindBy(how=How.XPATH, using="//span[@class='shopping_cart_badge']")
	public WebElement Shoppingcart_bge;
	
	@FindBy(how=How.NAME, using="remove-sauce-labs-bike-light")
	public WebElement remove_sauce_labs_bike_light;
	
	@FindBy(how=How.XPATH, using="//span[text()='Your Cart']")
	public WebElement verified_add_remove_to_cart;
	
	//@swaglabs_checkout_page
	
	@FindBy(how=How.NAME, using="checkout")
	public WebElement checKouT;
	
	@FindBy(how=How.NAME, using="firstName")
	public WebElement first_name;
	
	@FindBy(how=How.NAME, using="lastName")
	public WebElement last_Name;
	
	@FindBy(how=How.NAME, using="postalCode")
	public WebElement postal_Code;
	
	@FindBy(how=How.NAME, using="continue")
	public WebElement conTinue;
	
	
	@FindBy(how=How.ID, using="finish")
	public WebElement finish_hit;
	
	@FindBy(how=How.XPATH, using="//h2[text()='THANK YOU FOR YOUR ORDER']")
	public WebElement order_completed;
}
	