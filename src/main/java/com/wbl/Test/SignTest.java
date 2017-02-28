package com.wbl.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.Base.BaseTest;
import com.wbl.page.Homapage;
import com.wbl.page.Sign;

public class SignTest extends BaseTest {

	Sign in;
	Homapage hp;
	
@BeforeClass
public void before(){
		
		in=new Sign(driver);
		in.naviSignPage();
		
	}

@Test(dataProvider="getData")
public void instanceDbProvider(String p1, String p2) throws InterruptedException {
    in.login(p1, p2);
    }  

     

    @DataProvider

    public Object[][] getData() {

        return new Object[][]{{"rinibrijesh@gmail.com", "tyagi2009"}, {"rinipandey12", "six"}};

    }

   }

