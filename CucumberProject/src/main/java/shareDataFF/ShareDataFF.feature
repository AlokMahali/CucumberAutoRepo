Feature: Create account of Facebook21
As a user you need to open the Facebook home page


Scenario: Validate the First name filed22

Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present

Scenario: Validate create users multiple fields23

Given User need to be on Facebook login page
When User enters user "Rian" first name
And User enters user "Jack" surname
Then User checks user "Rian" first name is present
Then User Mobile field should be blank
