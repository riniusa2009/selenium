package com.wbl.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.Base.BaseTest;
import com.wbl.page.Homapage;

import junit.framework.Assert;

public class HomePageTest extends BaseTest {

	
Homapage hm;
	
	@BeforeClass
	public void before() throws InterruptedException{
		hm = new Homapage(driver);
		//hm.navihome();
	}
	
	@Test
	public void headerNavi(){
		System.out.println(hm.headernavi());
	}
	
	@Test(priority=1)
	public void testSearchBox(){
	hm.searchBox();
	}
	
   @Test(priority=2)
	public void signInpage() throws InterruptedException{
		hm.signInPage();
		System.out.println("Page signIn done");
			}

	
}
