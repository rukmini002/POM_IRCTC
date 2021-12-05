package irctcapplication.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHomePage  extends GenericWrappers{
	
	public IrctcRegistrationPage clickOnRegister()
	{
		clickByXpathNoSnap("//a[text()=' REGISTER '] ");
		return new IrctcRegistrationPage(driver, test);
	}
	
	public  IrctcHomePage (RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	
	public IrctcHomePage waitForIrctcRegistrationPage(long time)
	{
		waitProperty(time);
		return this;
	}

	public IrctcHomePage clickOnHolidays()
	{
		clickByXpathNoSnap("//a[text()=' HOLIDAYS ']");
		return this;
	}
	
	public IrctcHomePage clickOnStays()
	
	{
		clickByXpathNoSnap("//span[text()='Stays']");
		return this;
	}
	
	public IrctcHomePage clickOnLounge()
	{
		clickByXpathNoSnap("//span[text()='Lounge']");
		return this;
	}
	
	
	public  IrctcAccomadationPage SwitchToAccommadationPage()
	{
		switchToLastWindow();
		return new IrctcAccomadationPage(driver, test);
	}

	
}
