Feature: This is testing navigation features 

Scenario: Verify that user is navigated to Womens page 
	Given user launches myntra site 
	When user clicks on women menu option 
	Then user should be navigated to womens page 

Scenario: Verify that user is navigated to mens page 
	Given user launches myntra site 
	When user clicks on men menu option 
	Then user should be navigated to mens page 
