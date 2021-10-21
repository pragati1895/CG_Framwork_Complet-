package com.cg.NotaFramworkPart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ScreenShot_1  extends Base1{
	@Listeners(CustomeListerner.class)
	public class ScreenshotTest extends Base1 {

		@BeforeMethod
		public void SetUp() {
		test1();
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		@Test
		public void takeScreenshotAs() {
			Assert.assertEquals(false, true);
		} 
	}
}
