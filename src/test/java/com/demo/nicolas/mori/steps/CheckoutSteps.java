package com.demo.nicolas.mori.steps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CheckoutSteps extends StepsHelper {

	@Then("click in the button Proceed to checkout")
	public void makeClicksInTheProcessOfCheckoutsButtons() {
		checkoutProcessPage.makeClickInTheButtonProceedToCheckout1();
		checkoutProcessPage.makeClickInTheButtonProceedToCheckout2();
		checkoutProcessPage.makeClickInTheButtonProceedToCheckout3();
	}

	@And("Make click in the checkbox Terms of service")
	public void acceptTermsAndConditionsAndPressInTheButtonChekcout() {
		checkoutProcessPage.acceptTerminsAndMakeClickInTheButtonProceedToCheckout4();
	}

	@Then("Click by payment method Pay by bank wire")
	public void clickInTheLastCehckoutButton() {
		checkoutProcessPage.selectPaymentAndPay();
	}

	@Then("Order confirmation page is opened")
	public void verifyOrderConfirmation1() {
		Assert.assertTrue(checkoutProcessPage.verifyIfSomeContentAppearInTheUrl("controller=order-confirmation"),
				"Appear a problem at the moment to verify the content in the url of the order confirmation.");

	}

	@Then("The order is complete")
	public void clickInfffTheLastCehckoutButton() {
		Assert.assertTrue(checkoutProcessPage.verifyIfTheOrderConfirmation1IsDisplayed(),"Appear a problem at the moment to verify the order confirmation 1");
		Assert.assertTrue(checkoutProcessPage.verifyIfTheOrderConfirmation2IsDisplayed(),"Appear a problem at the moment to verify the orden cofirmation 2");
	}

	@Then("Current page is the last step of ordering")
	public void clickInTheLastCehckouffffftButton() {
		Assert.assertTrue(checkoutProcessPage.verifyTheTextInTheOrderConfirmation3().contains("Your order on My Store is complete"));
	}
}