package com.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteractions {
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		driver.navigate().to("https://the-internet.herokuapp.com/");
//		
//		Robot r1 = new Robot();
//		
//		r1.keyPress(KeyEvent.VK_TAB);
//		r1.keyRelease(KeyEvent.VK_TAB);
//		r1.keyPress(KeyEvent.VK_ENTER);
//		r1.keyRelease(KeyEvent.VK_ENTER);
//		driver.navigate().back();
//		
//		for(int i=0;i<=10;i++)
//		{
//			
//		r1.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(100);
//		r1.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(100);
//		}
//		
//		r1.keyPress(KeyEvent.VK_ENTER);
//		r1.keyRelease(KeyEvent.VK_ENTER);
//		
		
		
		driver.navigate().to("https://the-internet.herokuapp.com/key_presses");
		
		Actions a1 = new Actions(driver);
		
		Thread.sleep(1000);
		
		a1.keyDown(Keys.CONTROL)	;
		a1.sendKeys("a").build().perform();
		a1.keyUp(Keys.CONTROL);
		
		
		
		
		Thread.sleep(1000);	
			
		a1.sendKeys("s").build().perform();
	}
}
