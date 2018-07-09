@Regression @getElements
Feature: Twitter - interview Nicolas Mori

Scenario Outline: Access to twitter and write a post.

Given I start the special browser "<mobile emulation>"
And I access to this url "<url>"
And I get all the elements
#Then I set the max value of rent to pay with the value "<maxRentValue>" and press the button apply filter
#And I access to the options of depart
#And I check if the british falg exit
#And I take if exist the value of requisites and show in the screen
#soy nico

Examples:
| browser 	| city  	| url						| mobile emulation	| maxRentValue  |
| chrome  	| München	| https://healthplans.com/	| true				| 750			|
| chrome  	| München	| https://healthplans.com/	| false				| 750			|



#1-Zimmer-Wohnung
#Wohnung
#Haus