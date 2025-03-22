package com.testcases;

import org.openqa.selenium.By;

//import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,900)", "");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-900)", "");
		
		WebElement link = driver.findElement(By.xpath("//a[@href='/inputs']"));
		
		Thread.sleep(2000);
		
//		js.executeScript("arguments[0].scrollIntoView()", link);
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", link);
	}
}
