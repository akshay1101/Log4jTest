package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void initialize() {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akkip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://classic.freecrm.com/index.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	
	}
}
