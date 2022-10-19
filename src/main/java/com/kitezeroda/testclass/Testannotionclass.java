package com.kitezeroda.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kitezeroda.pomclass.Homepomclass;
import com.kitezeroda.pomclass.Otppomclass;

public class Testannotionclass extends Baseclass
{
	

	@Test
	public  void verifyloginfunctionality() throws InterruptedException
	{
    System.out.println("apply the validation");
    
	Otppomclass y=new Otppomclass (driver);
	Thread.sleep(10000);
	y.sendotpclickbutton();
	 Log.info("otp click button clicked");
	   String expectedurl = "https://kite.zerodha.com/dashboard";    //dev/BA	
	   String actualurl = driver.getCurrentUrl();
	   System.out.println(driver.getCurrentUrl());
	
	   Assert.assertEquals(actualurl, expectedurl);
	   
}
	@Test
	public  void verifylogoutfunctionality() throws InterruptedException
	{
		 Homepomclass z=new  Homepomclass(driver);
		 z.profile();
		 z.logoutbutton1();
		 Log.info("logout button clicked");
	
		 Log.info ("apply the validation");
		
		   String expectedurl = "https://kite.zerodha.com/dashboard";    //dev/BA	
		   String actualurl = driver.getCurrentUrl();
		  SoftAssert atul=new SoftAssert();	
		  atul.assertEquals(actualurl, expectedurl);
		  atul.assertAll();
		  
		Assert.assertEquals(actualurl, expectedurl);
	}
}
	
 