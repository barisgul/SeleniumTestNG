package pomBase;
import managers.*;

public class MyTestContext {
	private DriverManager driverManager; 
	private PageManager pageObjectManager;
	
	public MyTestContext(){
		driverManager = new DriverManager();
		pageObjectManager = new PageManager(driverManager.getDriver());
	}
	
	public DriverManager getWebDriverManager() {
		return driverManager;
	}
	
	public PageManager getPageObjectManager() {
		return pageObjectManager;
	} 
}