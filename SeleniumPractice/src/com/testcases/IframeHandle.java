package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeHandle {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://the-internet.herokuapp.com/iframe");

		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.id("mce_0_ifr"));
		
		driver.switchTo().frame(frame);

		WebElement paraText = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));

		String outPut = paraText.getText();

		System.out.println(outPut);
		
		driver.switchTo().defaultContent();
		
		WebElement h3Text = driver.findElement(By.xpath("//div/h3"));
		
		System.out.println(h3Text.getText());

		
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement carSelect = driver.findElement(By.id("cars"));
		
		Select carSelectFromList = new Select(carSelect);
		
		carSelectFromList.selectByValue("volvo");
		carSelectFromList.selectByValue("saab");
		
		Thread.sleep(2000);
		
		carSelectFromList.deselectAll();
		
		Thread.sleep(2000);
		
		carSelectFromList.selectByValue("opel");
		Thread.sleep(2000);
		carSelectFromList.selectByValue("audi");
	}

}
