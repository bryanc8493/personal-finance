package com.bryan.finance.utility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PathsTest {

	private String DEV = "C:/Users/Bryan/workspace/personal-finance/build/classes/";
	private String PROD = "C:/PersonalFinance/";

	private String DEV_RESOURCE = "C:/Users/Bryan/workspace/personal-finance/config/";
	private String PROD_RESOURCE = "C:/PersonalFinance/config/";

	@Test
	public void correctStartPath() {
		String startPath = Paths.getLaunchPath();
		boolean startIsProdOrDev = (startPath.equals(DEV) || startPath
				.equals(PROD));
		Assert.assertTrue(startIsProdOrDev, startPath);
	}

	@Test
	public void correctResourcesPath() {
		String resourcePath = Paths.getResourcesPath();
		boolean resourcesIsProdOrDev = (resourcePath.equals(DEV_RESOURCE) || resourcePath
				.equals(PROD_RESOURCE));
		Assert.assertTrue(resourcesIsProdOrDev, resourcePath);
	}
}
