package com.pageAction.qa;

import org.testng.Assert;

import com.pageLocator.qa.QA_homePageLocator;

import Qa.Util.QA_TestBase;

	public class QA_homePageAction extends QA_TestBase  {
	
	QA_homePageLocator homePageLocator = new QA_homePageLocator();
	
	
	
	//Search Page
	
	    public void Click_ON_SACUCE_LABS_BACKPACK  () {
		homePageLocator.Sauce_Labs_Backpack.click();
        }
	    
	    public void addingToBackPACK () {
		homePageLocator.addingbackpack.click();
        }
	    
	    public void CLICK_ON_BACK_TO_PRODUCTS () {
		homePageLocator.back_to_products.click();
        }
	    
	    public void CLICK_ON_SAUCE_LABS_BIKE_LIGHT () {
		homePageLocator.Sauce_Labs_Bike_Light.click();
	    }
	    
		public void addingToBackPACKagain () {
			homePageLocator.addingbackpack2.click();
	    }
		
		public void CLICK_ON_CART_SIGN_BY_TOP_CORNER () {
			homePageLocator.Shoppingcart_bge.click();
		}
		
		public void CLICK_ON_REMOVE_SAUCE_LABS_BIKE_LIGHT() {
			homePageLocator.remove_sauce_labs_bike_light.click();
		}
		
	   public void VARIFY_ITEM_ADDED_AND_REMOVED_TO_THE_CART_SUCCESSFULLY() {
		boolean verifyAddRemove_cart = homePageLocator.verified_add_remove_to_cart.isDisplayed();
		Assert.assertTrue(verifyAddRemove_cart);
	   }
		
	  //@swaglabs_checkout_page
	   
	   public void  CLICK_ON_CHECK_OUT() {
			homePageLocator.checKouT.click();
		    }
		    
	   public void userdetails(String a, String b, String c) {
		   homePageLocator.first_name.sendKeys("Scrum Team");
		   homePageLocator.last_Name.sendKeys("NY");
		   homePageLocator.postal_Code.sendKeys("12345");
			System.out.println("User Successfully Added First Last Name And Zip Code ");
	   }
	   
	   
			public void  CLICK_CONTINUE () {
				homePageLocator.conTinue.click();
			}
			
			public void CLICK_ON_FINISH() {
				homePageLocator.finish_hit.click();
			}
			
		   public void VERIFY_THE_CHECKOUT_HOMEPAGE () {
			boolean verifyCheckout = homePageLocator.order_completed.isDisplayed();
			Assert.assertTrue(verifyCheckout);
		   }
	   
	   
	   }
	
