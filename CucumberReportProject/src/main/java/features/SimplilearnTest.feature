Feature: Test SimpliLearn Website

Scenario: Check if the user is able to search for courses

	Given The user is on the SimpliLearn website
	When The user enters any course and click on search
	Then Verify the appropriate course landing page is displayed