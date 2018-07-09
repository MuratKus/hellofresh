package com.demo.nicolas.mori;

import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Unit test for simple App.
 */
@CucumberOptions(strict = false, features = "src/test/resources/features", tags = "@wg_get_all", glue = {
		"com.demo.nicolas.mori.steps" }, plugin = { "pretty", "html:target/cucumber-html-reports",
				"json:target/cucumber-html-reports/cucumber.json", "junit:target/surefire-reports/cucumber-junit.xml" })
public class AppTest extends AbstractTestNGCucumberTests {
	private Logger logger = Logger.getLogger(AppTest.class);

	@Parameters({ "parallelStatus" })
	public AppTest(String parallelStatus) {
		logger.info("Reading the parallel status");
		logger.info(parallelStatus);
	}

}
