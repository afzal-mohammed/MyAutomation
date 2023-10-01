Feature: How to parameterize step 

Scenario Outline: Verify that user is navigated to Womens page 
	Given user launches myntra site 
	When clicks on '<option>' menu 
	Then I should be navigated to '<expectedTitle>' page 
	
	Examples: 
		|option          | expectedTitle |
		| Women 		 | Women         |
		| Kids			 | Kids          |
		| Beauty		 | Personal    	 |
		| Home & Living  | Living  		 |
