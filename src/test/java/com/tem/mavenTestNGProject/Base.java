package com.tem.mavenTestNGProject;

import org.openqa.selenium.WebDriver;

import helpers.FileReaderFactory;
import managers.DriverFactory;
import managers.DriverManager;

public abstract class Base {
	
	 WebDriver driver ;
	 
	 public Base() {
		 DriverManager driverManager = new DriverManager(); 
		 
		 driver = driverManager.getDriver();
	}
	 
}
