package com.demo.nicolas.mori.page.object.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class GenericPage extends ParentPage {
	
	Logger logger = Logger.getLogger(GenericPage.class);

	public GenericPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * this method make click in the symbol declared in the feature file.
	 * 
	 * @param String
	 *            with the text in the button
	 * 
	 */
	public void genericPageMakeClickInSomeButtonContainsSomeText(String stringInTheElement) {
		genericClickByButtonContainsSomeText(stringInTheElement);
	}
	
	/**
	 * this method make click in some element with some especific text.
	 * 
	 * @param String
	 *            with the text in the element
	 * 
	 */
	public void genericPageMakeClickInSomeElementContainsSomeText(String stringInTheElement) {
		genericClickByContainsSomeText(stringInTheElement);
	}

	/**
	 * this method make click in the symbol declared in the feature file.
	 * 
	 * @param String
	 *            with the text
	 * @param String
	 *            with the index
	 */
	public void genericPageMakeClickContainsSomeTextWithSomeIndex(String stringInTheElement, String indexOfTheElement) {
		genericClickByContainsSomeTextAndWithSomeSpecificIndex(stringInTheElement, indexOfTheElement);
	}
}
