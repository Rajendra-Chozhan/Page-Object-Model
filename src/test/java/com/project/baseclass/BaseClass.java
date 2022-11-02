package com.project.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.project.utilities.ReadConfig;




public  class BaseClass {
	
	ReadConfig read = new ReadConfig();
	
	
	public String BaseURL=read.getApplicationURL();
	public String Email=read.getEmailid();
	public String Password=read.getPassword();
	
	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public WebDriver setup(String br) {
    
		BasicConfigurator.configure();	
		
		logger=Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("Log4j2.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",read.getChromepath());
						driver = new ChromeDriver();
						
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						driver.manage().deleteAllCookies();
						driver.manage().window().maximize();
						tdriver.set(driver);
						return getDriver();
			
		}
		else if (br.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver",read.getIEpath());
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		tdriver.set(driver);
	}
		else if (br.equals("firefox")) {
			{
			System.setProperty("webdriver.gecko.driver",read. getFirefoxpath());
		driver = new FirefoxDriver();	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		tdriver.set(driver);
	}}

		else if (br.equals("edge")) {
			{
			System.setProperty("webdriver.edge.driver",read. getEdgepath());
		driver = new EdgeDriver();	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		tdriver.set(driver);
		
	}}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return getDriver();
	}
	
	@AfterClass
	public void Exit() {
		
	driver.quit();
}
	
	
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	public static synchronized WebDriver getDriver() {
		// TODO Auto-generated method stub
		return tdriver.get();
	}
	
	}
