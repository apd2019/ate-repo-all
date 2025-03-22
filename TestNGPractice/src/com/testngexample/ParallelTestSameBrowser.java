package com.testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestSameBrowser {
	
	public static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void startBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Users\\arka\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver(options);
		}
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void openYahooPage() throws InterruptedException {
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		System.out.println("The title is - "+ driver.getTitle());
		

		Thread.sleep(3000);
	}
	
	@Test
	public void openGooglePage() throws InterruptedException {
		driver.get("https://google.com");
		System.out.println("The title is - "+ driver.getTitle());
		
		
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void closeBrowser() {
		
		
		driver.quit();
		
	}
}
