@Regression @test2 @kayak
Feature: Interview Nicolas Mori

Scenario Outline: Access to the app after make the login.

	Given I start the browser 
	And I access to this url "<url>"
	#And I complete the form of the home with this origin "<origin>" flight
	#And I complete the form of the home with this destiny "<destiny>" flight
	#And I complete the form of the home with this departure "<departure>" date
	#And I complete the form of the home with this back "<back>" date
	And change the selector for one way
	And set the origin "<origin>" flight
	And set the destiny "<destiny>" flight
	And set the date "11/12/2018"
	And press the button search

	#And make the search for this dates
	#      | 11/12/2018 |
	#      | 12/12/2018 |
	#      | 13/12/2018 |
	#      | 15/12/2018 |
	#      | 16/12/2018 |
	#      | 17/12/2018 |
	#      | 18/12/2018 |
	
Examples:
| url		     			| origin	 | destiny			 | departure	 | back	 |
| https://www.kayak.es/ 	| Roma		 | buenos aires 	 | +		 | =	 |



