@Regression @Case_1A3
Feature: Interview Nicolas Mori 

Scenario Outline: Access to the app after make the login. 

	Given I start the browser 
	And I access to this url "<url>"
	And I set the name of the city "<city>"
	And I login to the web application 
	Then I press in the menu Transfers 
	And I select te first of my favorites contacts 
	And I set in the amount field the amount 
	And I include in the text reference this test 
	And I access the Transfer Code 
	And I press the button Transfer 
	Then I check if I can see the pop up message. 
	
	Examples: 
		| device uuid     	| url					 	 |  url					 	 | 
		| 8575525242395141 	| http://www.wg-gesucht.de/	 | pepe						| 
		