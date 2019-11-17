package com.tem.mavenTestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest extends Base { 
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Run...");  
	}
	
	@Test
	public void smokeTest() {
		System.out.println("Running Smoke Test...");
		driver.get("https://snapengage-qa.appspot.com/signin?to=hub");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pedroalmodovar@test.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1q2w3e");
	}
	 
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Run...");
		driver.quit();
	}
}
