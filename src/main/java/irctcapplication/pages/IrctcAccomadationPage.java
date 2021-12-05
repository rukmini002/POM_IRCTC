package irctcapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcAccomadationPage  extends GenericWrappers{

	public 	IrctcMenuPage clickOnMenuIcon()
	{
		clickByXpathNoSnap("//a[contains(@id,'sidebarCollapse')]");
		return new IrctcMenuPage(driver, test) ;
	}
	
	
	public IrctcAccomadationPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	

	public IrctcAccomadationPage clickOnHotelsIcon()
	{
		clickByXpathNoSnap("(//div[@class='Nav-icons IRCTCHotels'])[1]");
		
		return new IrctcAccomadationPage(driver, test);
	}
	

	public IrctcHotelsPage switchToIrctcHotelsPage() {
		
		switchToLastWindow();
		return new IrctcHotelsPage(driver, test);
	}
	
	public IrctcCharterPage clickOnCharter()
	{
		clickByXpath("//a[text()='Charter']");
		return new IrctcCharterPage(driver, test);
	}
	
	public IrctcCharterPage waitForIrctcCharterPage(long time) {

	      waitProperty(time);
	      return new IrctcCharterPage (driver, test);
	}

	public FTRCoachLoginPage   clickOnBookYourCoach()
	{
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new  FTRCoachLoginPage(driver, test);
	}
	
}
