package com.qa;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.BaseClass;


public class CRMTest extends BaseClass{


		@BeforeMethod
		public void setUp() {
			initialize();
			
		}
		
		@Test(priority = 1)
		public void loginCRM() {
			driver.findElement(By.name("username")).sendKeys("groupautomation");
			driver.findElement(By.name("password")).sendKeys("Test@12345");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			String title = driver.getTitle();
			Assert.assertEquals(title, "CRMPRO");
		}
		
		@Test(priority = 2)
		public void clickOnContacts() {
			driver.findElement(By.name("username")).sendKeys("groupautomation");
			driver.findElement(By.name("password")).sendKeys("Test@12345");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			boolean contact = driver.findElement(By.xpath("//td[contains(text(),'Contacts')]")).isDisplayed();
			Assert.assertTrue(contact);
		}
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}

