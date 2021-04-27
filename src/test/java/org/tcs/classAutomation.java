package org.tcs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class classAutomation {
	WebDriver driver;
	@BeforeClass
	private void browserlaunc() {
System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
	}

	

}
