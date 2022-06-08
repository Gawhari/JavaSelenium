Feature: featrue to test Udemy searchbar  
@UnitTest
Scenario: Checking search functionality 

Given User is on login pgae
And User is click on LearningPath
When User enter text into searchbar
And User hits Enterkey
Then User is navegated to the search result
And: 