package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import irctcapplication.pages.CovidAlertPage;
import wrappers.ProjectWrapper;

public class TC009 extends ProjectWrapper {

	
	@BeforeClass
	public void beforeClass() {
		
	testcasename ="TC009";
	testdesc="bookHotelOTPValidation";
	browser="chrome";
	url="https://www.irctc.co.in";
	
	}
	
    @Test
	public void bookHotelOTPValidation()
	{
    	new CovidAlertPage(driver, test)
    	.clickOnOkButton()
    	.clickOnHolidays()
    	.clickOnStays()
    	.clickOnLounge()
    	.SwitchToAccommadationPage()
    	.clickOnHotelsIcon()
    	.switchToIrctcHotelsPage()
    	.clickOnLoginIcon()
    	.clickOnGuestLogin()
    	.enterEmail("rukmini01@gmail.com")
    	.enterMobileNum("9505197881")
    	.clickOnLoginButton()
    	.enterCityOrHotelName("Hyd")
    	.clickOnHotel()
    	.clickOnCheckInDate()
    	.clickOnArrow()
    	.clickOnYear()
    	.clickOnMonth()
    	.waitForIrctcHotelsPage(5000)
    	.clickOnDate()
    	.waitForIrctcHotelsPage(6000)
    	.clickOnRoomsGuestsField()
    	.selectRooms("1")
    	.selectAdults("2")
    	.clickOnDoneButton1()
    	.clickOnFindHotelButton()
    	.waitForIrctcHotelsPage(5000)
    	.clickOnContinueButton()
    	.waitForIrctcHotelsPage(7000)
    	.selectTitle("Miss")
    	.enterFirstName("Rukmini")
    	.enterLastName("kuruguntla")
    	.selectCountry("India")
    	.selectState("ANDHRA PRADESH")
         .waitForIrctcHotelsPage(5000)
    	.selectGstOption("No")
    	.verifyHotelName("The Park Hyderabad")
    	.verifyAmount("₹ 6216")
    	.clickOnGo()
    	.waitForIrctcHotelsPage(5000)
    	.clickOnCheckBox()
    	.waitForIrctcHotelsPage(3000)
    	.clickOnMakePayment()
    	.waitForIrctcHotelsPage(5000)
    	.clickOnVerify();
		
		
	}

	
}
