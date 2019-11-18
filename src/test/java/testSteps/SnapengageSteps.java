package testSteps; 
import java.io.IOException;   
import org.testng.Assert;
import org.testng.annotations.*; 
import helpers.FileReaderFactory;
import managers.PageManager;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class SnapengageSteps extends Base {
	private LoginPage loginPage;
	private HomePage homePage;
	
	/**
	 * Before test 
	 */
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Run...");
		PageManager pagemanger = new PageManager(driver);
		//loginPage = new LoginPage(driver);
		//homePage = new HomePage(driver);
		loginPage = pagemanger.getLoginPage();
		homePage = pagemanger.getHomePage();
	}
	
	@Test
	public void snapEngageTestScenario() throws InterruptedException, IOException {
		System.out.println("Running Smoke Test...");	
		
		String email = FileReaderFactory.getInstance().getConfigReader().getLoginEmail().trim();
		loginPage.SetEmail(email); 
		
		String password = FileReaderFactory.getInstance().getConfigReader().getLoginPassword().trim();
		loginPage.SetPassword(password);
		
		loginPage.ClickOnSignIn();
		
		Assert.assertTrue(homePage.isUserLoggedInSuccessfully(), "Page not loaded!");
		
		homePage.takeScreenShot();
	} 
	 
	
	@AfterTest
	public void afterTest()
	{ 
		driver.quit();
	}  

}
