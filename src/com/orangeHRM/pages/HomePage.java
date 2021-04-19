package com.orangeHRM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import com.orangeHRM.generic.Master;


public class HomePage extends Master {
	

	

	public void clickAdmin() 
	{
		
		
		WebElement Admin=driver.findElement(By.xpath(loc.getProperty("AdminLink")));
				Actions a=new Actions(driver);
				a.moveToElement(Admin).build().perform();
				driver.findElement(By.xpath(loc.getProperty("userMgmt"))).click();
				driver.findElement(By.xpath(loc.getProperty("users"))).click();
		WebElement userole= driver.findElement(By.xpath(loc.getProperty("UserRole")));
		Select s = new Select(userole);
		s.selectByIndex(1);
		String header2=driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr[1]/th[2]")).getText();
		System.out.println(header2);
		WebElement chck = driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr[1]/th[1]/input"));
		chck.click();
		System.out.println(chck.isSelected());
		
		int tablesize=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		
		
		for(int i=1;i<tablesize;i++)
		{	if(i!=3) {
			WebElement checkboxes=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/input"));
			//checkboxes.click();
			System.out.println(checkboxes.isSelected());
		}
			
		}
		
		/*for(int i=1;i<tablesize;i++)
		{
			System.out.println(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[2]")).getText());
		}*/

		
		
	
	
	}

}
