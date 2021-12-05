package irctcapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelsPage extends GenericWrappers {

	public IrctcHotelsPage clickOnLoginIcon()
	{
	     clickByXpathNoSnap("//a[text()='Login']");
		
		return this;
	}
	
	public IrctcHotelsPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}


	public  IrctcHotelsPage waitForIrctcHotelsPage(long time)
	{
		waitProperty(time);
		return this;
	}
	

	public IrctcHotelsPage clickOnGuestLogin()
	{
		clickByXpath("//a[text()='Guest User Login ']");
		
		return this;
	}
	
	public IrctcHotelsPage enterEmail(String data)
	{
		enterByXpath("//input[@name='email']", data);
		
		return this;
	}
	
	public IrctcHotelsPage enterMobileNum(String data)
	{
		
		enterByXpath("//input[@name='mobileNo']", data);
		
		return this;
	}
	
	public   IrctcHotelsPage   clickOnLoginButton()
	{
		
		clickByXpathNoSnap("//button[text()='Login']/following::button[1]");
		return this;
	}
	
	public IrctcHotelsPage enterCityOrHotelName(String data)
	{
		enterByXpath("//input[@placeholder='Enter City or Hotel Name']", data);
		
		return this;
	}
	
	public IrctcHotelsPage clickOnHotel()
	{
		clickByXpathNoSnap("//strong[text()='Hotel']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckInDate()
	{
		clickByXpathNoSnap("//input[@name='dt12']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnArrow()
	{
		clickByXpathNoSnap("//span[@class='owl-dt-control-button-arrow']");
		
		return this;
		
	}
	
	public IrctcHotelsPage clickOnDate() {
		
		clickByXpathNoSnap("//span[text()='30']");
		return this;
	}
	public IrctcHotelsPage clickOnMonth()
	{
		clickByXpathNoSnap("//span[text()='Nov']");
		
		return this;
	}
	public IrctcHotelsPage clickOnYear()
	{
		
		clickByXpathNoSnap("//span[text()='2021']");
		
		return this;
	}
	
	
	public IrctcHotelsPage clickOnCheckOutDate()
	{
		
		clickByXpath("//input[@placeholder='Check-out Date']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnYearArrowButtonn()
	
	{
		clickByXpath("//span[@class='owl-dt-control-button-arrow']");
		
		return this;
	}
	
	
	public IrctcHotelsPage  clickOnOutDate()
	{
		clickByXpath("//span[text()='25']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnOutMonth()
	{
		
		clickByXpath("//span[text()='Nov']");
		return this;
	}
	
	public IrctcHotelsPage clickOnOutYear()
	{
		clickByXpath("//span[text()='2021']");
		
		return this;
	}
	public IrctcHotelsPage waitForIrctcHotelsPage1(long time) {
		
		waitProperty(time);
		return this;
	}
	public IrctcHotelsPage clickOnRoomsGuestsField()
	{
		
		clickByXpath("//input[@name='guest']");
		
		return this;
	}
	
	public IrctcHotelsPage selectRooms(String data)
	{
		selectVisibleTextByXpath("//select[@name='hotelRoom']",data);
		
		return this;
	}
	
	public IrctcHotelsPage selectAdults(String data)
	{
		selectVisibleTextByXpath("//select[@name='hotelAdult']",data);
		
		return this;
		
	}
	
	public IrctcHotelsPage clickOnDoneButton1()
	{
		clickByXpathNoSnap("//button[text()='Done']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnFindHotelButton()
	{
		clickByXpathNoSnap("//button[@class='btn btn-md yellow-gradient home-btn']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnContinueButton()
	{
		clickByXpath("//b[text()='Continue to Book']");
		
		return this;
	}
	
	
	
	public IrctcHotelsPage clickOnGuestLogin1()
	{
		clickByXpath("//a[text()='Guest User Login ']");
		
		return this;
	}
	
	public IrctcHotelsPage enterEmail1(String data)
	{
		enterByXpath("//input[@name='email']", data);
		
		return this;
	}
	
	public IrctcHotelsPage enterMobileNum1(String data)
	{
		
		enterByXpath("//input[@name='mobileNo']", data);
		
		return this;
	}
	
	public   IrctcHotelsPage   clickOnLoginButton2()
	{
		
		clickByXpathNoSnap("//button[text()='Login']/following::button[1]");
		return this;
	}
	
	
	public IrctcHotelsPage selectTitle(String data)
	{
		selectVisibleTextByXpath("//select[@name='title']",data);
		
		return this;
	}
	
	public IrctcHotelsPage enterFirstName(String data)
	{
		
		enterByXpath("//input[@name='firstName']", data);
		
		return this;
	}
	
	public IrctcHotelsPage enterLastName(String data)
	{
		
		enterByXpath("//input[@name='lastName']", data);
		
		return this;
	}
	
	public IrctcHotelsPage selectCountry(String data)
	{
		selectVisibleTextByXpath("//select[@name='country']",data);
		
		return this;
	}
	
	public IrctcHotelsPage selectState(String data)
	
	{
		selectVisibleTextByXpath("//select[contains(@name,'state')]",data);
		
		return this;
	}
   
	public IrctcHotelsPage selectGstOptions(String data)
	{
		
		selectVisibleTextByXpath("//select[@name='gst']",data);
		
		return this;
	}
	
	public IrctcHotelsPage selectGstOption(String data) {
		
		selectVisibleTextByXpath("//select[@name='gst']", data);
		
		return this;
	}
	
	public IrctcHotelsPage enterCompanyName(String data) {
		
		enterByXpath("//input[@placeholder='Company Name*']", data);
		
		return this;
	}
	
	public IrctcHotelsPage enterCompanyAddress(String data)
	{
		
		enterByXpath("//input[@name='companyAddress']", data);
		
		return this;
	}
	public IrctcHotelsPage clickOnContinueButton1()
	{
		clickByXpathNoSnap("//button[text()='Continue']");
		return this;
	}
	
	public IrctcHotelsPage pageDown() {
		
		keyActivityByXpath("pagedown","//html/body");
		
		return  this;
	}
	public IrctcHotelsPage gstNuberrRequired(String text) {
		
		verifyTextContainsByXpath("//span[text()='gstNumber is required.']", text);
		return this;
			}
	
	public IrctcHotelsPage verifyHotelName(String data) {
		
		verifyTextContainsByXpath("//h5[text()='The Park Hyderabad ']",data);
		
		return this;
	}
	
	public IrctcHotelsPage verifyAmount(String data) {
		
		verifyTextContainsByXpath("//strong[text()='₹ 6216']", data);
		
		return this;
	}
	
	public IrctcHotelsPage clickOnGo() {
		
		clickByXpathNoSnap("//button[text()='Continue']");
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckBox() {
		
		clickByXpathNoSnap("//span[@class='checkmark']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnMakePayment() {
		
		clickByXpathNoSnap("//button[text()='Make Payment']");
		
		return this;
	}
	
	public IrctcHotelsPage clickOnVerify() {
		
		clickByXpathNoSnap("//button[text()='Verify']");
		
		return this;
	}
	


  }

	

