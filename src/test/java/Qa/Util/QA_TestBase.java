package Qa.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_TestBase {

	public static Properties properti;
	public static WebDriver driver;
	
	public QA_TestBase() {
		
		try {
			FileInputStream location = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Configuration\\Qa_SwagLabs.properties");		
			properti= new Properties();
			properti.load(location);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

      public void initi() {
    	  String Browsername = properti.getProperty("chrome_browser");
    	  if(Browsername.equals("Chrome")) {
  			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chromedriver.exe" );
  			
  			driver = new ChromeDriver();
  			driver.manage().window().maximize();
  			driver.manage().deleteAllCookies();
  			driver.manage().timeouts().implicitlyWait(Qa_Util.implicitlyWait_wait, TimeUnit.SECONDS);
  			driver.manage().timeouts().pageLoadTimeout(Qa_Util.pageLoadTimeout_wait, TimeUnit.SECONDS);	  
    	  
      }
      
		
		
		else if(Browsername.equals("FF"));
			System.out.println("Browser not found");
	}
	
	
	public static void luncch(String URL) {
		driver.get(properti.getProperty("qaurl"));
}
}