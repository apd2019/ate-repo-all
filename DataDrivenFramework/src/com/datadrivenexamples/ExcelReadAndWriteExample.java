package com.datadrivenexamples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobjects.EbayTestPageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReadAndWriteExample {

	public static WebDriver driver;

	@Test
	public void SearchTest() throws EncryptedDocumentException, IOException {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		// Step 1 is the read the file
		FileInputStream fs = new FileInputStream("./EbaySearchDataProperties/testData.xlsx");

		// Step 2 is assiniing the file to work book class

		Workbook wb = WorkbookFactory.create(fs);

		// Step 3 read the work sheet inside the work book
		Sheet sh = wb.getSheet("search");

		// Step 4 read the row value
		Row rw = sh.getRow(1);

		// Step 5 is to define the col value
		Cell celldata = rw.getCell(0);

//		Cell celldata = WorkbookFactory.create(fs).getSheet("search").getRow(1).getCell(0);

		System.out.println(celldata.getStringCellValue());

//		for (int i = 1; i <= sh.getLastRowNum(); i++) {
//			Row rowValue = sh.getRow(i);
//			Cell cellSearchData = rowValue.getCell(0);
//
//			System.out.println(cellSearchData.getStringCellValue());
//		}

//		// enhanced for loop
//		for (Row rowValue : sh) {
//			Cell searchTerm = rowValue.getCell(0);
//			System.out.println(searchTerm);
//		}

		EbayTestPageObjects LoginPageTest = new EbayTestPageObjects(driver);

		EbayTestPageObjects.SearchBox.sendKeys(celldata.getStringCellValue());
		EbayTestPageObjects.SearchButton.click();
	}
}
