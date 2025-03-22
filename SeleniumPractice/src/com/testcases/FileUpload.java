package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");

		WebElement fileUploadButton = driver.findElement(By.id("file-upload"));

		Actions a1 = new Actions(driver);
		
//		a1.moveToElement(fileUploadButton).click().build().perform();

		Thread.sleep(2000);
		
//		Runtime.getRuntime().exec("C:\\Users\\arka\\Desktop\\course materials\\1. simplilearn\\Practice\\SeleniumPractice\\AutoIT\\FileUpload.exe");
		fileUploadButton.sendKeys("C:\\Users\\arka\\Desktop\\course materials\\1. simplilearn\\Practice\\SeleniumPractice\\AutoIT\\sample.txt");
		Thread.sleep(5000);
		driver.quit();
	}
}
