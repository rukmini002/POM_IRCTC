package phptravels.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpTravelsRegistraionPage extends GenericWrappers{

	public  PhpTravelsRegistraionPage enterFirstName(String data)
	{
		enterByXpath("//input[contains(@name,'firstname')]", data);
		
		return this;
	}
	
	public PhpTravelsRegistraionPage (RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	
	
	public  PhpTravelsRegistraionPage enterLastName(String data)
	{
		
		enterByXpath("//input[@id='inputLastName']", data);
		return this;
	}
	
	public  PhpTravelsRegistraionPage enterEmailId(String data)
	{
		enterByXpath("//input[contains(@name,'email')]", data);
		
		return this;
	}
	
	public PhpTravelsRegistraionPage  enterMobileNum(String data)
	{
		 enterByXpath("//input[@id='inputPhone']", data);
		 return this;
	}
	
	public PhpTravelsRegistraionPage enterCompanyName(String data)
	{
		enterByXpath("//input[contains(@name,'companyname')]", data);
		
		return this;
	}
	
	public  PhpTravelsRegistraionPage enterAddress1(String data)
	{
		enterByXpath("//input[contains(@name,'address1')]", data);
		return this;
	}
	
	public  PhpTravelsRegistraionPage  enterAddress2(String data)
	{
		enterByXpath("//input[contains(@name,'address2')]", data);
		return this;
	}
	
	public  PhpTravelsRegistraionPage enterCity(String data)
	{
		enterByXpath("//input[contains(@name,'city')]", data);
		
		return this;
	}
	
	public  PhpTravelsRegistraionPage enterState(String data)
	{
		enterByXpath("//input[contains(@name,'state')]", data);
		
		return this;
	}
	
	public PhpTravelsRegistraionPage  enterPostCode(String data)
	{
		
		enterByXpath("//input[contains(@name,'postcode')]", data);
		
		return this;
	}
	
	public PhpTravelsRegistraionPage  selectCountry(String data)
	{
		selectVisibleTextByXpath("//select[contains(@id,'inputCountry')]", data);
		
		return this;
	}
	
	public PhpTravelsRegistraionPage enterWhatsappNum(String data)
	{
		enterByXpath("//input[@id='customfield2']", data);
		
		return this;
	}
	
	public PhpTravelsRegistraionPage enterSecPassword(String data)
	{
		
		enterByXpath("//input[@id='inputNewPassword2']", data);
		
		return this;
	}
	
	public  PhpTravelsRegistraionPage enterconSecPassword2(String data)
	{
		
		enterByXpath("//input[contains(@id,'inputNewPassword2')]", data);
		
		return this;
		
	}
	
	public PhpTravelsRegistraionPage waitForPhpTravelsRegistraionPage(long time)
	{
		waitProperty(time);
		return new PhpTravelsRegistraionPage(driver, test);
	}	
	
	
}
