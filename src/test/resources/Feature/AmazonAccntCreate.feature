
Feature: Create an Account on Amazon
@TryTest
Scenario: Account Creation On Amazon page
Given User is on Create Accoun page
When User enter value name and EmailAddress
And User  enter password on passwordfeild
And User re-enter password on passwordfeild
Then User is click on CreateYourAmazonAccount Button