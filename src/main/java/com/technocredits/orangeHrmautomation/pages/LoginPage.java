package com.technocredits.orangeHrmautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.technocredits.orangeHrmautomation.base.predfineMethods;

public class LoginPage extends predfineMethods{
	WebDriver driver;
	private static LoginPage LoginPage;
private LoginPage()
{
	super();//
	
}
public void initialize(String browser)
{
	if(driver==null)
	{
		driver=new ChromeDriver();
	}
}
public static LoginPage getInstance()
{
	if(LoginPage==null)
	{
		LoginPage=new LoginPage();
		return LoginPage;
	}
	return LoginPage;
}
}
