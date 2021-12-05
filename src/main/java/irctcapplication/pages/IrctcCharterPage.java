package irctcapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcCharterPage extends GenericWrappers {


	public EnquiryFormPage clickOnEnquiryForm()
	   {
	        clickByXpathNoSnap("//a[text()='Enquiry Form']");
	         return new EnquiryFormPage(driver, test);
		}
	
	public IrctcCharterPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}

	public EnquiryFormPage waitForEnquiryFormPage(long time)
	{
		waitProperty(time);
		return new EnquiryFormPage(driver, test);
	}
}
