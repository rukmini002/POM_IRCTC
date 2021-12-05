package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctcapplication.pages.CovidAlertPage;
import wrappers.ProjectWrapper;


public class TC002 extends ProjectWrapper{
	
	@BeforeClass
	public void beforeClass() {
		
		testcasename ="TC002";
		testdesc ="irctcSignUp";
		browser ="chrome";
		url ="https://www.irctc.co.in/nget/train-search";
		
			
	}
	
    @Test
	public void irctcSignUp ()
	{
		new CovidAlertPage(driver, test)
		.clickOnOkButton()
        .clickOnRegister()
		.waitForIrctcRegistrationPage(5000)
		.enterUserName("Rukmini")
		.enterPassword("rukku$123")
		.entercnfrmPassword("rukku$123")
		.clickOnPreferredLanguage()
		.clickOnEnglish()
		.clickOnSecurityQuestion()
		.enterSecAnswer("Dog")
		.clickOnContinueButton()
		.enterFirstName("Rukmini")
		.enterMiddleName("Krishna")
		.enterLastName("Kuruguntla")
		.clickOnSelectOccupation()
		.clickOnPublic()
		.clickOnDateOfBirth()
		.selectYear("1997")
		.waitForIrctcRegistrationPage(5000)
		.selectMonth("May")
		.clickOnDay()
		.clickOnUnmarried()
		.selectCountry("India")
		.clickOnFemaleButton()
		.enterEmail("rukmini01@gmail.com")
		.enterMoblieNum("9505198871")
		.selectNationality("India")
		.clickOnContinueButton()
		.enterHomeAddress("Anus/1-84")
		.enterStreetAddress("Gandhistreet")
		.enterAreaAddress("Maddipadu")
		.enterPinCode("523211")
		.clickOnStateFiled()
		.waitForIrctcRegistrationPage(4000)
        .selectCity("PRAKASAM")
		.waitForIrctcRegistrationPage(5000)
		.selectPost("Annangi B.O")
		.waitForIrctcRegistrationPage(4000)
		.enterPhoneNUm("9505197881")
		.clickOnYesButton()
		.clickOnRegisterButtton();
		
		
	}
}