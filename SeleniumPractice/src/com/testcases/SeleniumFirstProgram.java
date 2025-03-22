package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {
	public static void main (String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();	
		
		String title = driver.getTitle();
		System.out.println(title);	
		
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		String test = driver.getWindowHandle();
		System.out.println(test);
		
		

		
		Thread.sleep(3000);
		driver.quit();
		
		//380C51EA468D7C10812B79C331F339BB
		//5191F1346F7F4618E8916CCD462D9D57
		
		
	}
}
