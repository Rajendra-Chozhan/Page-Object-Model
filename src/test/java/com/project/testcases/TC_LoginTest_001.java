package com.project.testcases;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.project.baseclass.BaseClass;
import com.project.pageobjects.LoginPage;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
     @Epic("EP001")
	@Feature("Feature: logo")
	@Story("Story-001")
	@Severity(SeverityLevel.NORMAL)
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
	
	String a = driver.getTitle();
	System.out.println(a);
	String b = "Login - My Store";
	
		
		
		 	 captureScreen( driver,"loginTest");
			Assert.assertEquals(a, b);
			logger.info("Login Test Passed");
					    	 
		    	 captureScreen( driver,"loginTest");
	//logger.info("Login Test Failed");
	
	
     }
}
