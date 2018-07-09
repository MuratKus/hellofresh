@Regression @test
Feature: Backend Features - Interview Nicolas Mori

	@test3
	Scenario Outline: Scenario to test: Checkout
	
		Given I start the browser 
		And I access to this url "http://automationpractice.com/index.php"
		And make a click in a element with this text "Sign in"
		Then Fill Email "<Email>" in Already registered block
		Then Fill Password "<Password>" in Already registered block
		And make a click in a element with this text "Women"
		And make a click in a element with this text "Faded Short Sleeve T-shirts"
		And make a click in a element with this text "Add to cart"
		Then click in the button Proceed to checkout
		And Make click in the checkbox Terms of service
		Then Click by payment method Pay by bank wire
		Then Order confirmation page is opened
		Then The order is complete.
		Then Current page is the last step of ordering
    
  Examples:
      | Email  	  						   	| Password      |
      | test.user+1530775546555@gmail.com  	| password        |
