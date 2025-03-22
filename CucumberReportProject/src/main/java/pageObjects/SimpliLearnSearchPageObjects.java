package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpliLearnSearchPageObjects {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='header_srch']")
	public static WebElement SearchBox;
	
	@FindBy(xpath = "//button[@title='search']")
	public static WebElement SearchIcon;
	
	public SimpliLearnSearchPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
