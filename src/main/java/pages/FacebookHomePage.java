package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers {
	
public FacebookSignUpPage clickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.Xpath"));
		return new FacebookSignUpPage(driver, test);
	}
 
   public  FacebookHomePage(RemoteWebDriver driver, ExtentTest test) {
	   
	   this.driver=driver;
	   this.test=test;
   }

public FacebookSignUpPage  waitForFacebookSignUpPage(long time) {
	 
	 waitProperty(time);
	 return new FacebookSignUpPage(driver, test);
}
	


}
