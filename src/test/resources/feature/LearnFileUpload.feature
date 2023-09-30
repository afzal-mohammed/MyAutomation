Feature: This is about learning how to handle Alerts/Pop-up/Modal

Scenario: Test file upload scenario
	Given I launch omayo website
	When I click on Choose file button and upload a file
	Then my file should be uploaded 