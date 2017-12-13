package com.bryan.finance.view.util;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bryan.finance.literals.Literals;
import com.bryan.finance.program.PersonalFinance;

public class LoadingTest {

	private Loading load;

	@BeforeTest
	public void setup() {
		load = PersonalFinance.showLoader();
	}

	@Test
	public void verifyLoaderTitle() {
		String title = load.getTitle();
		String expTitle = Literals.APP_NAME;
		Assert.assertEquals(title, expTitle);
	}

	@AfterTest
	public void cleanup() {
		load.terminate();
	}

}
