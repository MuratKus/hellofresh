@Regression @wg_get_all
Feature: Twitter - interview Nicolas Mori

Scenario Outline: Access to twitter and write a post.

#Given I start to the browser and set this url "<url>"
#And I set the name of the city "<city>"
#Then I select the option of dept type and set "<deptType>" press the button find
#Then I set the max value of rent to pay with the value "<maxRentValue>" and press the button apply filter
#And I access to the options of depart
#And I check if the british falg exit
#And I take if exist the value of requisites and show in the screen

	Given I start the browser 
	And I access to this url "<url>"
	
	And I set the name of the city "<city>"
	And I select the value from the suggestions list with the city "<city>"
	Then I select the option of dept type and set "<deptType>"
	And I press the button search
	And press click in the login button and semd user "<user>" and pass "<pass>" 
	
	#And I get all the apartments and verify this
	And I apply the filters and the max cost value "<maxRentValue>" and "<flat>" and "<numOfRooms>" and the balcony in "balcony"
	And I get the text of all the results an show this per terminal

Examples:
| browser 	| city  	| url						 	| deptType			| maxRentValue  | user					 	   | pass	 	| flat  | numOfRooms | balcony  |
| chrome  	| München   | http://www.wg-gesucht.de/		| Wohnung			| 1200			| niels.goldsmith+36@gmail.com | A45224610b | false	| 1			 | false	|
#| chrome  	| Berlin    | http://www.wg-gesucht.de/		| Wohnung			| 1200			| niels.goldsmith+35@gmail.com | A45224610b | false	| 1			 | false	|
#| chrome  	| Berlin    | http://www.wg-gesucht.de/		| WG-Zimmer			| 1200			| niels.goldsmith+35@gmail.com | A45224610b | false	| 1			 | false	|


                                            
                                        


#1-Zimmer-Wohnung
#Wohnung
#Haus