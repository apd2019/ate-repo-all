package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crawlWebsiteAllLinks {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for(int i = 0; i<=allLinks.size();i++)
		{
//			System.out.println(allLinks.get(i).getText());
			System.out.println(allLinks.get(i).getDomAttribute("href"));
		}
		
		driver.navigate().back();
		
		
	}
}
