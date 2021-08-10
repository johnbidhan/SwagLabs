package sstepDefinationn;

import com.pageAction.qa.QA_homePageAction;
import com.pageAction.qa.QA_loginPageAction;

import Qa.Util.QA_TestBase;
import Qa.Util.Qa_Util;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class QA_loginStepDefination extends QA_TestBase{
	QA_homePageAction homepageAction =new QA_homePageAction();
	QA_loginPageAction qA_loginPageAction = new QA_loginPageAction();
	
	//@Ap_Login
	
	@Given("^OPEN SWAGLABS \"([^\"]*)\"$")
	public void open_SWAGLABS(String URL) throws Throwable {
		luncch(URL); 
		Qa_Util.takescreenshot(driver, "Login Page");
		Thread.sleep(5000);
	}

	@Then("^ENTER valid USER ID PASSWORD AND CLICK SIGN IN$")
	public void enter_valid_USER_ID_PASSWORD_AND_CLICK_SIGN_IN() throws Throwable {
		qA_loginPageAction.userinformation(properti.getProperty("mrxuser"),properti.getProperty("mrxpass")); 
		Thread.sleep(5000);
	}

	@Then("^SIGN IN PAGE IS DISPLAYED$")
	public void sign_IN_PAGE_IS_DISPLAYED() throws Throwable {
		qA_loginPageAction.verifiedloginpage();
		
		Thread.sleep(5000);
	}
	}
	
