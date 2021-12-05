package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import panindia.pages.PanIndiaApplicationPage;
import wrappers.ProjectWrapper;

public class TC008  extends ProjectWrapper{                  

	
	@BeforeClass                                       
	public void beforeClass() {                            
		
		testcasename="TC008";
		testdesc= "PanIndiaApplicatonForm";
		browser="chrome";
		url="https://panind.com/india/new_pan";
		                                                  
	}
	@Test
	public void PanIndiaApplicationPage ()
	{
		new PanIndiaApplicationPage(driver,test)
		.selectTitle("MISS")
		.enterFirstName("Rukmini")
		.enterMiddleName("Krishna")
		.enterLastName("kuruguntla")
		.enterFatherName("Subba reddy")
		.enterFathersMiddileName("reddy")
		.enterFathersLastName("Kuruguntla")
		.enterMobileNumber("9505197881")
		.enterEmail("rukmini01@gmail.com")
		.selectSourceOfIncome("Salary")
		.clickOnResidence()
		.waitForPanIndiaApplicationPage(5000)
		.enterDateOfBirth("20051997")
		.pageDown()
		.enterHomeAddress("1-23")
		.waitForPanIndiaApplicationPage(3000)
		.enterStreetAddress("Aqua")
		.waitForPanIndiaApplicationPage(5000)
		.enterCity("Keerthipadu")
		.selectState("Andhra Pradesh")
		.enterPincode("523211")
		.selectCountry("INDIA")
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.waitForPanIndiaApplicationPage(5000)
		.selectAddressProof("VOTER ID card which is having complete Date of Birth (In Copy)")
		.selectDOBProof("Aadhar Card issued by UIDAI(In Copy)")
		.waitForPanIndiaApplicationPage(3000)
		.selectAdharProof("Copy of Aadhaar Card / Letter");
		
		
		
	}
}
