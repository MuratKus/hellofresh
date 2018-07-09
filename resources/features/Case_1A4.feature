@Regression @Case_1A4
Feature: Facebook messages

Scenario Outline: Access to facebook with a user and pass and make a message.

	Given I start the browser 
	#And I close the second tab and put the focus in the first tab
	And I access to this url "<url>"
	And I set a big waiter to work in the web
	#And I set the name of the city "<city>"
	#And I login to the web application 
	#Then I press in the menu Transfers 
	#And I select te first of my favorites contacts 
	#And I set in the amount field the amount 
	#And I include in the text reference this test 
	#And I access the Transfer Code 
	#And I press the button Transfer 
	#Then I check if I can see the pop up message. 
	
	Examples: 
		| device uuid     	| url					 	 |
		| 8575525242395141 	| https://www.facebook.com/	 |		
		#| 8575525242395141 	| https://www.clarin.com/	 |	
		