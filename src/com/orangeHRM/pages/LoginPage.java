package com.orangeHRM.pages;
import com.orangeHRM.generic.*;

public class LoginPage extends Master  {

	public void OpenURL() throws Exception
	{
		URLMaster();
	
	}
	public void back()
	{
		backward();
	}
	
	public void clickUsername() 
	{
		click("username");
	}
	
	public void sendUsername()
	{
		sendDataTo("username", "Admin");
	}
	public void clickPassword()
	{
		click("password");
	}
	public void sendPassword()
	{
		sendDataTo("password", "admin123");
	}
	public void clickLoginBtn()
	{
		click("loginButton");
	}
	public void clickforgotPassword()
	{
		click("forgotPassword");
	}
}
