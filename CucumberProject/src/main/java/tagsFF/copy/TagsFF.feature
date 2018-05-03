@Important
Feature: Create account of Facebook31
As a user you need to open the Facebook home page

@Smoke 
Scenario: Validate the First name filed1 32
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate create users multiple fields2 33
Given User need to be on Facebook login page
When User enters user "Rian" first name
And User enters user "Jack" surname
Then User checks user "Rian" first name is present
Then User Mobile field should be blank
Then close browser


Scenario: Validate the First name filed3
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser
@Regression
Scenario: Validate the First name filed4
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser
@Smoke
Scenario: Validate the First name filed5
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser
