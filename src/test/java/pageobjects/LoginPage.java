package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testSteps.*;

public class LoginPage {
 
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SetEmail(String email) {
		System.out.println("Email");
		driver.findElement(By.id("email")).sendKeys(email);
	}
	
	public void SetPassword(String password) {
		System.out.println("pasword");
		driver.findElement(By.id("password")).sendKeys(password);  
	}
	
	public void ClickOnSignIn() {
		driver.findElement(By.xpath("//*[@name=\"Submit\"]")).click();
	}
}
