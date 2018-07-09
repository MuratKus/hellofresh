package com.demo.nicolas.mori.steps;

import org.apache.log4j.Logger;

import com.demo.nicolas.mori.util.DateAndTime;
import com.demo.nicolas.mori.util.ScreenshotCreator;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps extends StepsHelper {

	private Logger logger = Logger.getLogger(Steps.class);

	@Given("I start the browser")
	public void accessToTheBrowser() {
		logger.info("Starting the browser");
		startBrowser();
	}

	@And("I access to this url")
	public void accesToTheUrl() {
		logger.info("Accessing to the url");
		navigateTo(selectUrlDependingOfEnviroment());
	}

	// Teardown Section
	@After
	public void afterMethod(Scenario scenario) {
		logger.info("Teardown Section!!");

		if (!System.getProperty("testingType").equals("backend")) {
			if (scenario.isFailed()) {
				ScreenshotCreator.createScreenshot(driver,
						"FailTest - " + scenario.getName() + " - XS" + DateAndTime.getDateAndTime() + ".png");
			}
			closeDriver();
		}

		logger.info("To see the execution report of this test = " + System.getProperty("user.dir")
				+ "/target/cucumber-html-reports/index.html");
	}

}