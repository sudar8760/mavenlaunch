package org.testNG;

import org.testng.annotations.Test;

public class Sample1 {
@Test(priority=-5)
private void test1() {

}
@Test(priority=2)
private void test2() {

}
@Test(priority=3)
private void test3() {

}
@Test(priority=1)
private void test4() {

}
}
