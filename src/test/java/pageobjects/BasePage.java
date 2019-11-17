package pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

	public static WebDriver driver;
	public static boolean result;
	
	public BasePage(WebDriver driver) {
		BasePage.driver=driver;
		BasePage.result=true;
	}
}
