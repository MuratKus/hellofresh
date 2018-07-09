package com.demo.nicolas.mori.page.object.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;
import com.demo.nicolas.mori.modelclass.NewUsers;
import com.demo.nicolas.mori.testdata.TestData;
import com.demo.nicolas.mori.util.DataGenerator;

public class RegistrationPage extends ParentPage {

	Logger logger = Logger.getLogger(RegistrationPage.class);

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "customer_firstname", webMobileElementType = "id", webMobileElementValue = "customer_firstname")
	public By getFieldFirstName() {
		return getLocator("getFieldFirstName");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "customer_lastname", webMobileElementType = "id", webMobileElementValue = "customer_lastname")
	public By getFieldLastName() {
		return getLocator("getFieldLastName");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "passwd", webMobileElementType = "id", webMobileElementValue = "passwd")
	public By getFieldPass() {
		return getLocator("getFieldPass");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "days", webMobileElementType = "id", webMobileElementValue = "days")
	public By getListDay() {
		return getLocator("getListDay");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "months", webMobileElementType = "id", webMobileElementValue = "months")
	public By getListMonth() {
		return getLocator("getListMonth");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "years", webMobileElementType = "id", webMobileElementValue = "years")
	public By getListYear() {
		return getLocator("getListYear");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "company", webMobileElementType = "id", webMobileElementValue = "company")
	public By getFieldCompany() {
		return getLocator("getFieldCompany");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "address1", webMobileElementType = "id", webMobileElementValue = "address1")
	public By getFieldAddress1() {
		return getLocator("getFieldAddress1");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "address2", webMobileElementType = "id", webMobileElementValue = "address2")
	public By getFieldAddress2() {
		return getLocator("getFieldAddress2");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "city", webMobileElementType = "id", webMobileElementValue = "city")
	public By getFieldCity() {
		return getLocator("getFieldCity");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "id_state", webMobileElementType = "id", webMobileElementValue = "id_state")
	public By getListState() {
		return getLocator("getListState");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "postcode", webMobileElementType = "id", webMobileElementValue = "postcode")
	public By getFieldPostalCode() {
		return getLocator("getFieldPostalCode");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "other", webMobileElementType = "id", webMobileElementValue = "other")
	public By getFieldOther() {
		return getLocator("getFieldOther");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "phone", webMobileElementType = "id", webMobileElementValue = "phone")
	public By getFieldPhone() {
		return getLocator("getFieldPhone");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "phone_mobile", webMobileElementType = "id", webMobileElementValue = "phone_mobile")
	public By getFieldMobile() {
		return getLocator("getFieldMobile");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "alias", webMobileElementType = "id", webMobileElementValue = "alias")
	public By getFieldAlias() {
		return getLocator("getFieldAlias");
	}

	@WebLocatorInWebOrWebMobile(webElementType = "id", webElementValue = "submitAccount", webMobileElementType = "id", webMobileElementValue = "submitAccount")
	public By getButtonSubmit() {
		return getLocator("getButtonSubmit");
	}

	/**
	 * this method fill the form.
	 * 
	 * @param String
	 *            with the firsName
	 * @param String
	 *            with the lastName
	 */
	public void fillTheForm(String firstName, String lastName, String password) {
		logger.info("Starting to fill the form.");
		
		List<NewUsers> listOfUsers = DataGenerator.generateAName();
		
		waitForAnExplicitElement(getFieldFirstName());
		sendStringToLocator(getFieldFirstName(), firstName);
		sendStringToLocator(getFieldLastName(), lastName);
		sendStringToLocator(getFieldPass(), password);
		selectOptionByString(getListDay(), TestData.DAY);
		selectOptionByString(getListMonth(), TestData.MONTH);
		selectOptionByString(getListYear(), TestData.YEAR);
		sendStringToLocator(getFieldCompany(), TestData.COMPANY_NAME);
		sendStringToLocator(getFieldAddress1(), listOfUsers.get(0).getAddress().getStreet());
		sendStringToLocator(getFieldAddress2(), listOfUsers.get(0).getAddress().getSuite());
		sendStringToLocator(getFieldCity(), listOfUsers.get(0).getAddress().getCity());
		selectOptionByString(getListState(), TestData.STATE);
		sendStringToLocator(getFieldPostalCode(), TestData.POSTAL_CODE);
		sendStringToLocator(getFieldOther(), TestData.OTHER);
		sendStringToLocator(getFieldPhone(), TestData.PHONE);
		sendStringToLocator(getFieldMobile(), TestData.MOBILE);
		sendStringToLocator(getFieldAlias(), TestData.ALIAS);
	}

	/**
	 * this emthod make click in the button to submit the form.
	 * 
	 */
	public void submitTheForm() {
		logger.info("Starting to fill the form.");
		click(getButtonSubmit());
	}
}
