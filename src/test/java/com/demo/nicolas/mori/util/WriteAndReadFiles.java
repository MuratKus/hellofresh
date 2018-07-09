package com.demo.nicolas.mori.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class WriteAndReadFiles {

	public static String stringInsideOfAFile = null;

	@SuppressWarnings("resource")
	public static String readAFileAndStoreInString(String pathAndFileName) {
		Logger logger = Logger.getLogger(WriteAndReadFiles.class);

		logger.info("Starting to read the file: " + pathAndFileName);
		try {
			stringInsideOfAFile = new Scanner(new File(pathAndFileName)).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			logger.info("appear an error at the moment to get the text inside of the file: " + pathAndFileName);
		}
		return stringInsideOfAFile;
	}

	public static void writerStringFile(List<String> theArray) throws IOException {
		Logger logger = Logger.getLogger(WriteAndReadFiles.class);
		logger.info("Starting to write the File");
		FileWriter writer = new FileWriter("export.txt");
		for (String str : theArray) {
			writer.write(str + "\n");
		}
		writer.close();
		logger.info("Finish to write the File");
	}

	public static List<String> readFileToArraySpaceXSpace() throws FileNotFoundException {
		Logger logger = Logger.getLogger(WriteAndReadFiles.class);
		List<String> theArray = new ArrayList<String>();

		logger.info("Starting to read the File");
		Scanner s = new Scanner(new File("export.txt"));
		while (s.hasNext()) {
			theArray.add(s.next());
		}
		s.close();
		logger.info("Finish to read the File");

		return theArray;
	}

}
