Feature: Rahul Shutty Page
@SmokeTest1
Scenario Outline: Checking Account Crearting functionality 
Given User is on crating page
When User is enter <fullName> and <Email> 
And User is enter <password>
Then User is click on check button
And User is hit SighUp button 

Example:  
|fullName|Email|password|
|John  |John@gmail.com|123456|
|Kiven |Kiven@gmail.com|10214|