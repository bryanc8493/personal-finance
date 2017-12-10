package com.bryan.finance.view;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainMenuTest {

	private MainMenu menu;

	@BeforeTest
	private void setup() {
		menu = new MainMenu();
		menu.showMenu();
	}

	@Test
	public void menuNotNull() {
		Assert.assertNotNull(menu);
	}

	@Test
	public void isMainMenuDisplayed() {
		Assert.assertTrue(menu.isActive(), "Menu Not Active");
		Assert.assertTrue(menu.isFocused(), "Menu Not Focused");
	}

	@AfterTest
	private void teardown() {
		menu.teardown();
	}
}
