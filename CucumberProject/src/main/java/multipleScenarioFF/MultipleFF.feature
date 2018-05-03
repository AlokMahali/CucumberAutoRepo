Feature: Create account of Facebook8
As a user you need to open the Facebook home page


Scenario: Validate the First name filed81

Given User need to be on Facebook login page
When User enters the first name
Then User checks user first name is present
Then close browser

Scenario: Validate create users multiple fields82

Given User need to be on Facebook login page
When User enters the first name
And User enters surname
Then User checks user first name is present
Then User Mobile field should be blank
And close browser