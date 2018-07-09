@Regression @fb_add_a_group
Feature: Interview Nicolas Mori

Scenario Outline: Access to the app after make the login.

	Given I start the browser 
	And I access to this url "<url>"
	And make correct login on FB
	
	#And example of step
	And set this text "<group name>" in the field to search and press search
	And make click in see all, to see all the groups
	And find this group "<group name>" in the list of groups and in we can press in the button participate

Examples:
| url		     				| group name 					| second number | symbol | equal |
| https://www.facebook.com/ 	| Club Estudiantes de La Plata	| 22323			| +		 | =	 |