package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/login");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		String linkText = driver.findElement(By.linkText("Elemental Selenium")).getText();
		System.out.println(linkText);
		
		String h2TagValue = driver.findElement(By.tagName("h2")).getText();
		
		String h4TagValue = driver.findElement(By.tagName("h4")).getText();
		
		System.out.println(h2TagValue);
		
		System.out.println(h4TagValue);
		
		//xpath example
		driver.findElement(By.xpath("//a[@href=\'https://github.com/tourdedave/the-internet\']/img")).click();
}
	
}
