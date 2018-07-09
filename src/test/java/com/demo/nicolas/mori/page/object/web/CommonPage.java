package com.demo.nicolas.mori.page.object.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class CommonPage extends ParentPage {
	
	Logger logger = Logger.getLogger(CommonPage.class);

	public CommonPage(WebDriver driver) {
		super(driver);
	}

}
