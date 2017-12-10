package com.bryan.finance.utility;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OperatingSystemTest {

	private String WINDOWS = "Windows";
	private String operatingSystem;

	@BeforeTest
	private void setup() {
		operatingSystem = OperatingSystem.determineOS();
	}

	@Test
	public void getOperatingSystem() {
		Assert.assertNotNull(operatingSystem);
	}

	@Test
	public void isWindows() {
		boolean isWindows = operatingSystem.startsWith(WINDOWS);
		Assert.assertTrue(isWindows);
	}
}
