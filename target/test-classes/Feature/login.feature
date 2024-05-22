Feature: Login functionality

  Background:
    Given I am on the login screen


  Scenario: Valid login
  When I enter valid credentials
  Then I should be logged in successfully

Scenario: Invalid login
  When I enter invalid credentials
  Then I should see an error message

Scenario: Empty fields
  When I leave the fields empty
  Then I should be prompted to fill in the fields