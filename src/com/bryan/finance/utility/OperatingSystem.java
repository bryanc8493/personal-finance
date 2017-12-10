package com.bryan.finance.utility;

import com.bryan.finance.literals.Literals;

public class OperatingSystem {

	public static String determineOS() {
		return System.getProperty(Literals.OS_PROPERTY);
	}
}
