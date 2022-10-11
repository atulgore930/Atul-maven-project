package com.kitezeroda.pomclass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utiliityclass 
{
public static void screenshotmethod(WebDriver driver) throws IOException
{
	Date d=new Date();
	DateFormat d1 = new SimpleDateFormat("dd-MM-YY& hh-mm-ss");
	String date=d1.format(d);
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File seleFile =ts.getScreenshotAs(OutputType.FILE);
	File myfile=new File("./Screenshotfolder\\kite" + date+ ".jpg");
	FileHandler.copy(seleFile, myfile);
	
}
}
