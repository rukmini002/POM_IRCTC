package formcsignup.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers {

	public FormCRegistrationPage clickOnSignUp()
	{
		clickByXpathNoSnap("//a[text()='Sign Up (Registration)']");
		
		return new FormCRegistrationPage(driver, test);
	}
	
	public  FormCHomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
		
	}
	
	public  FormCRegistrationPage waitForFormCRegistrationPage(long time)
	{
		waitProperty(time);
		return new FormCRegistrationPage(driver, test);
	}
	
}
