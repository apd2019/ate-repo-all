package com.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");

		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));

		startButton.click();
		
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement helloText = driver.findElement(By.xpath("(//h4) [2]"));

		System.out.println(helloText.getText());

		driver.navigate().refresh();

		try {
			startButton.click();
		} catch (Exception e) {

			System.out.println(e);
			
		}

		WebElement startButton1 = driver.findElement(By.xpath("//button[text()='Start']"));

		startButton1.click();
		
		WebElement helloText1 = driver.findElement(By.xpath("(//h4) [2]"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(helloText1));
		
		
		
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))	
				.pollingEvery(Duration.ofSeconds(5));
		
		System.out.println(helloText1.getText());
		
		
		

	}

}
