package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMenuInternetHerokuTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		
//		<li><a href="/dropdown">Dropdown</a></li>
		driver.findElement(By.xpath("//li/a[@href='/dropdown']")).click();
	}
}
