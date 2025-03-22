package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobjects.LoginPageFactoryObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageFactoryTestCase {
	
	public static WebDriver driver;
	
	@Test
	public void LoginTestCase() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		LoginPageFactoryObjects LoginPageTest = new LoginPageFactoryObjects(driver);
		
		LoginPageTest.EnterUserName("apd");
		LoginPageTest.enterPassword("1234");
		
		
		LoginPageFactoryObjects.UserID.clear();
		LoginPageFactoryObjects.UserID.sendKeys("hello");
		
		LoginPageFactoryObjects.LoginButton.click();
		
		
	}
}
