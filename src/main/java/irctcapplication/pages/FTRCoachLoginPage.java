package irctcapplication.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRCoachLoginPage  extends GenericWrappers{

	public  FTRUserRegistrationPage clickOnNewUserSignUp()
	{
		clickByXpath("//a[text()='New User? Signup']");
		
		return new  FTRUserRegistrationPage(driver, test);
		
	}
	
	public FTRCoachLoginPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	
	public  FTRCoachLoginPage  switchToFTRCoachLoginPage()
	{
		switchToLastWindow();
		return new FTRCoachLoginPage(driver, test);
	}
	

}
   
