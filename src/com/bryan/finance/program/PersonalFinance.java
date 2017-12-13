package com.bryan.finance.program;

import com.bryan.finance.log.AppLogger;
import com.bryan.finance.view.Authentication;
import com.bryan.finance.view.util.Loading;

public class PersonalFinance {

	public static AppLogger appLogger;
	private static Loading load;

	public static void main(String[] args) {
		appLogger = new AppLogger();

		load = showLoader();

		new Authentication(load);

		// new MainMenu().showMenu();
	}

	public static Loading showLoader() {
		return new Loading();
	}

	public static void closeLoader() {
		load.terminate();
	}
}
