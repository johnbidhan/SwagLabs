package com.pageAction.qa;

import org.testng.Assert;

import com.pageLocator.qa.QA_loginPageLocator;

import Qa.Util.QA_TestBase;

public class QA_loginPageAction extends QA_TestBase  {
	
	QA_loginPageLocator qA_loginPageLocator = new QA_loginPageLocator();
	
	//loginPage
	
	public void userinformation(String a, String b) {
		qA_loginPageLocator.username_id.sendKeys("standard_user");
		qA_loginPageLocator.Password_name.sendKeys("secret_sauce");
		qA_loginPageLocator.login_id.click();
		System.out.println("User Successfully logged In with valid user id and password");
		
	}
	
	public void verifiedloginpage() {
	boolean loginverification_swag = qA_loginPageLocator.verified_loginpage.isDisplayed();
	Assert.assertTrue(loginverification_swag);
	System.out.println("Login Page Verified");
	
	}
	
}