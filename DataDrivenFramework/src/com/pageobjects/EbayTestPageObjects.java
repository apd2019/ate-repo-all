package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayTestPageObjects {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	public static WebElement SearchBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement SearchButton;

	public EbayTestPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
