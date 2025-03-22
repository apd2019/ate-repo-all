Feature: Automation Excercise Registration Flow Scenarios

Background: 
	Given The user is on Automation Excercise Demo website
	
#NoHeaderDataExample
Scenario: Check if the user is navigated to sign up page on entering valid email
	When The user clicks on sign up/login link
	Then The user enters in valid username and the email ID
	| Tester1 | testerapd@email.com 	|
	| Tester2 | testerapd22@email.com	|
	
	And Clicks on signup button
	Then verify the registration page url
	Then Close the browserr for parameter test
	
#OneHeaderOneData
Scenario: Check if the user is thrown with Error message on entering exisitng email Id
		When The user clicks on sign up/login link
		Then The user enters existing username and email Id
		| Name			| Email						|	
		| Tester1			| testerapd@email.com |
		And Clicks on signup button
		Then Check if Email Id already existing message is coming up
		|	ErrorMessage							 |	
		|Email Address already exist!|
		And Close the browserr for parameter test
	


#OneHeaderMultipleData
Scenario: Check if the Signup section is able to validate with different data
		When The user clicks on sign up/login link
		When The user clicks on Signup Login button with different data
		|Name			|	Email				|
		| Test1			| Tester@Test.com |
		| %%%%5			| %%#$#$#$#4 |
		| Test112			| $%$%$% |
		| Test1			| Tester@Test.com |	
		And Clicks on signup button
		And Close the browserr for parameter test