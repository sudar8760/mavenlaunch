package org.tcs;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class junit {
 static WebDriver driver;
 @BeforeClass
 public static void beforeClass() {
WebDriverManager.chromedriver().setup();
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
 public void test() {
	 driver.findElement(By.id("username")).sendKeys("hello");
	 driver.findElement(By.id("password")).sendKeys("12345");
	 driver.findElement(By.id("login")).click();
 	 
	 

}
 }



