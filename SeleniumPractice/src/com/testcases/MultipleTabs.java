package com.testcases;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/windows");

		WebElement link = driver.findElement(By.xpath("//a[@href='/windows/new']"));

		link.click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		WebElement newTabText = driver.findElement(By.tagName("h3"));

		System.out.println(newTabText.getText());
		
		Thread.sleep(1000);

		driver.close();
		
		//pause
		
		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(0));

		driver.close();

	}
}
