Feature: Create account of Facebook2
As a user you need to open the Facebook home page


Scenario Outline: Validate create users multiple fields21

Given User need to be on Facebook login page
When User enters user "<User>" first name
When User enters user "<Surname>" surname
And User enters mobile "<Mobile>" number
Then User checks user "<User>" first name is present
Then User Mobile field should not be blank
Then close browser

Examples:
|   User  |   Surname | Mobile |
|Tom      | Cruise    |12365   |
|Ram      |Nayak      |87788   |
