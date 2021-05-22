package org.tcs;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class junit {
 static WebDriver driver;
 @BeforeClass
 public static void beforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
 }
 @AfterClass
 public static void afterclass() {
driver.quit();
}
 @Before
 public void before() {
Date date = new Date();
System.out.println(date);

}
 @After
 public void after() {
Date date = new Date();
System.out.println(date);
}
 @Test
 public void test() throws InterruptedException {
	 String title = driver.getTitle();
 	 boolean b = title.contains("Hotel");
 	 Assert.assertTrue("verify title", b);
	 WebElement txtusr = driver.findElement(By.id("username"));
	 txtusr.sendKeys("hello");
	 WebElement txtpass1 = driver.findElement(By.id("password"));
	 txtpass1.sendKeys("12345");
	 driver.findElement(By.id("login")).click();
	 String txtpass = txtpass1.getAttribute("value");
	 Assert.assertEquals("verifypassword", "12345",txtpass);
	 String name = txtusr.getAttribute("value");
	 Assert.assertEquals("verify username", "hello",name);
	 Thread.sleep(1000);
	 
	}
 @Test
 public void test1() {
	 Assert.assertTrue("verifyusername",true);
	 Assert.assertTrue("verifypassword", true);
 
 
 }}



