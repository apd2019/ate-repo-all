package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobjects.AmazonSearchPageOjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchTestCase {

	public static WebDriver driver;

	@Test
	public void amazonSearchTest() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		AmazonSearchPageOjects searchPageObj = new AmazonSearchPageOjects(driver);
		
		Boolean inputBoxDisplayed = searchPageObj.searchTextBox().isDisplayed();
		System.out.println(inputBoxDisplayed);
		
		searchPageObj.enterSearchData("tshirts");
		searchPageObj.clickSearchIcon();
	}
}
