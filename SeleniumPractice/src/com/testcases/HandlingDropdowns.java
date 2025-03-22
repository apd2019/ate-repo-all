package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");

//		WebElement selectDay = driver.findElement(By.xpath("//select[contains(@name,'Day')]"));
//		
//		Select dayOfBirth = new Select(selectDay);
//		
//		dayOfBirth.selectByIndex(6);
//		
//		Thread.sleep(2000);
//		
//		dayOfBirth.selectByValue("07");
//		
//		Thread.sleep(2000);
//		
//		dayOfBirth.selectByVisibleText("18");
//		
//		Thread.sleep(2000);
//		
//		dayOfBirth.selectByContainsVisibleText("17");
//		
//		Thread.sleep(1000);

//		WebElement selectMonth = driver.findElement(By.xpath("//select[contains(@name,'Month')]"));
//		
//		Select monthOfBirth = new Select(selectMonth);
//		
//		monthOfBirth.selectByIndex(6);
//		
//		Thread.sleep(2000);
//		
//		monthOfBirth.selectByValue("06");
//		
//		Thread.sleep(5000);
//		
//		monthOfBirth.selectByVisibleText("MAR");
//		
//		Thread.sleep(2000);
//		
//		monthOfBirth.selectByContainsVisibleText("MAY");

		WebElement mobNo = driver.findElement(By.xpath("//input[@id='mobno']"));
		mobNo.sendKeys("0234567893");

	}
}
