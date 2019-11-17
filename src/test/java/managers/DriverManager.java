package managers;

import org.openqa.selenium.WebDriver;
import helpers.*;

import enums.BrowserType;

public class DriverManager {
	private WebDriver driver;
	private static BrowserType browserType; 
 
	public DriverManager() {
		browserType = FileReaderFactory.getInstance().getConfigReader().getBrowser();
	}
 
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}  
 
	private WebDriver createDriver() {
		DriverFactory driverFactory = new DriverFactory(driver);
		if(browserType.equals(BrowserType.CHROME)) {
			driver= driverFactory.chromeDriver(); 
		}
			
		else if(browserType.equals(BrowserType.FIREFOX)) {
			driver= driverFactory.firefoxDriver(); 
		}  
         
		return driver;
	}	
 
	public void closeDriver() {
		driver.close();
		driver.quit();
	}	
 
}