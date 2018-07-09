package com.demo.nicolas.mori.framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.backend.GetMethods;
import com.demo.nicolas.mori.backend.PostMethods;
import com.demo.nicolas.mori.page.object.web.CheckoutProcessPage;
import com.demo.nicolas.mori.page.object.web.GenericPage;
import com.demo.nicolas.mori.page.object.web.LoginPage;
import com.demo.nicolas.mori.page.object.web.MyAccountPage;
import com.demo.nicolas.mori.page.object.web.RegistrationPage;
import com.demo.nicolas.mori.util.DataGenerator;
import com.demo.nicolas.mori.util.OpenBrowserChrome;

/**
 * This Class is created for make a helper for all the pages, and all the parts
 * of the a native app, or for execute all the drivers. And for create all the
 * objects of pages, or objects created in all the pages.
 * 
 */

public class ParentScenario {

	protected static WebDriver driver;

	protected static GenericPage genericPage;
	protected static RegistrationPage registrationPage;
	protected static LoginPage loginPage;
	protected static MyAccountPage myAccountPage;
	protected static CheckoutProcessPage checkoutProcessPage;

	protected static GetMethods getMethods;
	protected static PostMethods postMethods;

	private Logger logger = Logger.getLogger(ParentScenario.class);

	public void startBrowser() {
		
		DataGenerator.generateAName();

		try {
			if (System.getProperty("testingType").contains("mobile")) {
				logger.info("Starting driver for Chrome Web Mobile");
				driver = OpenBrowserChrome.openBowserWithOutCapabilitiesForEmulateMobile(driver, true);
			} else if (System.getProperty("testingType").equals("web")) {
				logger.info("Starting driver for Chrome Web");
				driver = OpenBrowserChrome.openBowserWithOutCapabilities(driver);
			} else {
				logger.info(
						"ERROR: appear a problem at the moment to define the maven variable \"-DtestingType\", this require the values web or web-mobile, and you access the value: "
								+ System.getProperty("testingType"));
				System.exit(0);
			}
		} catch (Exception e) {
			logger.info(e);

			logger.info(
					"ERROR: appear a problem at the moment to define the manve variable \"-DtestingType\", this require the values web or web-mobile, and you access the value: "
							+ System.getProperty("testingType"));
			System.exit(0);
		}

		genericPage = new GenericPage(driver);
		registrationPage = new RegistrationPage(driver);
		loginPage = new LoginPage(driver);
		myAccountPage = new MyAccountPage(driver);
		checkoutProcessPage = new CheckoutProcessPage(driver);
	}

	public void startBackMethods() {
		logger.info("Starting the conection with the services.");
		getMethods = new GetMethods();
		postMethods = new PostMethods();
	}

	public String selectUrlDependingOfEnviroment() {
		try {
			logger.info("Starting to select the url depending of the maven variable env: " + System.getProperty("env"));
			if (System.getProperty("env").toLowerCase().contains("dev")) {
				return "http://automationpractice.com/index.php";
			} else if (System.getProperty("env").toLowerCase().contains("staging")) {
				return "http://automationpractice.com/index.php";
			} else if (System.getProperty("env").toLowerCase().contains("prod")) {
				return "http://automationpractice.com/index.php";
			} else {
				logger.info(
						"ERROR: appear a problem at the moment to define the manve variable \"env\", this require the values dev, staging or prod, and you access the value: "
								+ System.getProperty("env"));
				driver.quit();
				System.exit(0);
			}
		} catch (Exception e) {
			logger.info(
					"ERROR: the maven variable \"env\", this require the values dev, staging or prod, and at this moment is not defined.");
			driver.quit();
			System.exit(0);
		}
		return "";
	}

	protected void navigateTo(String url) {
		logger.info("Starting to go to the url: " + url);
		driver.navigate().to(url);
	}

	public void closeDriver() {
		driver.close();
	}

}
