package org.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.tcs.baseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider1 extends baseClass {
	WebDriver driver;
	baseClass bc = new baseClass();
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void login(String name,String pass1) {
WebElement usrname = driver.findElement(By.id("email"));
usrname.clear();

usrname.sendKeys(name);
WebElement pass = driver.findElement(By.id("pass"));
pass.clear();
pass.sendKeys(pass1);

WebElement btnlgn = driver.findElement(By.name("login"));
btnlgn.click();

	}
	

	}


