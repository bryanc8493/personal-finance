package com.bryan.finance.program;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bryan.finance.view.util.Loading;

public class PersonalFinanceTest {

	private Loading load;

	@BeforeTest
	public void setup() {
		load = PersonalFinance.showLoader();
	}

	@Test
	public void isLoaderRunning() {
		Assert.assertNotNull(load);
	}

	@AfterTest
	public void cleanup() {
		load.terminate();
	}
}
