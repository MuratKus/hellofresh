package com.demo.nicolas.mori.steps;

import org.testng.Assert;

import com.demo.nicolas.mori.modelclass.Results;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackendSteps extends StepsHelper {

	@Given("I start the backend services")
	public void StartTheBackendTesting() {
		startBackMethods();
		listOfResults = getMethods.getAllTheCountriesnAndReturnInAListOfObjects();
	}

	@And("make a call to receive all the information of the country alpha code \"([^\"]*)\"")
	public void makeACallInTheExclusiveServiceAndReceiveAllTheInformationOfACountry(String someCodeOfCountry) {
		singleCountryInfo = getMethods.getTheJsonAndReturn1Result(someCodeOfCountry);
	}

	@Then("validate if the exlusive for just a country service response the name \"([^\"]*)\", appear in the response correctly")
	public void validateFromTheDataForACountryTheNameInTheExclusiveService(String countryNameToValidate) {
		Assert.assertTrue(singleCountryInfo.getName().equals(countryNameToValidate),
				"Appear a problem at the moment to validate the name of the country, with the single result of country");
	}

	@Then("validate if the exlusive for just a country service response the code \"([^\"]*)\", in the code alpha code")
	public void validateTheCode3InTheExclusiveService(String code3) {
		Assert.assertTrue(singleCountryInfo.getAlpha3_code().equals(code3),
				"Appear a problem at the moment to validate the code 3 of the country, with the single result of country");
	}

	@Then("validate if the service response the name \"([^\"]*)\", appear in the response correctly")
	public void validateFromTheDataForACountryTheName(String countryNameToValidate) {
		Assert.assertTrue(nameToValidate.equals(countryNameToValidate),
				"Appear a problem at the momento to validate the name of the country");
	}

	@Then("validate if the service response the code 3 \"([^\"]*)\", in the code alpha3_code")
	public void validateTheCode3(String code3) {
		Assert.assertTrue(alpha3ToValidate.equals(code3),
				"Appear a problem at the momento to validate the code alpha3_code");
	}

	@And("from the list of the countries find the information of this alpha2_code \"([^\"]*)\"")
	public void findTheInformationOfACountryInsideOfTheList(String someCodeOfCountry2) {
		for (Results result : listOfResults) {
			if (result.getAlpha2_code().equals(someCodeOfCountry2)) {
				nameToValidate = result.getName();
				alpha3ToValidate = result.getAlpha3_code();
			}
		}
	}

	@And("make a call to the wrong code alpha code \"([^\"]*)\"")
	public void findTheInformationOfACountryInsideOfTheLissst(String someWrongCode) {
		messageResponse = getMethods.getTheJsonAndReturn1Message(someWrongCode);
	}

	@Then("I expect to receive an error message with this content \"([^\"]*)\"")
	public void negativeTestCase(String errorMessage) {
		Assert.assertTrue(messageResponse.contains(errorMessage),
				"Appear a problem at the to validate the error message.");
	}

	@Then("make a post to send the information to the API of a new country \"([^\"]*)\"")
	public void makeAPost(String newCountry) {
		postStatusResponse = postMethods.postANewCountry(newCountry);
	}

	@Then("validate the code inside of response is equal to \"([^\"]*)\"")
	public void makeAPoste(String statusCodeToValidate) {
		Assert.assertTrue(postStatusResponse.equals(statusCodeToValidate),
				"Appear a problem at the to validate status code of the post message.");
	}

}