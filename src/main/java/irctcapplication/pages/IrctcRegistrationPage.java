package irctcapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcRegistrationPage extends GenericWrappers{

	public IrctcRegistrationPage enterUserName(String data)

	{
	  enterByXpath("//input[contains(@id,'userName')]",data);
	  return this;

    }
	
	public  IrctcRegistrationPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public  IrctcRegistrationPage enterPassword(String data)
	{
		
		enterByXpath("//input[contains(@id,'usrPwd')]", data);
		return this;
	}
	
	public IrctcRegistrationPage entercnfrmPassword(String data)
	{
		
		enterByXpath("//input[@id='cnfUsrPwd']", data);
		return this;
		
	}
	
	public IrctcRegistrationPage clickOnPreferredLanguage()
	{
		
		clickByXpathNoSnap("//span[text()='Preferred Language']");
		return this;
	}
	
	public IrctcRegistrationPage clickOnEnglish()
	{
		
		clickByXpathNoSnap("//span[text()='English']");
		return this;
	}
	
	public IrctcRegistrationPage clickOnSecurityQuestion()
	{
		
		clickByXpathNoSnap("//span[text()='Security Question']");
		clickByXpathNoSnap("//span[text()='What is your pet name?']");
		
		return this;
	}
	
	public IrctcRegistrationPage enterSecAnswer(String data)
	{
		enterByXpath("//input[contains(@type,'text')]", data);
		return this;
	}
	
	public 	IrctcRegistrationPage clickOnCuntinueButton()
	{
		clickByXpathNoSnap("//button[@class='search_btn train_Search ng-star-inserted']");
		 return this;
	}
	
	public IrctcRegistrationPage enterFirstName(String data)
	{
		enterByXpath("//input[contains(@id,'firstName')]", data);
		
		return this;
		
	}
	
	public IrctcRegistrationPage enterMiddleName(String data)
	{
		
		enterByXpath("//input[@id='middleName']", data);
		
		return this;
	}
	
	public IrctcRegistrationPage enterLastName(String data)
	{
		enterByXpath("//input[contains(@id,'lastname')]", data);
		
		return this;
	}
	
	public IrctcRegistrationPage clickOnSelectOccupation()
	{
		clickByXpathNoSnap("//span[text()='Select Occupation']");
		clickByXpathNoSnap("//span[text()='PUBLIC']");

	    return this;
	}
	public IrctcRegistrationPage clickOnPublic()
	{
		clickByXpathNoSnap("//span[text()='PUBLIC']");
		return this;

	}
	public IrctcRegistrationPage clickOnDateOfBirth()
	{
		clickByXpathNoSnap("//input[starts-with(@class,'ng-tns-c59-17 ')]");
		
		return this;
	}
	
	public IrctcRegistrationPage selectYear(String data)
	{
		selectVisibleTextByXpath("//select[@class='ui-datepicker-year ng-tns-c59-17 ng-star-inserted']",data);
		return this;
	}
	
	public IrctcRegistrationPage selectMonth(String data)
	{
		
		selectVisibleTextByXpath("//select[@class='ui-datepicker-month ng-tns-c59-17 ng-star-inserted']",data);
		return this;
	}
	
	public IrctcRegistrationPage clickOnDay()
	{
		clickByXpathNoSnap("//a[text()='4']");
		
		return this;
	}
	
	public IrctcRegistrationPage clickOnUnmarried()
	{
		clickByXpathNoSnap("//label[text()='Unmarried']");
		return this;
	}
	
	public IrctcRegistrationPage selectCountry(String value)
	{
		selectVisibleTextByXpath("//select[@formcontrolname='resCountry']", value);
		return this;
	}
	
	public IrctcRegistrationPage clickOnFemaleButton()
	{
		
		clickByXpathNoSnap("//label[text()='Unmarried']");
		return this;
	}
	
	public IrctcRegistrationPage enterEmail(String data)
	{
		enterByXpath("//input[contains(@id,'email')]", data);
		
		return this;
	}
	
	public IrctcRegistrationPage enterMoblieNum(String data)
	{
		
		enterByXpath("//input[contains(@id,'email')]", data);
		return this;
		
	}
	
	public IrctcRegistrationPage selectNationality(String data)
	{
		
		selectVisibleTextByXpath("//select[@formcontrolname='nationality']",data);
		
		return this;
	}
	
	public IrctcRegistrationPage clickOnContinueButton()
	{
		clickByXpathNoSnap("//button[@class='search_btn train_Search ng-star-inserted']");
		
		return this;
	}
	
	public IrctcRegistrationPage enterHomeAddress(String data)
	{
		
		enterByXpath("//input[contains(@id,'resAddress1')]", data);
		
		return this;
	}
	
	public IrctcRegistrationPage enterStreetAddress(String  data)
	{
		enterByXpath("//input[contains(@id,'resAddress2')]", data);
		
		return this;
	}
	
	public IrctcRegistrationPage enterAreaAddress(String data)
	{
		enterByXpath("//input[contains(@id,'resAddress3')]", data);
		
		return this;
	}
	
	public IrctcRegistrationPage enterPinCode(String data)
	{
		enterByXpath("//input[@formcontrolname='resPinCode']", data);
		
		return this;
	}
	
	public IrctcRegistrationPage clickOnStateFiled()
	{
		clickByXpath("//input[@id='resState']");
		return this;
	}
	
	public IrctcRegistrationPage selectCity(String data)
	{
		selectVisibleTextByXpath("//select[@formcontrolname='resCity']", data);
		return this;
	}
	
	
	
	public  IrctcRegistrationPage selectPost(String data)
	{
		selectVisibleTextByXpath("//select[@formcontrolname='resPostOff']",data);
		return this;
	}
	
	public IrctcRegistrationPage enterPhoneNUm(String data)
	{
		enterByXpath("//input[@id='resPhone']", data);
		
		return this;
	}
	

	
	public IrctcRegistrationPage clickOnYesButton()
	{
		clickByXpath("//label[text()='Yes']");
		
		return this;
	}
	
	public IrctcRegistrationPage clickOnRegisterButtton()
	{
		clickByXpath("//button[text()='REGISTER']");
		
		return this;
			
	}
	
	public IrctcRegistrationPage waitForIrctcRegistrationPage(long time)
	{
		waitProperty(time);
		return this;
	}

}

