package helpers;
 
import java.io.*;
import java.util.Properties;

import enums.BrowserType;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath= "src/test/resources/environments/config.properties";
 
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
 
	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath");		
	}
 
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) {
			try{
				return Long.parseLong(implicitlyWait);
			}catch(NumberFormatException e) {
				throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
			}
		}
		return 30;		
	}
 
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
	}
 
	public BrowserType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equals(BrowserType.CHROME.toString().toLowerCase()))
			return BrowserType.CHROME;
		else if(browserName.equalsIgnoreCase(BrowserType.CHROME.toString().toLowerCase())) 
			return BrowserType.FIREFOX;
		
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
 
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	
	public String getLoginEmail() {
		String email = properties.getProperty("email");
		if(email != null) return email;
		else throw new RuntimeException("Login Email is not specified in the Configuration.properties file for the Key:email");
	}
	
	public String getLoginPassword() {
		String password = properties.getProperty("password");
		if(password != null) return password;
		else throw new RuntimeException("Login password is not specified in the Configuration.properties file for the Key:password");
	}
	  
}

