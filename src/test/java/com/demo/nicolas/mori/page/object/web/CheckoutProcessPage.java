package com.demo.nicolas.mori.page.object.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class CheckoutProcessPage extends ParentPage {

	Logger logger = Logger.getLogger(CheckoutProcessPage.class);

	public CheckoutProcessPage(WebDriver driver) {
		super(driver);
	}

	@WebLocatorInWebOrWebMobile(webElementType = "xpath", webElementValue = "//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']", webMobileElementType = "id", webMobileElementValue = "email")
	public By buttonProcessToCheckout1() {
		return getLocator("buttonProcessToCheckout1");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "xpath", webElementValue = "//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']", webMobileElementType = "id", webMobileElementValue = "email")
	public By buttonProcessToCheckout2() {
		return getLocator("buttonProcessToCheckout2");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "name", webElementValue = "processAddress", webMobileElementType = "id", webMobileElementValue = "email")
	public By buttonProcessToCheckout3() {
		return getLocator("buttonProcessToCheckout3");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "uniform-cgv", webMobileElementType = "id", webMobileElementValue = "email")
	public By checkboxTerms() {
		return getLocator("checkboxTerms");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "name", webElementValue = "processCarrier", webMobileElementType = "id", webMobileElementValue = "email")
	public By buttonProcessToCheckout4() {
		return getLocator("buttonProcessToCheckout4");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "class", webElementValue = "bankwire", webMobileElementType = "id", webMobileElementValue = "email")
	public By buttonBankTransfer() {
		return getLocator("buttonBankTransfer");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "xpath", webElementValue = "//*[@id='cart_navigation']/button", webMobileElementType = "id", webMobileElementValue = "email")
	public By buttonMakeThePayment() {
		return getLocator("buttonMakeThePayment");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "css", webElementValue = "h1", webMobileElementType = "id", webMobileElementValue = "email")
	public By heading() {
		return getLocator("heading");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "xpath", webElementValue = "//li[@class='step_done step_done_last four']", webMobileElementType = "id", webMobileElementValue = "email")
	public By ordenConfirmation1() {
		return getLocator("ordenConfirmation1");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "xpath", webElementValue = "//li[@id='step_end' and @class='step_current last']", webMobileElementType = "id", webMobileElementValue = "email")
	public By ordenConfirmation2() {
		return getLocator("ordenConfirmation2");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "xpath", webElementValue = "//*[@class='cheque-indent']/strong", webMobileElementType = "id", webMobileElementValue = "email")
	public By ordenConfirmation3() {
		return getLocator("ordenConfirmation3");
	}

	/**
	 * this method verify if some content appear in the url.
	 * 
	 * @return boolean
	 */
	public boolean verifyIfSomeContentAppearInTheUrl(String stringToVerify) {
		logger.info("Starting to verify if this String: " + stringToVerify + ", appear correctly in the url " + getUrl()
				+ ".");
		return genericVerifyIfSomeTextAppearInTheURL(stringToVerify);
	}

	/**
	 * this method return bolean in case the orden corfirmation 1 is correctly
	 * displayed.
	 * 
	 * @return boolean
	 */
	public boolean verifyIfTheOrderConfirmation1IsDisplayed() {
		logger.info("Starting to verify if the order confimration 1 is displayed.");
		waitForAnExplicitElement(ordenConfirmation1());
		return verifyIfisDisplayed(ordenConfirmation1());
	}

	/**
	 * this method return bolean in case the orden corfirmation 2 is correctly
	 * displayed.
	 * 
	 * @return boolean
	 */
	public boolean verifyIfTheOrderConfirmation2IsDisplayed() {
		logger.info("Starting to verify if the order confimration 2 is displayed.");
		waitForAnExplicitElement(ordenConfirmation2());
		return verifyIfisDisplayed(ordenConfirmation2());
	}

	/**
	 * this method return an string with the text in the order confirmation 3.
	 * 
	 * @return boolean
	 */
	public String verifyTheTextInTheOrderConfirmation3() {
		logger.info("Starting to retrive the text inside of the order confirmation 3.");
		waitForAnExplicitElement(ordenConfirmation3());
		return getTextByLocator(ordenConfirmation3());
	}

	/**
	 * this method return the text in the heading.
	 * 
	 */
	public String returnTextInTheHeading() {
		logger.info("Starting to find the text displayed in the heading.");
		waitForAnExplicitElement(heading());
		return getTextByLocator(heading());
	}

	/**
	 * this method select the payment method and press in the button checkout.
	 * 
	 */
	public void selectPaymentAndPay() {
		logger.info("Starting to select the payment method and make click in chekcout button.");
		waitForAnExplicitElement(buttonBankTransfer());
		click(buttonBankTransfer());
		click(buttonMakeThePayment());
	}

	/**
	 * this method accept the terms and make click in the proccess to checkout
	 * button 4.
	 * 
	 */
	public void acceptTerminsAndMakeClickInTheButtonProceedToCheckout4() {
		logger.info("Starting to make click in the checkbox and press in the button proceed to checkout 4.");
		waitForAnExplicitElement(buttonProcessToCheckout4());
		click(checkboxTerms());
		click(buttonProcessToCheckout4());
	}

	/**
	 * this method make click in the button proceed to checkout 1
	 * 
	 */
	public void makeClickInTheButtonProceedToCheckout1() {
		logger.info("Starting to make click in the button proceed to checkout 1.");
		waitForAnExplicitElement(buttonProcessToCheckout1());
		click(buttonProcessToCheckout1());
	}

	/**
	 * this method make click in the button proceed to checkout 2
	 * 
	 */
	public void makeClickInTheButtonProceedToCheckout2() {
		logger.info("Starting to make click in the button proceed to checkout 2.");
		waitForAnExplicitElement(buttonProcessToCheckout2());
		click(buttonProcessToCheckout2());
	}

	/**
	 * this method make click in the button proceed to checkout 3
	 * 
	 */
	public void makeClickInTheButtonProceedToCheckout3() {
		logger.info("Starting to make click in the button proceed to checkout 3.");
		waitForAnExplicitElement(buttonProcessToCheckout3());
		click(buttonProcessToCheckout3());
	}

}
