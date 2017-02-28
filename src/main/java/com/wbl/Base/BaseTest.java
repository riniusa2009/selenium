package com.wbl.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.wbl.Helper.WebUIDriver;

public class BaseTest {

	
	
	
	static	String LOCATION ="C:\\Users\\Rini\\workspace1\\Seleniumwebdriver\\driver";

	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() throws IOException{		

		System.setProperty("webdriver.chrome.driver", LOCATION+"\\chromedriver.exe");
		 driver= new ChromeDriver();
          driver.get("http://walmart.com");
		/*WebUIDriver.lhttpoadProperties("config.properties");
		driver= WebUIDriver.getdriver();
*/
	}
	
	@AfterSuite
	public void afterSuite(){
		driver.close();
	}


	
	
	
	
}
