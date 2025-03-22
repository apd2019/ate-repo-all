package com.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();

		driver.navigate().to("https://jqueryui.com/droppable/");
		
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement draggable1 = driver.findElement(By.id("draggable"));
		WebElement dropTo = driver.findElement(By.id("droppable"));
		
		Actions a1 = new Actions(driver);
		
		a1.dragAndDrop(draggable1, dropTo).perform();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}
	
}
