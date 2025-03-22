package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/login");

		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.name("password"));
		WebElement SubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userName.sendKeys("optimus");
		userName.clear();
		passWord.sendKeys("optimus123");
		
		Thread.sleep(2000L);
		
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		System.out.println(checkBox1.isDisplayed());
		System.out.println(checkBox1.isEnabled());
		System.out.println(checkBox1.isSelected());
		System.out.println(checkBox2.isDisplayed());
		System.out.println(checkBox2.isEnabled());
		System.out.println(checkBox2.isSelected());
		
//		get css property
		WebElement selElem = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
		System.out.println(selElem.getCssValue("color"));
		System.out.println(selElem.getCssValue("text-decoration"));
		System.out.println(selElem.getCssValue("line-height"));
		System.out.println(selElem.getAttribute("href"));
		System.out.println(selElem.getAttribute("target"));
		
//		try other elements as well and fetch the attribute and css values
		
//		getAttribute() is deprecated 
//		new aproach is getDomProperty()
		
		System.out.println(selElem.getDomAttribute("href"));
		System.out.println(selElem.getDomProperty("href"));
		
		WebElement h3Data = driver.findElement(By.tagName("h3"));
		h3Data.getText();
		
		if(h3Data.getText().equalsIgnoreCase("Checkboxes"))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("doesn't match");
		}
		
		System.out.println(selElem.getTagName());
		
		System.out.println("height = " + selElem.getSize().getHeight());
		System.out.println("Width = " + selElem.getSize().getWidth());
		System.out.println("Location = " + selElem.getLocation());
	}
	
}
