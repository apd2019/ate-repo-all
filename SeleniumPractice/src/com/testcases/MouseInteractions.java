package com.testcases;

//using Actions class

import java.awt.AWTException;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
//		move to the elements and ations

//		driver.navigate().to("https://the-internet.herokuapp.com/");
//
//		WebElement item = driver.findElement(By.xpath("//a[@href='/context_menu']"));
//
//		Actions selectAct = new Actions(driver);
//
//		selectAct.moveToElement(item).click().perform();
//
//		driver.navigate().back();
//
//		WebElement item2 = driver.findElement(By.xpath("//a[@href='/broken_images']"));
//
//		selectAct.moveToElement(item2).contextClick().perform();
		
//		Mouse interactions

//		driver.navigate().to("https://jqueryui.com/droppable/");
//
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//
//		driver.switchTo().frame(frame);
//
//		WebElement draggable1 = driver.findElement(By.id("draggable"));
//		WebElement dropTo = driver.findElement(By.id("droppable"));
//
		Actions a1 = new Actions(driver);
//
//		a1.dragAndDrop(draggable1, dropTo).perform();
//		Thread.sleep(3000);
//
//		driver.navigate().refresh();
		
//		Double click actions
		
		driver.navigate().to("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		
		
		Thread.sleep(2000);
		
		WebElement clickButton = driver.findElement(By.xpath("//input[@type='button']"));
		
		a1.moveToElement(clickButton).click().build().perform();
		
		Thread.sleep(3000);
		
		a1.moveToElement(clickButton).doubleClick().build().perform();
		
		
		
		

	}
}
