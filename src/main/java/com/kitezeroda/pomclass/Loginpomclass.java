package com.kitezeroda.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpomclass 
{
	public WebDriver driver;
	
	
   //2.
	@FindBy(xpath="//input[@id='userid']")
	
	private WebElement username;
	
	
	//3.
	public void senduserid()
	{
		username.sendKeys("QVR625");
	}

	
	//password
	@FindBy(xpath="//input[@id='password']")
	
	private WebElement password;
	
	
	
	public void sendpassword()
	{
		password.sendKeys("atul10@10");
	}
	
	
	//login
	@FindBy(xpath="//button[@class='button-orange wide']")
	
	private WebElement login;
	
	
	//3.
	public void clicklogin()
	{
		 login.click();
	}
	

	
	
	
//	@FindBy(xpath="//input[@icon='search']")
//
//	private WebElement searchbutton;
//
//
//	//3.
//	public void searchclickbutton()
//	{
//		
//	  searchbutton.click();
//	}
//	
	
	

	
	
	

	
	//4.create constructor
	
	
	public  Loginpomclass (WebDriver driver )
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}





	
	
	
	
	
}
