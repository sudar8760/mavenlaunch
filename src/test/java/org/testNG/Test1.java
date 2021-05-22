package org.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Test1 {
@Parameters({"username","password"})
public void test2(@Optional("technology")String Name,@Optional("8769")String Pass) {
	System.out.println(Name);
	System.out.println(Pass);

}
@Test
public void test15() {
	// TODO Auto-generated method stub

}@Test(enabled=false)
public void test14() {
	// TODO Auto-generated method stub

}@Test
public void test13() {
	// TODO Auto-generated method stub

}@Test
public void test12() {
	// TODO Auto-generated method stub

}@Test
public void test11() {
	// TODO Auto-generated method stub

}@Test
public void test10() {
	// TODO Auto-generated method stub

}
}
