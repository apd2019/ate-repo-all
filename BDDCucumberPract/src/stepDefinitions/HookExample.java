package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookExample {

	public static WebDriver driver;

	/*
	 * @Before public void openApplication() throws InterruptedException {
	 * 
	 * System.out.println("executing the before hook");
	 * WebDriverManager.chromedriver().clearDriverCache().setup(); driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://www.ebay.com/");
	 * 
	 * }
	 */
	
	@Before("@SmokeTest")
	public void beforeSmokeTest() {
		System.out.println("Before smoke test hook");
	}
	
	@After("@SmokeTest")
	public void afterSmokeTest() {
		System.out.println("After smoke test hook");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("Before Step execution");
	}
	
	@AfterStep
	public void  afterStep() {
		System.out.println("After Step execution");
	}

	@When("The user enters {string} keyword")
	public void the_user_enters_in_keyword(String shirtsData) throws InterruptedException {
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));

		searchBox.sendKeys(shirtsData);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("Te user should taken to shirts landing page")
	public void the_user_should_be_taken_to_the_shirts_landing_page() {
		System.out.println("The shirts landing page");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	@Then("Add any shirt product to the shoping cart")
	public void add_any_shirt_product_to_the_shopping_cart() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Mens Crew Neck Short Sleeve Wide Striped T-Shirts')]"))
				.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getCurrentUrl());
	}

	/*
	 * @After public void Close_the_browser() {
	 * 
	 * System.out.println("executing the after hook"); driver.quit();
	 * 
	 * }
	 */
}
