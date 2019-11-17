package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver); 
	}  
	
	
	@FindBy(id="email")
	 public static WebElement txtEmail;
	
	@FindBy(id="password")
	 public static WebElement txtPassword; 
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/form/div[2]/div/input")
	 public static WebElement btnSignIn; 

	
	public void SetEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void SetPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void ClickOnSignIn() {
		btnSignIn.click();
	}
}
