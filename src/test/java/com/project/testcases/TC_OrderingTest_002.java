package com.project.testcases;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.project.baseclass.BaseClass;
import com.project.pageobjects.HomePage;
import com.project.pageobjects.LoginPage;

public class TC_OrderingTest_002 extends BaseClass{

	 
	@Test
	public void ordering () throws InterruptedException, IOException {
		
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
		
		 captureScreen( driver,"001");
		HomePage hp = new HomePage(driver);

		hp.clickDresses();
		Thread.sleep(3000);
		hp.clickCasualDresses();
		Thread.sleep(3000);
	//	hp.clickCasualcheck();
		
		Thread.sleep(3000);
			
		 JavascriptExecutor js = (JavascriptExecutor) (driver);
		 js.executeScript("window.scrollBy(0,250)", "");
		 
		hp.selectDress();
		
		hp.AddtoCart();
		Thread.sleep(1000);
		 captureScreen( driver,"003");
		hp.Proceed();
		 js.executeScript("window.scrollBy(0,1000)");
		 hp.Proceed2();
		 Thread.sleep(1000);
		hp.Proceed3();
		 captureScreen( driver,"004");
		Thread.sleep(1000);
		hp.Terms();
		Thread.sleep(1000);
		hp.Proceed4();
		 captureScreen( driver,"005");
		Thread.sleep(1000);
		hp.PayByCheck();
		Thread.sleep(1000);
		hp.ConfirmMyOrder();
	}

}
