package com.pageLocator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Qa.Util.QA_TestBase;

public class QA_loginPageLocator extends QA_TestBase{
	
public QA_loginPageLocator() {
		
		PageFactory.initElements(driver, this);	
	}

//@Login

	
	@FindBy(how=How.ID, using="user-name")
	public WebElement username_id;
	
	@FindBy(how=How.NAME, using="password")
	public WebElement Password_name;
	
	@FindBy(how=How.ID, using="login-button")
	public WebElement login_id;
	
	@FindBy(how=How.XPATH, using="//span[@class='title']")
	public WebElement verified_loginpage;
}

