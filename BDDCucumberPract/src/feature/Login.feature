Feature: feature.Login.feature

  Scenario: check if the user is able to login with valid credentials
    Given The user launches the app in chrome browser
    When The user enters in valid credentials
    Then Click on Login button
    Then Check if the user is successfully logged in
    And Close the browser

