package testcases;
import wrappers.ProjectWrapper;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import formcsignup.pages.FormCHomePage;

public class TC005  extends ProjectWrapper {

	
	@BeforeClass
	public void beforeClass() {
		
		testcasename="TC005";
		testdesc="formcSignUp";
		browser="chrome";
		url=" https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
		
		
	}
	@Test
	public void formcSignUp()
	{
		new FormCHomePage(driver,test)
		.clickOnSignUp()
		.enterUserId("Rukmini12")
		.enterPassword("k.rkr123")
		.enterCnfrmPssword("k.rkr123")
		.selectSecurityQuestion("What is the name of the street where you grew up?")
		.enterSecAnswer("Home")
		.enterName("Rukmini")
		.selectGender("Female")
		.enterDOB("20/05/1997")
		.waitForFormCRegistrationPage(5000)
		.enterDesignation("Analyst")
		.enterEmailId("rukmini01@gmail.com")
		.enterMobileNum("9505197881")
		.enterPhoneNum("0862633345")
		.selectNationality("INDIA")
		.enterHotelName("AAVAS")
		.enterHotelCapacity("1000")
		.enterHotelAddress("vellampalli,On High way NH5,523211")
		.selectState("ANDHRA PRADESH")
		.waitForFormCRegistrationPage(5000)
	    .selectDistrict("PRAKASAM")
	    .waitForFormCRegistrationPage(5000)
		.selectAccomidationType("Hotel")
		.waitForFormCRegistrationPage(6000)
		.selectAccomidationGrade("Five Star")
		.enterHotelEmail("AAVAS@gmail.com")
		.waitForFormCRegistrationPage(5000)
		.enterHotelMobileNum("9100954738")
		.waitForFormCRegistrationPage(3000)
		.enterHotelPhoneNum("9390269777")
		.enterOwnerName("Ganesh")
		.enterOwnerAddress("vellampalli")
		.waitForFormCRegistrationPage(5000)
		.selectOwnerState("ANDHRA PRADESH")
		.waitForFormCRegistrationPage(7000)
		.selectDistrict("PRAKASAM")
		.enterOwnerEmailId("Ganesh02@gmail.com")
		.enterOwnerMobileNum("7995300890")
		.enterOwnerPhoneNum("9505488901");
		
		
	}
			
			
}
