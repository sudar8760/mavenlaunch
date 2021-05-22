package org.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sampleforassert {
	@Test
	public void test1() {
Assert.assertTrue(true, "verifyusername");
Assert.assertTrue(false, "verifypassword");
Assert.assertTrue(true, "verifybutton");
	}
	@Test
	public void test2() {
		Assert.assertTrue(true, "verifydropdown");

	}

}
