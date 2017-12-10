package com.bryan.finance.log;

import java.io.File;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bryan.finance.literals.Literals;
import com.bryan.finance.utility.Paths;

public class AppLoggerTest {

	private AppLogger logger;
	private Logger log;

	@BeforeTest
	private void init() {
		logger = new AppLogger();
		log = logger.getLogger();
	}

	@Test
	public void isLoggerInitialized() {
		Assert.assertNotNull(logger);
		Assert.assertNotNull(log);
	}

	@Test
	public void log4jPropertyFileExists() {
		String log4JPropertyFile = Paths.getResourcesPath()
				+ Literals.LOGGER_PROPERTY_FILE;
		boolean exists = new File(log4JPropertyFile).exists();
		Assert.assertTrue(exists, log4JPropertyFile);
	}
}
