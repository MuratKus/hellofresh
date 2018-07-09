package com.demo.nicolas.mori.steps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class RegistrationSteps extends StepsHelper {

	@And("make a click in a button create an account")
	public void makeClickInTheButtonToCreateAnAccount() {
		loginPage.makeClickInCreateAccount();
	}

	@Then("complete the email address field to create an account")
	public void completeTheEmailInTheLoginPage() {
		userEmail = "test.user+" + System.currentTimeMillis() + "@gmail.com";
		loginPage.setANewUserEmail(userEmail);
	}

	@And("Fill all fields with correct data")
	public void completeTheRegistrationForm() {
		registrationPage.fillTheForm(userFirstName, userLastName, userPassword);
	}

	@Then("My account page controller my account is opened")
	public void verifyIfMyAccountIsOpen() {
		Assert.assertTrue(myAccountPage.verifyIfSomeContentAppearInTheUrl("controller=my-account"),
				"appear a problem at the moment to verify the url in my account page.");
		if (!System.getProperty("testingType").contains("mobile")) {
			Assert.assertTrue(myAccountPage.verifyIfTheElementHead("MY ACCOUNT"),
					"appear a problem at the moment to verify the header in my account page.");
		}
	}

	@Then("Proper username is shown in the header")
	public void verifyUserNameInMyAccountPage() {
		if (!System.getProperty("testingType").contains("mobile")) {
		Assert.assertTrue(myAccountPage.verifyTheTextInTheAccountName(userFirstName, userLastName),
				"appear a problem at the moment to verify the firstname and the lastname in my account.");
		}
	}

	@Then("Log out action is available")
	public void verifyLogoutInMyAccountPage() {
		if (!System.getProperty("testingType").contains("mobile")) {
		Assert.assertTrue(myAccountPage.verifyTheLogoutIsDisplayed(),
				"appear a problem at the moment to verify if the logout is available in my account page.");
		}
	}

}