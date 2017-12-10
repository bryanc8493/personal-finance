package com.bryan.finance.program;

import com.bryan.finance.log.AppLogger;
import com.bryan.finance.view.MainMenu;

public class PersonalFinance {

	public static AppLogger appLogger;

	public static void main(String[] args) {

		appLogger = new AppLogger();
		new MainMenu().showMenu();
	}
}
