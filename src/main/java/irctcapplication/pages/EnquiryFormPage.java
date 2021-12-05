package irctcapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage  extends GenericWrappers{

   public EnquiryFormPage enterApplicantName(String data) {
		
	enterByXpath("//input[@name='name']", data);
		return this;
	}
   
  
	public EnquiryFormPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
 
	public EnquiryFormPage enterOrganizationName(String data)
	{
		enterByXpath("//input[@name='organization']", data);
		return this;
	}
	
	public EnquiryFormPage enterAddress(String data)
	{
		enterByXpath("//input[@name='address']", data);
		return this;
	}
	
	public EnquiryFormPage enterMobileNum(String data)
	{
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}
	
	public EnquiryFormPage enterEmail(String data)
	{
		enterByXpath("//input[@placeholder='Email']", data);
		return this;
	}
	
	public EnquiryFormPage selectRequestFor(String data)
	{
		selectVisibleTextByXpath("//select[@name='requestFor']",data);
		return this;
	}
	
	public EnquiryFormPage enterOriginStation(String data)
	{
		enterByXpath("//input[contains(@name,'originStation')]", data);
		return this;
	}
	
	public EnquiryFormPage enterDestinationStation(String data)
	{
		enterByXpath("//input[contains(@name,'destnStation')]", data);
		return this;
	}
	
	public EnquiryFormPage clickOnCheckInDate()
	{
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}

	public EnquiryFormPage clickOnDate()
	{
		clickByXpathNoSnap("//span[text()='19']");
		return this;
	}
	
	
	public EnquiryFormPage clickOnCheckoutDate()
	{
		clickByXpathNoSnap("//input[@name='checkOutDate']");
		return this;
	}
	

	public EnquiryFormPage clickOnOutDate()
	{
		clickByXpathNoSnap("//span[text()='18']");
		return this;
	}
	
	public EnquiryFormPage enterDurationPeriod(String data)
	{
		enterByXpath("//input[@name='durationPeriod']", data);
		
		return this;
	}
	
	public EnquiryFormPage enterNoOfCoachesRequired(String data)
	{
		
		enterByXpath("//input[@name='coachDetails']", data);
		
		return this;
	}
	public EnquiryFormPage enterNoOfPassengers(String data)
	{
		enterByXpath("//input[contains(@name,'numPassenger')]", data);
		return this;
	}
	
	public EnquiryFormPage enterCharterPurpose(String data)
	{
		enterByXpath("//*[@name='charterPurpose']", data);
		return this;
	}
	public EnquiryFormPage waitForEnquiryFormPage(long time)
	{
		waitProperty(time);
		return new EnquiryFormPage(driver, test);
	}

}

	

