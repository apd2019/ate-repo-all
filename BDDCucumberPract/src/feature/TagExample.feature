Feature: Check if the uber website is functionally working

Background:
		Given The user is in the uber landing page
		
@SmokeTest @RegressionTest @ChromeBrowser
Scenario: Check if the user is able to view the uber website
Then verify the page title and url

@SmokeTest @RegressionTest @BookCab
Scenario: Check if the user is able to search for any cabs
When The user enters source and destination location
Then click on search prices
Then check if the cab details are displayed

@SmokeTest @RegressionTest @ChromeBrowser
Scenario: Check if the user is able to login to the app
When The user on login link
Then The user should be taken to the login section

@RegressionTest @BookCab @ChromeBrowser
Scenario: Check if the user is able to complete payment with VISA card
When The user completes the ride
Then Check if the user is able to complete the payment with VISA

@RegressionTest @ChromeBrowser
Scenario: Check if the user is able to update the language
When The user click on "EN" language switch option
Then The user should be able to select language