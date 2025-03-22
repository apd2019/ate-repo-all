package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public static WebDriver driver;

	@Given("The user launches the app in chrome browser")
	public void The_user_launches_the_app_in_chrome_browser() {
		System.out.println("Launch app");
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("The user enters in valid credentials")
	public void The_user_enters_in_valid_credentials() {
		System.out.println("User enters in credentials");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}

	@When("The user enters in {string} and {string}")
	public void the_user_enters_in_and(String username, String password) {
		System.out.println("entering in the data from Examples table");
		System.out.println("user id: " + username);
		System.out.println("password: " + password);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("Click on Login button")
	public void Click_on_Login_button() {
		System.out.println("User clicks on login button");
		driver.findElement(By.className("radius")).click();
	}

	@Then("Check if the user is successfully logged in")
	public void Check_if_the_user_is_successfully_logged_in() {
		System.out.println("User successfully logged into the app");

		if (driver.getCurrentUrl().contains("secure")) {
			System.out.println("user successfully logged in");
			System.out.println(driver.getCurrentUrl());
		} else {
			System.out.println("user is not logged in");
		}
	}

//Background Example
//	@Given("The user is on the landing page of Ebay site on Chrome browser")
//	public void the_user_is_on_the_landing_page_of_ebay_site_on_chrome_browser() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.ebay.com/");
//	}
//
//	@When("The user enters in {string} keyword")
//	public void the_user_enters_in_keyword(String shirtsData) {
//		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
//		searchBox.sendKeys(shirtsData);	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//
//	@Then("The user should be taken to the shirts landing page")
//	public void the_user_should_be_taken_to_the_shirts_landing_page() {
//		System.out.println("The shirts landing page");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//	}
//
//	@Then("add any shirt product to the shopping cart")
//	public void add_any_shirt_product_to_the_shopping_cart() {
//		driver.findElement(By.xpath("//img[@alt=\"Men's Gulf of America T-shirt Patriotic USA Gulf of Mexico funny Tee Shirt\"]")).click();
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().window(tabs.get(0));
//		System.out.println(driver.getCurrentUrl());
//	}
//
//	@And("Close the browser")
//	public void Close_the_browser() {
//
//		System.out.println("Browser is closed");
//		driver.quit();
//
//	}
}
