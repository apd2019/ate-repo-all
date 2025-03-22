Feature: Check if Ebay is functional

	Scenario: Check if the user is able to search for a product
	
		When The user enters "shirts" keyword
		Then Te user should taken to shirts landing page


	Scenario: Check if the user is able to add items to cart
	
		When The user enters "shirts" keyword
		Then Te user should taken to shirts landing page
		Then Add any shirt product to the shoping cart