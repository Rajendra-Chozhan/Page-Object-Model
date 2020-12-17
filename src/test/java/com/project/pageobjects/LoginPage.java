package com.project.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	
	{
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="passwd")
	WebElement textpassword;
		
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
	WebElement signinbutton;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement loginbutton;
	
	
	@FindBy(name="btnReset")
	WebElement resetbutton;
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	@CacheLookup
	WebElement signoutbutton;
	
	
	
	public void setemailid(String email)
	
	{
		JavascriptExecutor js = (JavascriptExecutor) (ldriver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",emailid );
		
		emailid.sendKeys(email);	
	}
	public void setPassword(String pname)
	{
		textpassword.sendKeys(pname);	
	}
	

	public void clickSignin()
	{
		signinbutton.click();
	}
	
	
	public void clicksignout()
	{
		signoutbutton.click();
	}
}
