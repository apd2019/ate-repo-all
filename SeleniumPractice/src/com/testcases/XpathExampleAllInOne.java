package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExampleAllInOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("optimus");
		
		WebElement emailID = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
		emailID.sendKeys("optimus007");
		
		//input[contains(@name,'pass')]
		
		//(//input[contains(@name,'pass')])[1]
		//(//input[contains(@name,'pass')])[2]
		
		//(//select[contains(@name,'DOB')])[1]
		//(//select[contains(@name,'Day')])
				
		//td[text()='text']	
		
//		Herokuapp login
//		to find the ancestor tag
		//input[@name='username']/ancestor::div
		
//		to find the parent tag
//		//input[@name='username']/parent::div
		
//		to find a specific ancestor - use indexing
		//input[@name='username']/ancestor::div[5]
		
//		to find a child tag
		//div[@id='content']/child::div
		
//		to find the following/next tags/elements after username
		//label[@for='username']/following::div
		//label[@for='password']/following::label //wont work on the herokuapp login page
		
//		Following sibling
		//input[@id='username']/following-sibling::div
		//td/following-sibling::td
		
//		^ = starts with 
//		input[type^='text']

//		contains method
//		input[type*='text']	
		
//		ends with method
		
		
		Thread.sleep(5000L);		
		
		driver.quit();
			
	}
}
