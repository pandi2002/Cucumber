Feature: To verify login functionality
Scenario: To verify login with valid credential
Given User is on login page
When User Enter valid username and valid password
And  Click on login button
Then User should navigate on next page 
 