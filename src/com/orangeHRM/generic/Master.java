package com.orangeHRM.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Master {
	public  static WebDriver driver;
	public static Properties config;
	public static Properties loc;
	public	 FileInputStream src,src1;
	
	
	public void URLMaster() throws Exception
	{
		src=new FileInputStream("C:\\Users\\Aishu\\eclipse-workspace\\OrangeHRM\\src\\com\\orangeHRM\\Repository\\Configuration.properties");
		config=new Properties();
		config.load(src);
		
		src1=new FileInputStream("C:\\Users\\Aishu\\eclipse-workspace\\OrangeHRM\\src\\com\\orangeHRM\\Repository\\Locators.properties");
		loc=new Properties();
		loc.load(src1);
		
		if(config.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aishu\\eclipse-workspace\\OrangeHRM\\Webdrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
	}
		
		
		public  void  click(String xpath) 
		{	
			
			driver.findElement(By.xpath(loc.getProperty(xpath))).click();
			
		}
		public void sendDataTo(String xpath,String data) 
		{
			
			driver.findElement(By.xpath(loc.getProperty(xpath))).sendKeys(data);
		}
		public void backward()
		{
			driver.navigate().back();
		}
		
	}
	
	

