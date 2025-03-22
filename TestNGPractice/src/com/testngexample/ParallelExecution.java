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

public class ParallelExecution {
	public static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void startBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			
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
		
		WebElement searchBox =	driver.findElement(By.xpath("//input[@name='p']"));
		searchBox.sendKeys("selenium", Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void closeBrowser() {
		
		
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
