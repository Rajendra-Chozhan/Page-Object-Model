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
	
	
	
	
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
	WebElement Proceedtocheckout;
	
	public void Proceed()
	{JavascriptExecutor js = (JavascriptExecutor) (ldriver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",Proceedtocheckout );
		Proceedtocheckout.click();
	}
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
	WebElement Proceed2;
	
	public void Proceed2()
	{
		Proceed2.click();
	}
	
	
		
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	WebElement Proceed3;
	
	
			public void Proceed3()
			{
				Proceed3.click();
			}
	
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
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
							
							
							
							//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]/span[1]			
							
							
							
							
							
							@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]/span[1]	")
							WebElement paybycheck;
					
							
									public void PayByCheck()
									{
										paybycheck.click();
									}
											
								
							
							
							
							
									@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
									WebElement confirm;
							
									
											public void ConfirmMyOrder()
											{
												confirm.click();
											}			
							
							
							
							
							
							
							
							
							
							
							
}
