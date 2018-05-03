Feature: Create account of Facebook10
As a user you need to open the Facebook home page


Scenario: Validate the First name filed11

Given User need to be on Facebook login page
When User enters the first name
Then User checks user first name is present

#Scenario: Validate create users multiple fields

#Given User need to be on Facebook login page
#When User enters the first name
#And User enters surname
#Then User checks user first name is present
#And User checks user surname name is present
#But User Mobile field should be blank