package testcases;


import wrappers.ProjectWrapper;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import phptravels.page.PhpTravelsHomePage;

public class TC004 extends ProjectWrapper{
	
	
	@BeforeClass
	public void beforeClass() {
		
		testcasename="TC004";
		testdesc="phpTravelsHomePage";
		browser="chrome";
		url="https://www.phptravels.org/index.php?rp=/login";
		
		
		
	}
	@Test
 public void  phpTravelsHomePage()
 {
	 new PhpTravelsHomePage(driver,test)
	 .clickOnRegister()
	 .waitForPhpTravelsRegistraionPage(5000)
	 .enterFirstName("Rukmini")
	 .enterLastName("Kuruguntla")
	 .enterEmailId("rukmini01@gmail.com")
	 .enterMobileNum("9505197881")
	 .enterCompanyName("HCL")
	 .enterAddress1("Shollinganallur")
	 .enterAddress2("Chennai")
	 .enterCity("Chennai")
	 .enterState("Tamil Nadu")
	 .enterPostCode("600097")
     .selectCountry("India") 
     .enterWhatsappNum("9505197881")
     .enterSecPassword("rukku@121")
     .enterconSecPassword2("rukku@121");
	 
 }
	
}
