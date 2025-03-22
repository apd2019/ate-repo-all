package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SimpliLearnSearchPageObjects;

public class StepDefinitions {
	
	public static WebDriver driver;
	public static SimpliLearnSearchPageObjects simpl;
	
	@Given("The user is on the SimpliLearn website")
	public void the_user_is_on_the_simpli_learn_website() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.simplilearn.com/");
	}

	@When("The user enters any course and click on search")
	public void the_user_enters_any_course_and_click_on_search() {
		simpl = new SimpliLearnSearchPageObjects(driver);
		simpl.SearchBox.sendKeys("Python");
		SimpliLearnSearchPageObjects.SearchIcon.click();
	}

	@Then("Verify the appropriate course landing page is displayed")
	public void verify_the_appropriate_course_landing_page_is_displayed() {
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
}
