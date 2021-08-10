package Qa.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Qa_Util {
	
	
	//testbase
	public static long implicitlyWait_wait = 60;
	public static long pageLoadTimeout_wait= 60;
	//searchbox
	public static String searchbox = "Evening Dresses";
	
	
	//screenshot
	
public static void takescreenshot(WebDriver driver, String screenshot) {
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String correntdir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcfile, new File(correntdir+"/ScreenShots/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
}	 
	
}
