package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctcapplication.pages.CovidAlertPage;

import wrappers.ProjectWrapper;


public class TC003 extends ProjectWrapper {
	
	
	@BeforeClass
	public void beforeClass() {
		
		testcasename="TC003";
		testdesc="saloonMandatoryCheck";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
        @Test
	    public void saloonMandatoryCheck()	{
		new CovidAlertPage(driver, test)
		.clickOnOkButton()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.SwitchToAccommadationPage()
		.clickOnMenuIcon()
		.clickOnCharter()
	    .clickOnEnquiryForm()
	    .waitForEnquiryFormPage(5000)
		.enterApplicantName("Rukmini")
		.enterOrganizationName("Hindhusthan")
		.enterAddress("ongole")
		.enterMobileNum("9505289490")
		.enterEmail("rukmini01@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginStation("ongole")
		.enterDestinationStation("Nellore")
		.clickOnCheckInDate()
		.clickOnDate()
		.clickOnCheckoutDate()
		.clickOnOutDate()
		.enterDurationPeriod("5")
		.enterNoOfPassengers("2")
		.enterNoOfPassengers("20")
		.enterCharterPurpose("enquiry");
		
        }
		
		
}	
		
		
		
		 
		
		
	    
		
		
		
		
		
	
