package com.demo.nicolas.mori.steps;

import org.apache.log4j.Logger;

import cucumber.api.java.en.And;

public class StepsGeneric extends StepsHelper {

	private Logger logger = Logger.getLogger(StepsGeneric.class);

	@And("make a click in a element with this text \"(.*?)\"")
	public void genericStepMakeClickInSomeText(String someTextToFind) {
		logger.info(
				"Start to make click in some element with this text: " + someTextToFind + ", this Step is generic.");
		genericPage.genericPageMakeClickInSomeElementContainsSomeText(someTextToFind);
	}
}