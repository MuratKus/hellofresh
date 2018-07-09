@Regression @wg_Mobile
Feature: Interview Nicolas Mori 

Scenario Outline: Access to the app after make the login. 

	Given I start the android native app with this uuid "<uuid>" and this appPackage "<appPackage>"
	And I make click in the button munich
	And I set the name of the city "<city>"
	And I login to the web application 
	
	Examples: 
		| device uuid   	| url					 	 | appPackage  				| 
		| 8575525242395141 	| http://www.wg-gesucht.de/	 | com.wggesucht.android 	| 
		