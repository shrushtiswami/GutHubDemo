package com.orangeHRM.tests;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.pages.*;

public class LoginTest   {
	LoginPage login;
	
	@Test
	public void RunTest() throws Exception
	{
		
	LoginPage login=new LoginPage();
	login.OpenURL();
	Thread.sleep(300);
	login.clickforgotPassword();
	Thread.sleep(300);
	login.back();
	login.clickUsername();
	login.sendUsername();
	login.clickPassword();
	login.sendPassword();
	login.clickLoginBtn();
	//login.clickforgotPassword();
	}
}	
