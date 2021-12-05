package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctcapplication.pages.CovidAlertPage;


import wrappers.ProjectWrapper;

public class TC006  extends ProjectWrapper {

	@BeforeClass
	public void beforeClass() {
		
		testcasename="TC006";
		testdesc="bookYourCoach";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	
	@Test	
	public void bookYourCoach()
	{
		new CovidAlertPage(driver, test)
		.clickOnOkButton()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
	    .SwitchToAccommadationPage()
	    .clickOnMenuIcon()
	    .clickOnBookYourCoach()
	    .switchToFTRCoachLoginPage()
	    .clickOnNewUserSignUp()
	    .enterUserId("rukmini_20")
	    .enterPassword("Ruku@1234")
	    .enterConfirmPassword("Ruku@1234")
	    .waitForFTRUserRegistrationPage(5000)
	    .selectSecurityQuestion("What is your pet name?")
	    .waitForFTRUserRegistrationPage(3000)
	    .enterSecurityAnswer("Dog")
	    .clickOnDateOfBirth()
	    .waitForFTRUserRegistrationPage(3000)
	    .selectMonth("May")
	    .waitForFTRUserRegistrationPage(6000)
	    .selectYear("1998")
	    .clickOnDay()
	    .clickOnFemaleButton()
	    .clickOnUnmarried()
	    .enterEmailId("rukmini01@gmail.com")
	    .selectOccupation("Government")
	    .enterFirstName("Rukmini")
	    .enterMiddleName("Krishna")
	    .enterLastName("kuruguntla")
	    .waitForFTRUserRegistrationPage(3000)
	    .selectNationality("Indian")
	    .waitForFTRUserRegistrationPage(5000)
	    .enterFlatAddress("203/1-83/3rd")
	    .waitForFTRUserRegistrationPage(5000)
	    .enterStreetAddress("YSR Street")
        .enterArea("Maddipadu")
        .pageDown()
        .selectCountry("India")
        .waitForFTRUserRegistrationPage(5000)
        .enterMobileNUm("9676195986")
        .enterPinCode("524001")
        .pageDown()
        .selectCity("Nellore")
        .waitForFTRUserRegistrationPage(3000)
        .selectState("ANDHRA PRADESH")
        .waitForFTRUserRegistrationPage(3000)
        .selectPostOfc("Nellore Bazar S.O");
       
	    
		
	}
}