package com.project.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.project.baseclass.BaseClass;

import io.qameta.allure.Attachment;

public class ListenerClass_Allure_Report implements ITestListener{

	
	private static String getTestmethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
		
	}
	
	@Attachment
	public byte[] saveFailureScreenshot(WebDriver driver) {
		
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTestlog(String message) {
	return message;}
	
	
	
	
	
	@Override		
    public void onStart(ITestContext iTestContext) {					
       			
		System.out.println("I am in Start Method" + iTestContext.getName());
		
		iTestContext.setAttribute("WebDriver", BaseClass.getDriver());	
    }		

  		

    @Override		
    public void onTestFailure(ITestResult iTestResult) {					

    	System.out.println("I am on the Test Case Failed method" + getTestmethodName(iTestResult) + "Failed");
    	
    	Object testclass = iTestResult.getInstance();
    	WebDriver driver = BaseClass.getDriver();
    	
    	if(driver instanceof WebDriver) {
    		
    		System.out.println("Screenshot Captured for test case"+ getTestmethodName(iTestResult) + "Failed");
    		saveFailureScreenshot(driver);
    	}
    	
    	saveTestlog(getTestmethodName(iTestResult) + "Failed and Screenshot Taken");

    	
    }		

    @Override		
    public void onTestSuccess(ITestResult iTestResult) {					
    	System.out.println("I am on the Test Case Failed method" + getTestmethodName(iTestResult) + "Success");

    }
    
    
    @Override		
    public void onTestSkipped(ITestResult iTestResult) {					
    	System.out.println("I am on the Test Case Failed method" + getTestmethodName(iTestResult) + "Skipped");				
        		
    }
    
    
    public void onFinish(ITestResult iTestResult) {					
    	System.out.println("I am on the Test Case Failed method" + getTestmethodName(iTestResult) + "Finished");					
        		
    }	
}


