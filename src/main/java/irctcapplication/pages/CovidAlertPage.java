package irctcapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {

	public IrctcHomePage clickOnOkButton()
	{
		clickByXpathNoSnap("//button[@class='btn btn-primary']");
		return new  IrctcHomePage(driver, test);
	
} 
		public CovidAlertPage(RemoteWebDriver driver,ExtentTest test)
		{
			
			this.driver=driver;
			this.test=test;
		}
	
	public IrctcHomePage waitForIrctcHomePage(long time)
	{
		waitProperty(time);
		return  new  IrctcHomePage(driver, test);
	}

}