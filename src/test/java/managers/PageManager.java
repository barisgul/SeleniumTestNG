package managers;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePage;
import pageobjects.LoginPage;

public class PageManager {
	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;  
 
	public PageManager(WebDriver driver) { 
		this.driver = driver;
	}
 
	public HomePage getHomePage(){ 
		return (homePage == null) ? homePage = new HomePage(driver) : homePage; 
	}
	
	public LoginPage getLoginPage() {		 
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage; 
	} 	 
}