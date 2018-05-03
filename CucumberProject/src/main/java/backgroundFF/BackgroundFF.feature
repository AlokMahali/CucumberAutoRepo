Feature: Create account of Facebook1
As a user you need to open the Facebook home page

Background: common steps
Given User need to be on Facebook login page

Scenario: Validate the First name filed12

When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

Scenario: Validate create users multiple fields13

When User enters user "Rian" first name
And User enters user "Jack" surname
Then User checks user "Rian" first name is present
Then User Mobile field should be blank
Then close browser