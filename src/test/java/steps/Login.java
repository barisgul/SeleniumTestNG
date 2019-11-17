package steps;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory; 

import helpers.FileReaderFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageobjects.*; 
import pomBase.MyTestContext;


public class Login {

	static WebDriver driver; 
	MyTestContext context;
	HomePage homePage; 
	LoginPage loginPage;
	
	public Login(WebDriver driver) {
		Login.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Given("^I open the chrome browser$")
	public void navigateToHomePage() {
		driver.get(FileReaderFactory.getInstance().getConfigReader().getApplicationUrl());
	}
	
	@Given("^I set email in email area$")
	public void SetUserName() {
		loginPage.SetEmail("pedroalmodovar@test.com");
	}
	
	@Given("^I set password in password area$")
	public void SetPass()
	{
		loginPage.SetPassword("1q2w3e");  
	}
	 
}
