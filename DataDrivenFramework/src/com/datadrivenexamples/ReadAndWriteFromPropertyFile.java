package com.datadrivenexamples;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobjects.EbayTestPageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadAndWriteFromPropertyFile {
	
	public static WebDriver driver;
	@Test
	public void amazonSearchTest() throws IOException {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		EbayTestPageObjects ebayTestObj = new EbayTestPageObjects(driver);
		
		FileReader File = new FileReader("./EbaySearchDataProperties/EbaySearchProduct.properties");
		
		Properties prop = new Properties();
		
		prop.load(File);
		
		String searchData1 = prop.getProperty("testdata1");
		String searchData2 = prop.getProperty("testdata2");
		String searchData3 = prop.getProperty("testdata3");
		
		WebElement search = EbayTestPageObjects.SearchBox;
		search.sendKeys(searchData1);
		search.clear();
		search.sendKeys(searchData2);
		search.clear();
		search.sendKeys(searchData3);
		
		Properties propoutWriteMethod = new Properties();
		
		FileOutputStream propoutOutPutWrite = new FileOutputStream("./EbaySearchDataProperties/SearchDataWrite.properties");
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		propoutWriteMethod.setProperty("url ", url);
		propoutWriteMethod.setProperty("title ", title);
		
		propoutWriteMethod.store(propoutOutPutWrite, "data saved");
		
		propoutOutPutWrite.close();
	}
	
}
