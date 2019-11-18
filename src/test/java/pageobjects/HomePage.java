package pageobjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver; 

public class HomePage  {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	 
	
	public boolean isUserLoggedInSuccessfully() {
		boolean isLiveLabelDisplayed = driver.findElement(By.id("accordion-title-live")).isDisplayed();
		return isLiveLabelDisplayed;
	}
	
	public void takeScreenShot() throws IOException { 

        TakesScreenshot scrShot =((TakesScreenshot)driver); 
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); 

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String screenShotName = "screenShot"+timeStamp+".png";

        File DestFile=new File("C:\\Users\\baris\\AppData\\Local\\Temp\\"+screenShotName+"");
        
        FileUtils.copyFile(SrcFile, DestFile);  
	}
	
}
