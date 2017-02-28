package com.wbl.Helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIDriver {

	static	String LOCATION ="C:\\Users\\Rini\\workspace1\\Seleniumwebdriver\\driver";

	static String browserName;
	
	public static void loadProperties(String filename) throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\Rini\\workspace1\\Seleniumwebdriver\\driver"+filename));
		browserName=prop.getProperty("browser");   	
	}
	
	
	public static WebDriver getdriver(){
		
		WebDriver driver = null;
		switch(browserName)
		{
		case"firefox":
		System.setProperty("webdriver.firefox.driver", LOCATION+"\\firefoxdriver.exe");
		 driver= new FirefoxDriver();

		case"chrome":
			System.setProperty("webdriver.chrome.driver", LOCATION+"\\chromedriver.exe");
			 driver= new ChromeDriver();

		case"safari":
			System.setProperty("webdriver.safari.driver", LOCATION+"\\safaridriver.exe");
			 driver= new SafariDriver();


		}	
		return driver;
	
	
	}
	
}
