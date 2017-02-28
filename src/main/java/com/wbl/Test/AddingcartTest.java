package com.wbl.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.Base.BaseTest;
import com.wbl.page.Addingcart;
import com.wbl.page.Homapage;


public class AddingcartTest extends BaseTest {

	Addingcart ad ;
	Homapage hm;
	
	@BeforeClass
	public void before() throws InterruptedException{
		
		hm=new Homapage(driver);
		ad = hm.searchBox();
	}
	
	@Test
	public void checkLink() throws InterruptedException{
		ad.addLpatop();
		
	}
	
	
	
	
}
