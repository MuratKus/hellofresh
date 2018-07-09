package com.demo.nicolas.mori.steps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginSteps extends StepsHelper {

	@Then("Fill Email \"(.*?)\" in Already registered block")
	public void fillTheUserName(String userName) {
		loginPage.setTheUserName(userName);
	}

	@And("Fill Password \"(.*?)\" in Already registered block")
	public void fillThePassword(String password) {
		loginPage.setThePassword(password);
		loginPage.makeClickInLogin();
	}

}