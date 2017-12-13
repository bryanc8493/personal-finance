package com.bryan.finance.view;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AuthenticationTest {

	private Authentication auth;

	@BeforeTest
	public void setup() {
		auth = new Authentication(null);
	}

	@Test
	public void isGuiShown() {
		Assert.assertTrue(auth.frame.isVisible());
	}

	@Test
	public void verifyTitle() {
		String title = auth.frame.getTitle();
		Assert.assertEquals(title, "Authentication");
	}
}
