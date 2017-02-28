package com.wbl.page;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Addingcart {
	
	WebDriver driver;
	
	   public Addingcart(WebDriver driver){
		this.driver=driver;
		   
	    }

		

		public void addLpatop() throws InterruptedException{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement mainelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='searchProductResult']/div[1]/div[1]/div/div[2]/div[1]/a/h2/div")));
			mainelement.click();
			WebElement addelement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".prod-ProductCTA--primary.btn.btn-primary.btn-block")));
		    addelement.click();		    
			Thread.sleep(5000);			
		}
		catch(Exception e){
		System.out.println(e);	
	    	}
		}

		
		
		
		
		
		
}