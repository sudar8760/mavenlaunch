package org.testNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert1 {
	@Test
	public void test1() {
String name ="Greens";
SoftAssert SA = new SoftAssert();
SA.assertTrue(true, "verifyusername");
SA.assertTrue(false, "verifypassword");
SA.assertTrue(false, "verifypayment");
SA.assertTrue(true, "verifybutton");
SA.assertEquals("java",name,"verifytextbos");
SA.assertAll();

	}
@Test
public void test2() {
Assert.assertTrue(true, "verifydropdown");
}
}
