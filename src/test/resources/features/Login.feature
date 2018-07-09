@Regression @login
Feature: Login Feature - Interview Nicolas Mori

	@test1
	Scenario: Scenario to test: Sign in
	
		Given I start the browser 
		And I access to this url
		And make a click in a element with this text "Sign in"
		Then complete the email address field to create an account
		And make a click in a button create an account
		Then Fill all fields with correct data 
		And make a click in a element with this text "Register"
		Then My account page controller my account is opened
		Then Proper username is shown in the header
		Then Log out action is available	

	@test2
	Scenario Outline: Scenario to test: Log in
	
		Given I start the browser 
		And I access to this url
		And make a click in a element with this text "Sign in"
		Then Fill Email "<Email>" in Already registered block
		Then Fill Password "<Password>" in Already registered block
		Then My account page controller my account is opened
		Then Proper username is shown in the header
		Then Log out action is available	
    
  Examples:
      | Email  	  						   	| Password      |
      | test.user+1530775546555@gmail.com  	| password      |
    