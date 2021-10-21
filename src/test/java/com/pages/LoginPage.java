package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//body/main[1]/div[12]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement email;
	@FindBy(xpath="//input[@id='j_username']")
	WebElement username;
	@FindBy(xpath="//input[@id='j_password']")
	WebElement password;
	@FindBy(xpath="//button[@id='loginajax']")
	WebElement submit;
	
	public LoginPage()
	{
		init();
		PageFactory.initElements(driver,this);
	}
	
	public void clickEmail()
	{
		email.click();
	}
	
	public void enterUserName(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}

	public String getTitle()
	{
		return driver.getTitle();
	}
}
