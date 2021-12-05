package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FacebookHomePage;

import wrappers.ProjectWrapper;

public class TC001 extends ProjectWrapper{
	
	
	

	@BeforeClass
	public void beforeClass() {
		

		testcasename ="TC001";
		testdesc = "facebookSignup";
		browser="chrome";
		url ="https://www.facebook.com";
		

		
	}
	
    @Test
	public void facebookSignUp() {
		
	     new FacebookHomePage(driver,test)
	     .clickOnCreateNewAccount()
		 .waitForFacebookSignUpPage(5000)
		 .enterFirstName("Rukmini")
		 .enterLastName("Krishna")
		 .enterEmail("rukminikuruguntla01@gmail.com")
		 .reEnterEmail("rukminikuruguntla01@gmail.com")
		 .enterPassword("rukku$20")
		 .selectDate("20")
		 .waitForFacebookSignUpPage(5000)
		 .selectMonth("May")
		 .selectYear("1998")
		 .clickOnGender();
		
		
		
	}

}
