package com.demo.nicolas.mori.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowserChrome {
	
	private static final String WIN_DRIVER_PATH = "src/test/resources/drivers/win/chromedriver.exe";
	private static final String MAC_DRIVER_PATH = "src/test/resources/drivers/mac/chromedriver";

	public static WebDriver openBowserWithOutCapabilities(WebDriver driver) {
		Logger logger = Logger.getLogger(OpenBrowserChrome.class);

		String oS = System.getProperty("os.name").toLowerCase();

		if (oS.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", WIN_DRIVER_PATH);

		} else if (oS.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);
		} else {
			logger.info("This is the OS: " + oS);
			logger.info("OS is not compatible, you need define the path of the chromedriver again");
			System.exit(0);
		}
		driver = new ChromeDriver();

		Point point = new Point(500, 4);
		driver.manage().window().setPosition(point);
		return driver;
	}

	public static WebDriver openBowserWithOutCapabilitiesForEmulateMobile(WebDriver driver1, boolean mobile) {
		String oS = System.getProperty("os.name").toLowerCase();
		Logger logger = Logger.getLogger(OpenBrowserChrome.class);

		if (oS.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", WIN_DRIVER_PATH);
		} else if (oS.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);
		} else {
			logger.info("This is the OS: " + oS);
			logger.info("OS is not compatible, you need define the path of the chromedriver again");
			System.exit(0);
		}

		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "iPhone X");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cap);

		driver1 = new ChromeDriver(options);
		return driver1;
	}

}
