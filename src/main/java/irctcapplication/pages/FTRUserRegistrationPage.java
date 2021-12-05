package irctcapplication.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRUserRegistrationPage extends GenericWrappers {

	public  FTRUserRegistrationPage enterUserId(String data)
	{
		enterByXpath("//input[contains(@id,'userId')]", data);
		
		return this;
	}
	
	public  FTRUserRegistrationPage(RemoteWebDriver driver,ExtentTest test)
	{	
		
		this.driver=driver;
		this.test=test;
	}
	public  FTRUserRegistrationPage waitForFTRUserRegistrationPage(long time)
	{
		
		waitProperty(time);
		return this;
	}
	
	public  FTRUserRegistrationPage enterPassword(String data)
	{
		
		enterByXpath("//input[@id='password']", data);
		
		return this;
	}
	
	public  FTRUserRegistrationPage enterConfirmPassword(String data)
	{
		
		enterByXpath("//input[@id='cnfPassword']", data);
		
		return this;
	}
	
	public  FTRUserRegistrationPage selectSecurityQuestion(String data)
	{
		selectVisibleTextByXpath("//select[@id='secQstn']",data);
		
		return this;
	}
	
	
	
	public  FTRUserRegistrationPage enterSecurityAnswer(String data)
	{
		
		enterByXpath("//input[@id='secAnswer']", data);
		
		return this;
	}
	
	public FTRUserRegistrationPage clickOnDateOfBirth() {
		
		clickByXpathNoSnap("//input[@id='dateOfBirth']");
		
		return this;
	}
		
	public  FTRUserRegistrationPage selectMonth(String data)
	{
		
		selectVisibleTextByXpath("//select[@class='ui-datepicker-month']", data);
		return this;
	}
	
	
	public FTRUserRegistrationPage selectYear(String data) {
		
		selectVisibleTextByXpath("//select[@class='ui-datepicker-year']", data);
		return this;
	}
	
	
	public FTRUserRegistrationPage clickOnDay() {
		
		clickByXpathNoSnap("//a[text()='20']");
		return this;
	}
	
	
	
	
	public  FTRUserRegistrationPage clickOnFemaleButton()
	{
		
	  clickByXpathNoSnap("//input[@id='gender1']");
	  
	  return this;
	}
	public  FTRUserRegistrationPage clickOnUnmarried()
	{
		
		clickByXpath("//input[@value='UnMarried']");
		
		return this;
	}
	
	public FTRUserRegistrationPage enterEmailId(String data)
	{
		
		enterByXpath("//input[@id='email']", data);
		
		return this;
	}
	
	
	public FTRUserRegistrationPage selectOccupation(String data)
	{
		selectVisibleTextByXpath("//select[@id='occupation']",data);
		
		return this;
	}
	
	public FTRUserRegistrationPage enterFirstName(String data)
	{
		enterByXpath("//input[contains(@id,'fname')]", data);
		
		return this;
	}
	
	
	public FTRUserRegistrationPage enterMiddleName(String data)
	{
		enterByXpath("//input[contains(@id,'mname')]", data);
		
		return this;
	}
    
	public FTRUserRegistrationPage enterLastName(String data)
	{
		
	  enterByXpath("//input[contains(@name,'lname')]", data);
	
	   return this;
	}
	
	
	public FTRUserRegistrationPage selectNationality(String data)
	{
		selectVisibleTextByXpath("//select[contains(@name,'natinality')]",data);
		
		return this;
	}
	

	public FTRUserRegistrationPage enterFlatAddress(String data)
		{
		enterByXpath("//input[@id='flatNo']", data);
		
		return this;
	}
	public FTRUserRegistrationPage  enterStreetAddress(String data)

	{
		
		enterByXpath("//input[contains(@id,'street')]", data);
		return this;
	}
	
	public FTRUserRegistrationPage enterArea(String data)
	{
		
		enterByXpath("//input[contains(@id,'area')]", data);
		
		return this;
	}
	
	public FTRUserRegistrationPage selectCountry(String data)
	
	{
		selectVisibleTextByXpath("//select[contains(@name,'country')]",data);
		
		return this;
		
	}
	
	public FTRUserRegistrationPage enterMobileNUm(String data)

	{
		enterByXpath("//input[contains(@id,'mobile')]", data);
		
		return this;
		
	}

	public FTRUserRegistrationPage enterPinCode(String data)
	{
		
		enterByXpath("//input[contains(@id,'pincode')]", data);
		
		return this;
	}
	
	public  FTRUserRegistrationPage pageDown() {
		
		keyActivityByXpath("pagedown","//html/body");
		return this;
	}
	

	public  FTRUserRegistrationPage selectCity(String data)
	{
		selectVisibleTextByXpath("//select[@id='city']",data);
		
		return this;
	}
	
	public FTRUserRegistrationPage selectState(String data)
	
	{
		selectVisibleTextByXpath("//select[@id='state']", data);
		
		return this;
	}
	
	public FTRUserRegistrationPage selectPostOfc(String data)
	{
		
		selectVisibleTextByXpath("//select[@name='postOffice']",data);
		
		return this;
	}
	
	public FTRUserRegistrationPage clickOnyesButton()
	{
		
		clickByXpath("//input[text()='Yes']");
		
		return this;
	}
}
