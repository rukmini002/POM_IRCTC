package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctcapplication.pages.CovidAlertPage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrapper;

public class TC007 extends ProjectWrapper {
	
	@BeforeClass
	public void beforeClass() {
		
	testcasename ="TC007";
	testdesc="bookHotelGSTValidation";
	browser="chrome";
	url="https://www.irctc.co.in";
	
	
	
	}
	
	
    @Test
	public void bookHotelGSTValidation()
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
		.enterMobileNum("9505178873")
		.clickOnLoginButton()
		.waitForIrctcHotelsPage(4000)
		.enterCityOrHotelName("Hyd")
		.clickOnHotel()
		.clickOnCheckInDate()
		.waitForIrctcHotelsPage(5000)
		.clickOnArrow()
		.clickOnYear()
		.clickOnMonth()
		.waitForIrctcHotelsPage(7000)
		.clickOnDate()
		.waitForIrctcHotelsPage(5000)
		.clickOnRoomsGuestsField()
		.selectRooms("1")
		.waitForIrctcHotelsPage(5000)
		.selectAdults("2")
		.clickOnDoneButton1()
		.waitForIrctcHotelsPage(3000)
		.clickOnFindHotelButton()
		.waitForIrctcHotelsPage(5000)
		.clickOnContinueButton()
		.waitForIrctcHotelsPage(4000)
		.selectTitle("Miss")
		.enterFirstName("rukmini")
		.waitForIrctcHotelsPage(5000)
		.enterLastName("krishna")
		.selectCountry("India")
		.selectState("ANDHRA PRADESH")
		.waitForIrctcHotelsPage(5000)
		.selectGstOptions("Yes")
		.waitForIrctcHotelsPage(7000)
		.enterCompanyName("HCL")
		.enterCompanyAddress("Chennai")
		.pageDown()
		.waitForIrctcHotelsPage(3000)
		.clickOnContinueButton1()
		.gstNuberrRequired("gstNumber is required.");
		
	}
}
