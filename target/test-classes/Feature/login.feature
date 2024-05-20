Feature: Login functionality

Scenario: Valid login
  Given I am on the login screen
  When I enter valid credentials
  Then I should be logged in successfully

Scenario: Invalid login
  Given I am on the login screen
  When I enter invalid credentials
  Then I should see an error message

Scenario: Empty fields
  Given I am on the login screen
  When I leave the fields empty
  Then I should be prompted to fill in the fields