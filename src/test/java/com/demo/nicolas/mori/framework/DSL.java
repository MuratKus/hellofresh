package com.demo.nicolas.mori.framework;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.function.Function;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class is an abstract class, and created for make the interaction with
 * the class ParentPage.
 * 
 * @param <V>
 */
public abstract class DSL<V> {

	private Logger logger = Logger.getLogger(DSL.class);
	public WebDriver driver;

	private static final SimpleDateFormat horaActual = new SimpleDateFormat("HH");
	private static final SimpleDateFormat minutosActual = new SimpleDateFormat("mm");
	private static final SimpleDateFormat segundosActual = new SimpleDateFormat("ss");
	private static final SimpleDateFormat dayActual = new SimpleDateFormat("dd");
	private static final SimpleDateFormat monthActual = new SimpleDateFormat("MM");
	private static final SimpleDateFormat yearActual = new SimpleDateFormat("yy");

	public DSL(WebDriver driver2) {
		this.driver = driver2;
	}

	// ############### GENERIC METHODS SECTIONS ######################
	/**
	 * This method make a generic click in a button element with some text.
	 * 
	 * @param String
	 *            with the text of the element
	 */
	protected void genericClickByButtonContainsSomeText(String stringInTheElement) {
		logger.info("Making a generic click in a web element with the text \"" + stringInTheElement + "\"");
		driver.findElement(By.xpath(String.format("(//button[contains(text(),'%s')])[1]", stringInTheElement))).click();
	}

	/**
	 * This method make a generic click in a elements with some text.
	 * 
	 * @param String
	 *            with the text of the element
	 */
	protected void genericClickByContainsSomeText(String stringInTheElement) {
		logger.info("Making a generic click in a web element with the text \"" + stringInTheElement + "\"");
		clickJSx2(By.xpath((String.format("(//*[contains(text(),'%s')])[1]", stringInTheElement))));
	}

	/**
	 * This method make a generic click in a elements with some text, and some
	 * specific index.
	 * 
	 * @param String
	 *            with the text of the element
	 * @param Int
	 *            with the index of the element
	 */
	protected void genericClickByContainsSomeTextAndWithSomeSpecificIndex(String stringInTheElement, String index) {
		logger.info("Making a generic click in a web element with the text \"" + stringInTheElement + "\"");
		clickJSx2(By.xpath(String.format("(//*[contains(text(),'%s')])['%s']", stringInTheElement, index)));
	}

	/**
	 * This method make a generic click with a text.
	 * 
	 * @param String
	 *            with the text of the element
	 */
	protected void genericClickByText(String stringInTheElement) {
		logger.info("Making a generic click in a web element with the text \"" + stringInTheElement + "\"");
		driver.findElement(By.xpath(String.format("(//*[contains(text(),'%s')])[1]", stringInTheElement))).click();
	}

