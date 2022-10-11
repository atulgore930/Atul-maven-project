package com.kitezeroda.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Otppomclass 
{
public WebDriver driver;

@FindBy(xpath="//input[@label='Mobile App Code']")

private WebElement otp;


//3.



@FindBy(xpath="//button[@class='button-orange wide']")

private WebElement continuebutton;


//3.
public void sendotpclickbutton()
{
	
  continuebutton.click();
}


public Otppomclass (WebDriver driver )
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}


}
