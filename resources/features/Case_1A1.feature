@Regression @Case_1A1
Feature: Interview Nicolas Mori

Scenario Outline: Access to the app after make the login.

Given I start the android native calculator with this device "<device uuid>"
And make the login into the app
And access to the app

Examples:
| device uuid     	| first number 	| second number | symbol | equal |
| 8575525242395141 	| 23031981		| 22323			| +		 | =	 |