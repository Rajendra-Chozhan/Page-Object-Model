package com.project.pageobjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	
	{
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}


	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	WebElement Dressesbutton;
	
	public void clickDresses()
	{
		Dressesbutton.click();
	}
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement Casualdressbutton;
	
	public void clickCasualDresses()
	{
		Casualdressbutton.click();
	}
	
	@FindBy(id="layered_category_9")
	WebElement Casualcheckbox;
	
	public void clickCasualcheck()
	{
		Casualcheckbox.click();
	}
	
	

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement selectdress;
	
	public void selectDress()
	{
		selectdress.click();
	}
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	WebElement Addtocart;
	
	public void AddtoCart()
	{
		Addtocart.click();
	}
	
	
	
	
	
	@FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
	WebElement Proceedtocheckout;
	
	public void Proceed()
	{JavascriptExecutor js = (JavascriptExecutor) (ldriver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",Proceedtocheckout );
		Proceedtocheckout.click();
	}
	
	@FindBy(xpath = "//*[contains(@class,'button btn btn-default standard-checkout button-medium')]")
	WebElement Proceed2;
	
	public void Proceed2()
	{
		Proceed2.click();
	}
	
	
		
			@FindBy(xpath = "//*[contains(@class,'button btn btn-default button-medium')]")
	WebElement Proceed3;
	
	
			public void Proceed3()
			{
				Proceed3.click();
			}
	
			@FindBy(xpath = "//*[contains(@class,'button btn btn-default standard-checkout button-medium')]")
			WebElement Proceed4;
			
			
					public void Proceed4()
					{
						Proceed4.click();
					}
				
	
					@FindBy(xpath = "//input[@id='cgv']")
					WebElement terms;
			
					
							public void Terms()
							{
								terms.click();
							}
							
							
							
							
							
							@FindBy(xpath = "//*[contains(text(),'Pay by check')]")
							WebElement paybycheck;
					
							
									public void PayByCheck()
									{
										paybycheck.click();
									}
											
								
							
							
							
							
									@FindBy(xpath = "//*[contains(text(),'I confirm my order')]")
									WebElement confirm;
							
									
											public void ConfirmMyOrder()
											{
												confirm.click();
											}			
							
							
							
							
							
							
							
							
							
							
							
}
