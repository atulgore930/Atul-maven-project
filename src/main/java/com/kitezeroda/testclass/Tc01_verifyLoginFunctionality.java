package com.kitezeroda.testclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kitezeroda.pomclass.Homepomclass;
import com.kitezeroda.pomclass.Loginpomclass;
import com.kitezeroda.pomclass.Otppomclass;
import com.kitezeroda.pomclass.Utiliityclass;

public class Tc01_verifyLoginFunctionality
{
	public WebDriver driver;
	
	
	
	@Test
	public  void setup() throws InterruptedException, IOException
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
		Utiliityclass.screenshotmethod(driver);
	Thread.sleep(8000);
Otppomclass y=new Otppomclass (driver);
		
		y.sendotpclickbutton();
	
	
		
		 Homepomclass z=new  Homepomclass(driver);
//		z.shareclickbutton();
//		z.shareaddclickbutton();
//		z.shareclickbutton();
//		 Thread.sleep(2000);
		
       
	
	
	    System.out.println("apply the validation");
		
		   String expectedurl = "https://kite.zerodha.com/dashboard";    //dev/BA	
		   String actualurl = "https://kite.zerodha.com/dashboard";
		   System.out.println(driver.getCurrentUrl());
		
		   if(expectedurl.equals(actualurl))
		   {
			   System.out.println("login functionality test case is passed");
		   }
		   else
		   {
			   System.out.println("login functionality test case is failed");
		   }
		   
		   

		
	

	}
}
		

	
           
		

	
	

			 
			





	







