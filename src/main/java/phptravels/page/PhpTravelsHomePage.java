package phptravels.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpTravelsHomePage extends GenericWrappers {

	
	public PhpTravelsRegistraionPage clickOnRegister()
	{
		clickByXpathNoSnap("//a[text()='Register']");
		return new PhpTravelsRegistraionPage(driver, test);
	}
	
	public PhpTravelsHomePage(RemoteWebDriver driver,ExtentTest test) {
		
	   this.driver=driver;
	   this.test=test;
	}
	public PhpTravelsRegistraionPage waitForPhpTravelsRegistraionPage(long time)
	{
		waitProperty(time);
		return new PhpTravelsRegistraionPage(driver, test);
	}
}
