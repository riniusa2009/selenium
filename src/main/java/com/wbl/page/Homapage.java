package com.wbl.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Homapage {

	
	WebDriver driver;
		
   public Homapage(WebDriver driver){
	this.driver=driver;
	   
    }

	public void navihome() throws InterruptedException{
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
   	 
	}
	
	 public int headernavi(){
			List<WebElement> elements = driver.findElements(By.cssSelector("[class*='header-GlobalEyebrowNav-link']"));/*we used contains*/
			return elements.size();
		   }
	
    
	public Addingcart searchBox(){
		
    	
		WebElement eleme = driver.findElement(By.xpath(".//*[@id='global-search-input']"));
		eleme.sendKeys("laptop");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		Addingcart result=wait.until(function);
		
        return result;
		
			}
		Function<WebDriver,Addingcart> function=new Function<WebDriver,Addingcart>(){
			public Addingcart apply(WebDriver arg0){
				
				WebDriverWait wait = new WebDriverWait(driver,20);
		        List<WebElement> elements=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".header-Typeahead-row")));
				for(WebElement ele:elements){
					if(ele.getText().equalsIgnoreCase("laptop computers")){
						ele.click();
						break;
					}
					
				}
				return new Addingcart(driver);
			}
		
		};	
		
		   public void signInPage() throws InterruptedException{
			  // driver.navigate().back();
			try{	
				WebDriverWait wait = new WebDriverWait(driver,30); 
				WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(".//button[text()='My Account']"))));
				Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Hello. Sign In")));
				ele.click();
			}
			catch(Exception e){
				System.out.println(e);
			}
				Thread.sleep(1000);
			}
		   }	
			    
	

