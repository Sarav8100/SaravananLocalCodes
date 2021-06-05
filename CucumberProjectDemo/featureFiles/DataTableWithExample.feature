Feature: This is the login feature for Orange HRM
Scenario Outline: This is login scenario
	Given Proceed to login page
	When users enters "<Username>" and "<Password>"
	
	And clicked button
	
	Examples:
	|Username| Password|
	|Admin| admin123|
	|Admin| admin13|