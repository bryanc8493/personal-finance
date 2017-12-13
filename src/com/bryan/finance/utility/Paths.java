package com.bryan.finance.utility;

import com.bryan.finance.literals.Literals;
import com.bryan.finance.program.PersonalFinance;

public class Paths extends Literals {

	public static String getLaunchPath() {
		String path = PersonalFinance.class.getProtectionDomain()
				.getCodeSource().getLocation().getPath();
		if (path.contains(DOT_JAR)) {
			path = path.replace(APP_ARTIFACT, "");
		}
		if (path.charAt(0) == SLASH) {
			path = path.substring(1);
		}
		return path;
	}

	public static String getResourcesPath() {
		String launch = getLaunchPath();
		launch = launch.replace(BUILD_PATH, "");
		return launch + CONFIG_DIR;
	}
}
