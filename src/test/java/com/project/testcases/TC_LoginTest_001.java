package com.project.testcases;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;

import org.testng.annotations.Test;

import com.project.baseclass.BaseClass;
import com.project.pageobjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
    
	@Test
     
	public void loginTest() throws IOException, InterruptedException {
		
    	 BasicConfigurator.configure();
		driver.get(BaseURL);
		
		logger.info("URL is launched successfully");
		System.out.println("Page title is : " + driver.getTitle());
		
		driver.manage().window().maximize();
		
					
		LoginPage lp = new LoginPage(driver);
		 		
		lp.setemailid(Email);
		
		logger.info("Entered Email Id");
		
		lp.setPassword(Password);
		logger.info("Entered Password");
		
		lp.clickSignin();
		logger.info("Submitted");
		
		Thread.sleep(3000);
		
		lp.clicksignout();		
	logger.info("Signed Out");
	
	
		
		if(driver.getTitle().equals("Login - My Store")) 
		{
		 	 captureScreen( driver,"loginTest");
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
			
		}
			     else {
			    	 
			    	 captureScreen( driver,"loginTest");
				Assert.assertTrue(false);
		logger.info("Login Test Failed");
	}
	
     }
}
