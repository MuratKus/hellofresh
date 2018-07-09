package com.demo.nicolas.mori.page.object.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;
import com.demo.nicolas.mori.framework.DSL.WebLocatorInWebOrWebMobile;

public class MyAccountPage extends ParentPage {
	
	Logger logger = Logger.getLogger(MyAccountPage.class);

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@WebLocatorInWebOrWebMobile(webElementType = "css", webElementValue = "h1", webMobileElementType = "", webMobileElementValue = "")
	public By getHeading() {
		return getLocator("getHeading");
	}
	
	@WebLocatorInWebOrWebMobile(webElementType = "class", webElementValue = "account", webMobileElementType = "", webMobileElementValue = "")
	public By getAccount() {
		return getLocator("getAccount");
	}
	
	@WebLocatorInWebOrWebMobile(webElementType = "class", webElementValue = "info-account", webMobileElementType = "", webMobileElementValue = "")
	public By getInfoAccount() {
		return getLocator("getInfoAccount");
	}
	
	@WebLocatorInWebOrWebMobile(webElementType = "class", webElementValue = "logout", webMobileElementType = "", webMobileElementValue = "")
	public By getLogOut() {
		return getLocator("getLogOut");
	}
	
	/**
	 * this method verify if some text appear in the element header.
	 * 
	 * @return boolean
	 */
	public boolean verifyIfTheElementHead(String stringToVerify) {
		logger.info("Starting to verify if the element heading have some special text content.");
		waitForAnExplicitElement(getHeading());
		return genericVerifyIfSomeTextExistInSomeLocator(getHeading(), stringToVerify);
	}
	
	/**
	 * this method verify if some text appear in the name and the lastname of the person.
	 * 
	 * @return boolean
	 */
	public boolean verifyTheTextInTheAccountName(String firstName, String lastName) {
		logger.info("Starting to verify the name: "+firstName+", and the lastname: "+lastName+", in the account header.");
		waitForAnExplicitElement(getAccount());
		return genericVerifyIfSomeTextExistInSomeLocator(getAccount(), firstName + " " + lastName);
	}
	
	/**
	 * this method verify some text in the locator info of the account.
	 * 
	 * @return boolean
	 */
	public boolean verifyTheTextInTheInfoAccount(String stringToVerify) {
		logger.info("Starting to verify the String: "+stringToVerify+", in the info account.");
		waitForAnExplicitElement(getInfoAccount());
		return genericVerifyIfSomeTextExistInSomeLocator(getInfoAccount(), stringToVerify);
	}
	
	/**
	 * this method verify if the element logout appear.
	 * 
	 * @return boolean
	 */
	public boolean verifyTheLogoutIsDisplayed() {
		logger.info("Starting to verify if the logout is displayed.");
		waitForAnExplicitElement(getLogOut());
		return genericVerifyIfSomeElementExist(getLogOut());
	}
	
	/**
	 * this method verify if some content appear in the url.
	 * 
	 * @return boolean
	 */
	public boolean verifyIfSomeContentAppearInTheUrl(String stringToVerify) {
		logger.info("Starting to verify if this String: "+stringToVerify+", appear correctly in the url "+getUrl()+".");
		return genericVerifyIfSomeTextAppearInTheURL(stringToVerify);
	}
}
