package panindia.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanIndiaApplicationPage extends GenericWrappers {

	public PanIndiaApplicationPage selectTitle(String data) {
		
		selectVisibleTextByXpath("//select[@id='pan_title']", data);
		
		return this;
		
		
	}
	
	public PanIndiaApplicationPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public PanIndiaApplicationPage enterFirstName(String data) {
		
		enterByXpath("//input[@id='pan_firstname']", data);
		
		return this;
	}
	
	public  PanIndiaApplicationPage enterMiddleName(String data) {
		
		enterByXpath("//input[@id='pan_middlename']", data);
		return this;
	}
	
	public PanIndiaApplicationPage enterLastName(String data) {
		
		enterByXpath("//input[@id='pan_lastname']", data);
		
		return this;
	}
	
   public PanIndiaApplicationPage enterFatherName(String data) {
	 
	   enterByXpath("//input[@id='pan_fatherfirstname']", data);
	   
	   return this;
	   
   }

   public PanIndiaApplicationPage enterFathersMiddileName(String data)
   {
	   enterByXpath("//input[@id='pan_fathermiddlename']", data);
	   
	   return this;
       }

   public PanIndiaApplicationPage enterFathersLastName(String data) {

   enterByXpath("//input[@name='pan_fatherlastname']", data);
   
   return this;
   }
   
   
   public PanIndiaApplicationPage enterMobileNumber(String data) {
	   
	   
	   enterByXpath("//input[@id='pan_mobilenumber']", data);
	   return this;
   }
   
   public PanIndiaApplicationPage enterEmail(String data) {
	   
	   enterByXpath("//input[@name='pan_email']", data);
	   return this;
   }
   
   public  PanIndiaApplicationPage selectSourceOfIncome(String data) {
	   
	   selectVisibleTextByXpath("//select[@name='pan_sourceofincome']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage clickOnResidence()
   {
	   
	 clickByXpathNoSnap("//input[@id='residence']");
	 
	 return this;
   }
   
   public PanIndiaApplicationPage enterDateOfBirth(String data) {
	   
	   enterByXpath("//input[@placeholder='DD/MM/YYYY']", data);
	   
	   return  this;
   }
   
   public PanIndiaApplicationPage enterHomeAddress(String data) {
	   
	   enterByXpath("//input[@id='pan_addressline1']",data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage enterStreetAddress(String data) {
	   
	   enterByXpath("//input[@id='pan_addressline2']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage enterCity(String data) {
	   
	   enterByXpath("//input[@id='pan_cityname']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage selectState(String data) {
	   
	   selectVisibleTextByXpath("//select[@id='pan_state']", data);
	   
	   return this;
   }
  
   public PanIndiaApplicationPage pageDown() {
	   
	   keyActivityByXpath("pagedown","//html/body");
	   
	   return this;
	   
   }
   
   public PanIndiaApplicationPage enterPincode(String data) {
	   
	   enterByXpath("//input[@id='pan_pincode']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage selectCountry(String data) {
	   
	   
	   selectVisibleTextByXpath("//select[@id='pan_country']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage waitForPanIndiaApplicationPage(long time) {
	   
	   waitProperty(time);
	   return this;
   }
   public PanIndiaApplicationPage selectIdentityProof(String data) {
	   
	   selectVisibleTextByXpath("//select[@id='pan_identityproof']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage selectAddressProof(String data) {
	   
	   selectVisibleTextByXpath("//select[@id='pan_addressproof']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage selectDOBProof(String data) {
	   
	   selectVisibleTextByXpath("//select[@id='pan_DOBproof']", data);
	   
	   return this;
   }
   
   public PanIndiaApplicationPage selectAdharProof(String data) {
	   
	   selectVisibleTextByXpath("//select[@name='pan_aadhaarproof']", data);
	   
	   return this;
   
   }
}
   
   

   