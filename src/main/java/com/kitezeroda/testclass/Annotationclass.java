package com.kitezeroda.testclass;

import org.testng.annotations.Test;

public class Annotationclass 
{
	@Test
	public void verifyLOginFunctionality() throws InterruptedException
	{
		
	    
		System.out.println("apply validation");
		String actualurl="https://kite.zerodha.com/dashboard";
		String Expectedurl="https://kite.zerodha.com/dashboard";
		
		if(actualurl.equals(Expectedurl))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test casse failed");
		}
	
	}
	
	
		
	
	
}
