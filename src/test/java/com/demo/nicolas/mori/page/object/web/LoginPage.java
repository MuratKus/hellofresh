package com.demo.nicolas.mori.page.object.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class LoginPage extends ParentPage {

	private Logger logger = Logger.getLogger(LoginPage.class);

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "email", webMobileElementType = "id", webMobileElementValue = "email")
	public By getFieldUserEmail() {
		return getLocator("getFieldUserEmail");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "passwd", webMobileElementType = "id", webMobileElementValue = "passwd")
	public By getFieldPassword() {
		return getLocator("getFieldPassword");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "SubmitLogin", webMobileElementType = "id", webMobileElementValue = "SubmitLogin")
	public By getButtonSubmit() {
		return getLocator("getButtonSubmit");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "email_create", webMobileElementType = "id", webMobileElementValue = "email_create")
	public By getFieldNewEmail() {
		return getLocator("getFieldNewEmail");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "SubmitCreate", webMobileElementType = "id", webMobileElementValue = "SubmitCreate")
	public By getButtonCreateAccount() {
		return getLocator("getButtonCreateAccount");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "css", webElementValue = "h1", webMobileElementType = "id", webMobileElementValue = "h1")
	public By getMyAccountHeading() {
		return getLocator("getMyAccountHeading");
	}

	/**
	 * this method set the value of a email to create a new user.
	 * 
	 * @param String
	 *            with a new email address.
	 */
	public void makeClickInCreateAccount() {
		logger.info("Starting to make click in the button create account.");
		waitForAnExplicitElement(getButtonCreateAccount());
		clickJSx2(getButtonCreateAccount());
	}

	/**
	 * this method set the value of a email to create a new user.
	 * 
	 * @param String
	 *            with a new email address.
	 */
	public void setANewUserEmail(String user) {
		logger.info("Starting to send the value " + user + " to the field email.");
		waitForAnExplicitElement(getFieldNewEmail());
		sendStringToLocator(getFieldNewEmail(), user);
	}

	/**
	 * this method set the username.
	 * 
	 * @param String
	 *            with a email address.
	 */
	public void setTheUserName(String userName) {
		logger.info("Starting to set the username: " + userName + ".");
		waitForAnExplicitElement(getFieldUserEmail());
		sendStringToLocator(getFieldUserEmail(), userName);
	}

	/**
	 * this method set the password.
	 * 
	 * @param String
	 *            with a password.
	 */
	public void setThePassword(String password) {
		logger.info("Starting to send this password: " + password + ".");
		waitForAnExplicitElement(getFieldUserEmail());
		sendStringToLocator(getFieldPassword(), password);
	}

	/**
	 * this method make click in the button login.
	 * 
	 */
	public void makeClickInLogin() {
		logger.info("Starting to press in the button login.");
		click(getButtonSubmit());
		waitForAnExplicitElement(getMyAccountHeading());
	}
}
