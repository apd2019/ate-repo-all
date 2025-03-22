package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataParameterExample {

	public static WebDriver driver;

	@Given("The user is on Automation Excercise Demo website")
	public void the_user_is_on_automation_excercise_demo_website() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
	}

	@When("The user clicks on sign up\\/login link")
	public void the_user_clicks_on_sign_up_login_link() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}
	//	NoHeaderDataExample
	//	Scenario: Check if the user is navigated to sign up page on entering valid email
	@Then("The user enters in valid username and the email ID")
	public void the_user_enters_in_valid_username_and_the_email_id(io.cucumber.datatable.DataTable dataTable) {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement email = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));

		List<List<String>> data = dataTable.asLists(String.class);

		System.out.println("printing the datatable");
		String nameData = data.get(0).get(0);
		String emailData = data.get(0).get(1);

		System.out.println(nameData);
		System.out.println(emailData);

		username.sendKeys(nameData);
		email.sendKeys(emailData);

//		for (List<String> row : data) {
//			String name = row.get(0);
//			String email1 = row.get(1);
//
//			System.out.println("printing the name: " + name);
//			System.out.println("printing the emails: " + email1);
//		}
	}
	// end of NoHeaderDataExample
	
//	OneHeaderOneData
//	Scenario: Check if the user is thrown with Error message on entering exisitng email Id
	@Then("The user enters existing username and email Id")
	public void the_user_enters_existing_username_and_email_id(io.cucumber.datatable.DataTable dataTable) {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement email = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));

		List<Map<String, String>> testData = dataTable.asMaps(String.class, String.class);

		String Name = testData.get(0).get("Name");
		String Email = testData.get(0).get("Email");

		System.out.println(testData.get(0).get("name"));
		System.out.println(testData.get(0).get("email"));

		username.sendKeys(Name);
		email.sendKeys(Email);
	}

	@Then("Check if Email Id already existing message is coming up")
	public void check_if_email_id_already_existing_message_is_coming_up(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> testData = dataTable.asMaps(String.class, String.class);

		String ExpectedErrorMessage = testData.get(0).get("ErrorMessage");
		System.out.println(ExpectedErrorMessage);

		WebElement ActualErrorMessage = driver
				.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']"));
		System.out.println(ActualErrorMessage);

		if ((ExpectedErrorMessage.contains(ActualErrorMessage.getText()))) {
			System.out.println("matched!!!");
		}
	}                
	//	end of OneHeaderOneData	

	// OneHeaderMultipleData
//	Scenario: Check if the Signup section is able to validate with different data
	@When("The user clicks on Signup Login button with different data")
	public void the_user_clicks_on_signup_login_button_with_different_data(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> testData = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> credData: testData) {
			String name = credData.get("Name");
			String email = credData.get("Email");
			
			WebElement username = driver.findElement(By.xpath("//input[@placeholder='Name']"));
			WebElement email1 = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
			
			username.sendKeys(name);
			email1.sendKeys(email);
			
			Thread.sleep(2000);
			
			username.clear();
			email1.clear();
		}
	}
	
	//end of OneHeaderMultipleData

	@Then("Clicks on signup button")
	public void clicks_on_signup_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

	@Then("verify the registration page url")
	public void verify_the_registration_page_url() {
		System.out.println(driver.getCurrentUrl());
	}

	@And("Close the browserr for parameter test")
	public void Close_the_browserr() {
		driver.quit();
	}

}
