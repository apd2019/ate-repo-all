Feature: Smoke Test of Ebay Website

Background: 
	Given The user is on the landing page of Ebay site on Chrome browser
	
Scenario: Check if the user is able to search for a product

When The user enters in "shirts" keyword
Then The user should be taken to the shirts landing page
And Close the browser

Scenario: Check if the user is able to add items to cart

When The user enters in "shirts" keyword
Then The user should be taken to the shirts landing page
Then add any shirt product to the shopping cart
And Close the browser 