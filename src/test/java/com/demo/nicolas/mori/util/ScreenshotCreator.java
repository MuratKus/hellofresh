package com.demo.nicolas.mori.util;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotCreator {
	public static void createScreenshot(WebDriver driver, String fileName) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Output//" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fullScreenshot(WebDriver driver, String fileName) throws IOException {
		Logger logger = Logger.getLogger(ScreenshotCreator.class);
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(), "PNG", new File("Output//" + fileName + ".png"));
		logger.info("Screenshot teardown created correctly");
	}

}
