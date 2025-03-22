package com.testngexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAssertExample {
	
	public static WebDriver driver;
	
//	TestNGAssertExample() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://in.search.yahoo.com/?fr2=inr");
//		
//		
//	}
	
	
	
	@Test
	public void AssertExample() {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String actualTitle = "Yahoo Search - Web Search";
		
		Assert.assertEquals(title, actualTitle);
		
		System.out.println("print after assertion check");
		
		SoftAssert s1 = new SoftAssert();
		
		s1.assertEquals(title, "Google");
		
		System.out.println(driver.getCurrentUrl());
		
		s1.assertAll();
		
		driver.quit();
		
	}
}
