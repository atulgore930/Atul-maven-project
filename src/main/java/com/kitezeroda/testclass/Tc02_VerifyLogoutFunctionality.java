package com.kitezeroda.testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kitezeroda.pomclass.Homepomclass;
import com.kitezeroda.pomclass.Loginpomclass;
import com.kitezeroda.pomclass.Otppomclass;

public class Tc02_VerifyLogoutFunctionality 
{
	
	@Test
public void  setup() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chrome106\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		System.out.println("browser is open");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		System.out.println("window maximized");
		
		driver.get("https://kite.zerodha.com/");
		System.out.println("url is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Loginpomclass x=new Loginpomclass(driver);
		x.senduserid();
		x.sendpassword();
		System.out.println("password is entered");
		x.clicklogin();
		Thread.sleep(8000);
	
		Otppomclass y=new Otppomclass (driver);
		
		y.sendotpclickbutton();
		
	
       
		 Homepomclass z=new  Homepomclass(driver);
		 z.profile();
		 z.logoutbutton1();
	
	    System.out.println("apply the validation");
		
		   String expectedurl = "https://kite.zerodha.com/#loggedout";    //dev/BA	
		   String actualurl = driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());
		
		Assert.assertEquals(actualurl, expectedurl);
		
	
	
			
}
}
