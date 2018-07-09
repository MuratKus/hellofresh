@Regression @test2 @linkedIn
Feature: Interview Nicolas Mori

Scenario Outline: Access to the app after make the login.

	Given I start the browser 
	And I access to this url "<url>"
	And make correct login on LNKD
	And make a search of this text "<texto a buscar>" on LNKD
	#And make a click in a button with this text "People"
	And I make click in the button people in the header bar
	#And make a click in a text "Locations" with this exclusive index "2"
	And I am going to verify if this country "<country in location>" appear and, in case no, I am going to add
	
	And Start to connect with the people in the result
	
Examples:
| url		     			| texto a buscar		| country in location	| symbol | equal 	|
| https://www.linkedin.com 	| investor			| sweden  				| +		 | =	 		|
| https://www.linkedin.com 	| cto				| sweden  				| +		 | =	 		|
| https://www.linkedin.com 	| investor			| New York  				| +		 | =	 		|
| https://www.linkedin.com 	| cto				| New York  				| +		 | =	 		|
