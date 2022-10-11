package com.kitezeroda.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepomclass
{
public  WebDriver driver;


	
	//2.
	@FindBy(xpath="//span[@class='user-id']")
	
	private WebElement profilebutton;
	
	
//	//3.
	public void profile()
	{
		profilebutton.click();
	}
	
	
	
	@FindBy(xpath = "//a[@href='/logout']")
	
	private WebElement logOutButton;
	
	public void logoutbutton1()
	{
		logOutButton.click();
	}


//@FindBy(xpath="//span[text()='GOLDBEES']")
//
//private WebElement sharebutton;
//
//
////3.
//public void shareclickbutton()
//{
//	
//  sharebutton.click();
//}
//
//
//@FindBy(xpath="//button[@class='button-blue buy']")
//
//private WebElement shareaddbutton;
//
//
////3.
//public void shareaddclickbutton()
//{
//	
//  shareaddbutton.click();
//}
//
//
//
//
//
//@FindBy(xpath="//button[@class='button-blue buy']")
//
//private WebElement sharebuybutton;
//
//
////3.
//public void sharbuyclickbutton()
//{
//	
//  sharebuybutton.click();
//}


	
	public  Homepomclass (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	
}
