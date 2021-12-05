package irctcapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcMenuPage  extends GenericWrappers{



	public IrctcCharterPage clickOnCharter()
	{
		clickByXpath("//a[text()='Charter']");
		return new IrctcCharterPage (driver, test);
	}
	
	public IrctcMenuPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	public IrctcCharterPage waitForIrctcCharterPage(long time) {

	      waitProperty(time);
	      return new IrctcCharterPage (driver, test);
	}
	
	public  FTRCoachLoginPage clickOnBookYourCoach()
	
	{
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new  FTRCoachLoginPage(driver, test);
	}
	
	public  FTRCoachLoginPage  switchToFTRCoachLoginPage()
	{
		switchToLastWindow();
		return new FTRCoachLoginPage(driver, test);
	}
	

	
	
}
