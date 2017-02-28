package com.wbl.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign {

	
	WebDriver driver;
	
	public Sign(WebDriver driver){
		
		this.driver=driver;
	}
	 
	public void naviSignPage(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://www.walmart.com/account/login?tid=0&returnUrl=%2F");
		driver.manage().window().maximize();
		
	}
	
	public void login(String p1,String p2) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    List<WebElement> ele = driver.findElements(By.cssSelector(".form-control"));	
	    ele.get(0).clear();
	    ele.get(1).clear();
		ele.get(0).sendKeys("p1");
		ele.get(1).sendKeys("p2");
	    driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(1000);
	    
	}
	
	
	
	
	
	
}
