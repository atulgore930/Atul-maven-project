package com.kitezeroda.testclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.kitezeroda.pomclass.Loginpomclass;

public class Baseclass 
{
 WebDriver driver;
 Logger Log=Logger.getLogger("Kiteproject");
	
	
	@Parameters("browsername")
	@BeforeMethod
	public  void setup(String browsername) throws InterruptedException, IOException
	{
		if(browsername.equals("chrome"))
		{
         System.setProperty("webdriver.chrome.driver", "./Driverfiles\\chromedriver.exe");
		
		 driver=new ChromeDriver();
	}
	
	else
		
	{
		System.setProperty("webdriver.gecko.driver", "./Driverfiles\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
	
		 
		 	 
	} 
		
		
	PropertyConfigurator.configure("Log4j.properties");	
		
		Log.info("browser is open");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		System.out.println("window maximized");
		
		driver.get("https://kite.zerodha.com/");
		Log.info("url is opened");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Loginpomclass x=new Loginpomclass(driver);
		x.senduserid();
		x.sendpassword();
		Log.info("password is entered");
		x.clicklogin();
	}
	
	@AfterMethod
	public  void tearDown()
	
	{
		driver.close();
		System.out.println("end of program");
		
	}
}
