@Regression @backend
Feature: Backend Feature - Interview Nicolas Mori

	@test5
	Scenario Outline: Get all countries and validate that US, DE and GB were returned in the response
		Given I start the backend services
		And from the list of the countries find the information of this alpha2_code "<alpha2_code>"
		Then validate if the service response the name "<country_name>", appear in the response correctly
    		Then validate if the service response the code 3 "<alpha3_code>", in the code alpha3_code 
		
	Examples:
      | country_name  	  										| alpha2_code	 | alpha3_code	|
      | United States of America  								| US	     	 	 | USA		  	|
      | Germany  												| DE     	 	 | DEU		  	|
      | United Kingdom of Great Britain and Northern Ireland  	| GB	     	 	 | GBR		  	|
      
	@test6
	Scenario Outline: Get each country (US, DE and GB) individually and validate the response

		Given I start the backend services
		And make a call to receive all the information of the country alpha code "<alpha2_code>"
		Then validate if the exlusive for just a country service response the name "<country_name>", appear in the response correctly
    		Then validate if the exlusive for just a country service response the code "<alpha3_code>", in the code alpha code
    	
	Examples:
      | country_name  	  										| alpha2_code	 | alpha3_code	|
      | United States of America  								| US	     	 	 | USA		  	|
      | Germany  												| DE     	 	 | DEU		  	|
      | United Kingdom of Great Britain and Northern Ireland  	| GB	     	 	 | GBR		  	|
	
	@test7
	Scenario Outline: Try to get information for inexistent countries and validate the response
	
		Given I start the backend services
		And make a call to the wrong code alpha code "<wrong code>"
		Then I expect to receive an error message with this content "No matching country found for requested code"
    	
	Examples:
      | wrong code	 | 
      | U9	     	 | 
      | %%%	  	  	 | 
      
     @test8
	Scenario: Write a test that would validate new country addition using POST
	
		Given I start the backend services
		#Then make a post to send the information to the API of a new country "AR"
    		#Then validate the code inside of response is equal to "200"
	