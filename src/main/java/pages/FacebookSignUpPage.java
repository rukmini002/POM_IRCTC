package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers
{
	public FacebookSignUpPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.Xpath"),data);
		
		return this;
	}
	
	public  FacebookSignUpPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	 public FacebookSignUpPage enterLastName(String data)
	 {
		 enterByXpath(prop.getProperty("FacebookSignUpPage.LastName.Xpath"),data);
		 return this;
	 }
	
	
	public FacebookSignUpPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.Email.Xpath"),data);
		
		return this;
	}
	
	public FacebookSignUpPage reEnterEmail(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.ReEnterEmail.Xpath"), data);
		
		return this;
	}
	
	public  FacebookSignUpPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.Xpath"),data);
		
		return this;
	}
	
	public FacebookSignUpPage selectDate(String data) {
		
		
		selectVisibleTextByXpath(prop.getProperty("FacebookSignUpPage.Date.Xpath"),data);
		return this;
		
	}
	public FacebookSignUpPage selectMonth(String data) {
		
		
		selectVisibleTextByXpath(prop.getProperty("FacebookSignUpPage.Month.Xpath"), data);
		return this;
	}
	public FacebookSignUpPage selectYear(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("FacebookSignUpPage.Year.Xpath"),data);
		return this;
	}
	public FacebookSignUpPage clickOnGender()
	{
		clickByXpathNoSnap(prop.getProperty("FacebookSignUpPage.Gender"));
		return this;
	}
	

	 public FacebookSignUpPage  waitForFacebookSignUpPage(long time) {
		 
		 waitProperty(time);
		 return new FacebookSignUpPage(driver, test);
	 }
		
		
}