	/**
	 * This method try to find if some text element appear in the url
	 * 
	 * @param String
	 *            with the text of the element to find in the URL
	 * @return boolean condition
	 */
	protected boolean genericVerifyIfSomeTextAppearInTheURL(String stringToVerify) {
		logger.info("Starting to verify if this text: \"" + stringToVerify + "\" appear in the URL, with this content: "
				+ driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains(stringToVerify)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method verify if some element appear correctly
	 * 
	 * @param element
	 *            By with the locator to find.
	 * @return boolean condition
	 */
	protected boolean genericVerifyIfSomeElementExist(By locator) {
		logger.info("Starting to verify if some element appear correctly");
		try {
			driver.findElement(locator).isDisplayed();
			return true;
		} catch (Exception e) {
			driver.findElement(locator).isDisplayed();
			return true;
		}
	}

	/**
	 * This method try to find if some text element is displayed in some locator
	 * 
	 * @param String
	 *            with the text of the element to find
	 * @param locator
	 * @return boolean condition
	 */
	protected boolean genericVerifyIfSomeTextExistInSomeLocator(By locator, String stringToVerify) {
		logger.info("Starting to verify if this text is displayed \"" + stringToVerify + "\" in some locator");
		if (driver.findElement(locator).getText().contains(stringToVerify)) {
			return true;
		} else {
			return false;
		}
	}

	// ############### STANDART SECTIONS ######################

	/**
	 * This method make click!
	 * 
	 * @param locator
	 */
	protected void click(By locator) {
		logger.info("Making click in a web element");
		driver.findElement(locator).click();
	}

	/**
	 * this method make a double javascript click
	 * 
	 * @param locator
	 */
	protected void clickJSx2(By locator) {
		logger.info("Starting to make a javascript click X2");

		WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		try {
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element);
		}
	}

	/**
	 * this method send Keys to a web element.
	 * 
	 * @param locator
	 * @param string
	 *            to send
	 */
	protected void sendKeysToLocator(By locator, Keys keysToSend) {
		logger.info("Starting to send some Keys to a webelement");
		driver.findElement(locator).sendKeys(keysToSend);
	}

	/**
	 * this method send string to a web element.
	 * 
	 * @param locator
	 * @param string
	 *            to send
	 */
	protected void sendStringToLocator(By locator, String stringToSend) {
		logger.info("Starting to send this String " + stringToSend + " to a webelement");
		driver.findElement(locator).sendKeys(stringToSend);
	}

	/**
	 * This method select options from a list.
	 * 
	 * @param locator,
	 *            string to send
	 */
	protected void selectOptionByString(By locator, String identifier) {
		Select dropdown = new Select(driver.findElement(locator));
		dropdown.selectByValue(identifier);
	}

	/**
	 * this method verify if a method is displayed.
	 * 
	 * @return boolean
	 */
	protected boolean verifyIfisDisplayed(By locator) {
		logger.info("Starting to verify if a webelement is displayed");
		try {
			driver.findElement(locator).isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * this method return the string valur from some locator
	 * 
	 * @param locator
	 * @return string with the gettext content
	 */
	protected String getTextByLocator(By locator) {
		logger.info("Starting to get the element text inside of some locator.");
		return driver.findElement(locator).getText();
	}

	/**
	 * this method wait for a exclusive elemente deployed
	 * 
	 * @param locator
	 */
	protected void waitForAnExplicitElement(By locator) {
		logger.info("Starting to wait for a exclusive element");
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until((Function<? super WebDriver, V>) ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * this method return the current url.
	 * 
	 * @return string with the current url
	 */
	protected String getUrl() {
		logger.info("Starting to get the current URL.");
		return driver.getCurrentUrl();
	}

	// ############### MOBILE SECTIONS ######################

	// ############### ANNOTATION METHOD SECTIONS ######################

	/**
	 * The Annotation WebLocatorInWebOrWebMobile return
	 * 
	 * @author nicolasmori
	 */
	@Retention(RetentionPolicy.RUNTIME)
	public @interface WebLocatorInWebOrWebMobile {
		String webElementType();

		String webElementValue();

		String webMobileElementType();

		String webMobileElementValue();
	}

	public boolean flag = false;
	public int methodNumber = 0;
	public Method[] methods;
	Method method;

	public By getLocator(String methodName) {

		methodNumber = 0;
		methods = getClass().getMethods();
		method = methods[0];
		flag = false;

		do {
			if (method.getName() == methodName) {
				flag = true;
			} else {
				methodNumber++;
				method = methods[methodNumber];
			}
		} while (flag == false);

		WebLocatorInWebOrWebMobile annotation = method.getAnnotation(WebLocatorInWebOrWebMobile.class);

		if (System.getProperty("testingType").equals("web")) {
			logger.info("returning element web");
			if (annotation.webElementType().equals("id")) {
				return By.id(annotation.webElementValue());
			}
			if (annotation.webElementType().equals("xpath")) {
				return By.xpath(annotation.webElementValue());
			}
			if (annotation.webElementType().equals("css")) {
				return By.cssSelector(annotation.webElementValue());
			}
			if (annotation.webElementType().equals("class")) {
				return By.className(annotation.webElementValue());
			}
			if (annotation.webElementType().equals("name")) {
				return By.name(annotation.webElementValue());
			}
		} else {
			logger.info("returning elemenet web-mobile");
			if (annotation.webMobileElementType().equals("id")) {
				return By.id(annotation.webMobileElementValue());
			}
			if (annotation.webMobileElementType().equals("xpath")) {
				return By.xpath(annotation.webMobileElementValue());
			}
			if (annotation.webElementType().equals("css")) {
				return By.cssSelector(annotation.webMobileElementValue());
			}
			if (annotation.webElementType().equals("class")) {
				return By.className(annotation.webMobileElementValue());
			}
			if (annotation.webElementType().equals("name")) {
				return By.name(annotation.webMobileElementValue());
			}
		}
		logger.info("Returning null value at the moment to retrive the method: " + methodName);
		return null;
	}

}