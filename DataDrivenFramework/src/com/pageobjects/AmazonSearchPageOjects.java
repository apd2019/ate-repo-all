package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchPageOjects {

	public static WebDriver driver;
	
	By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchIcon = By.xpath("//input[@id='nav-search-submit-button']");
	
	public AmazonSearchPageOjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSearchData(String testdata) {
		driver.findElement(searchBox).sendKeys(testdata);
	}
	
	public WebElement searchTextBox()
	{
		return driver.findElement(searchBox);
	}
	
	public void clickSearchIcon() {
		driver.findElement(searchIcon).click();
	}
}
