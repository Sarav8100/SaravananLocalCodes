@SimpleLogin
Feature: Login functionalities 
@Positive
Scenario: Valid Login
	Given user login page
	When the user enters valid username and password
	When clicks login function button
	Then  user should navigated to home page
	
@Negative	
Scenario: Invalid login
	Given user login page
	When the user enters valid username and password
	When clicks login function button
	Then  user should navigated to home page