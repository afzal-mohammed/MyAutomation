Feature: This is testing navigation features 

Scenario: Verify that user is navigated to Womens page 
	Given user launches myntra site 
	When user clicks on women menu option 
	Then user should be navigated to womens page 

Scenario: Verify that user is navigated to mens page 
	Given user launches myntra site 
	When user clicks on men menu option 
	Then user should be navigated to mens page 
	
	Scenario: Verify that user is navigated to wishlist page
	Given user launches myntra site
	When user clicks on wishlist option
	Then user should be navigated to wishlist page

 Scenario: Verify that user is navigated to watches page
 Given user launches myntra site
 When user enters watches in search bar
 And user clicks on search button
 Then watches page should be displayed

 Scenario: Verify that user is navgated to kids page
 Given user launches myntra site
 When user clicks on kids option
 Then kids page should be displayed
 
 Scenario: Verify that user is navgated to home & living page
 Given user launches myntra site
 When user clicks on home & living option
 Then home & living page should be displayed
 
 Scenario: Verify that user is navigated to beauty page
 Given user launches myntra site
 When user clicks on beauty option
 Then beauty page should be displayed
 