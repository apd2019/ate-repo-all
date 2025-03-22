package com.testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	
	
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"userID", "password"})
	
	public void LoginTest(String username, String passwordd) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/login");
	
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	
	userName.sendKeys(username);
	
	password.sendKeys(passwordd);
	
	submit.click();
	
	}
}
