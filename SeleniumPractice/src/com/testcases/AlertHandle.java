package com.testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		jsAlert.click();
		
		Alert alert = driver.switchTo().alert();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		alert.accept();
		
		
		//button[@onclick='jsAlert()']
		
		WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		jsConfirm.click();
		
		System.out.println(alert.getText());
		alert.accept();
		
	
		
		WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsPrompt.click();
		
		alert.sendKeys("hello");
			
		alert.dismiss();
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		if(result.getText().contains("null"))
		{
			System.out.println("successfully canceled");
		}
		else if(result.getText().contains(" "))
		{
			System.out.println("just pressed OK");
		}
		else
		{
			System.out.println("text");
		}
		
	
//		System.out.println(jsPrompt.getClass());
	}
}
