package testSteps;

import org.openqa.selenium.WebDriver;

import helpers.FileReaderFactory;
import managers.DriverFactory;
import managers.DriverManager;

public abstract class Base {
	
	 protected WebDriver driver ; 
	 
	 public Base() {
		 DriverManager driverManager = new DriverManager(); 
		 
		 driver = driverManager.getDriver();		 
		 driver.get(FileReaderFactory.getInstance().getConfigReader().getApplicationUrl());
	}
	 
}
