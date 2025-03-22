package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactoryObjects {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	public static WebElement UserID;
	
	@FindBy(id="password")
	public static WebElement PasswordField;
	
	@FindBy(xpath = "//button[@class='radius']")
	public static WebElement LoginButton;
	
	public LoginPageFactoryObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName(String username)
	{
		UserID.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		PasswordField.sendKeys(password);
	} 
	
	
//	
	//OR
//	
//	public WebElement enterPassword() {
//		return PasswordField;
//	} 
	
}
