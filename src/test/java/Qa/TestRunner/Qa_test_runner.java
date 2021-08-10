package Qa.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Qa.Util.QA_TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Qa_Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "sstepDefinationn", tags= {"@swaglabs_checkout_page"})

public class Qa_test_runner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void LaunchApplicationURL() {  
		QA_TestBase lunch= new QA_TestBase();
		lunch.initi();
	}
	
	@AfterTest
	public void CloseApplicationURL() {
		QA_TestBase lunch = new QA_TestBase();	
		lunch.driver.quit();
	}
	
		

}
