package com.orangeHRM.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;

public class HomePageTest {
	LoginPage login;
	HomePage home;
	@Test
	public void loginTest() throws Exception
	{
	login=new LoginPage();
	login.OpenURL();
	login.clickUsername();
	login.sendUsername();
	login.clickPassword();
	login.sendPassword();
	login.clickLoginBtn();
	}
	
	@Test(dependsOnMethods="loginTest")
	public void MenuTab()throws Exception
	{	
		try {
		home=new HomePage();
		home.clickAdmin();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
}
