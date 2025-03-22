Feature: Login Functionality

  Scenario Outline: Validate the login functionality with different combination of data
    Given The user launches the app in chrome browser
    When The user enters in "<username>" and "<password>"
    Then Click on Login button
    Then Check if the user is successfully logged in
    And Close the browser
	
	
	Examples:
	
	|username| password|
	|tomsmith| SuperSecretPassword!|
	|test1| testpassword|