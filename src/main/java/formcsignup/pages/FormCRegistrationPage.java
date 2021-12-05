package formcsignup.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCRegistrationPage extends GenericWrappers {

	public  FormCRegistrationPage enterUserId(String data)
	{
		enterByXpath("//input[@id='u_id']", data);
		
		return this;
	}
	
	public FormCRegistrationPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FormCRegistrationPage enterPassword(String data)
	{
		
		enterByXpath("//input[@name='u_pwd']", data);
		
		return this;
	}
	
	public  FormCRegistrationPage enterCnfrmPssword(String data)
	{
		enterByXpath("//input[@id='u_repwd']", data);
		
		return this;
	}
	
	public FormCRegistrationPage selectSecurityQuestion(String data)
	{
		selectVisibleTextByXpath("//select[@id='u_secques']",data);
		
		return this;
	}
	
	public FormCRegistrationPage enterSecAnswer(String data)
	{
		enterByXpath("//input[contains(@id,'u_secans')]", data);
		
		return this;
	}
	
	public FormCRegistrationPage enterName(String data)
	{
		enterByXpath("//input[contains(@id,'u_name')]", data);
		
		return this;
	}
	
	public FormCRegistrationPage selectGender(String data)
	{
		
	   selectVisibleTextByXpath("//select[@id='u_gender']", data);
	   
	   return this;
	   
	}
	
	public FormCRegistrationPage enterDOB(String data)
	{
		 enterByXpath("//input[@datepicker_format='DD/MM/YYYY']", data);
		
		return this;
	}
	
	public FormCRegistrationPage enterDesignation(String data)
	{
		enterByXpath("//input[@name='u_designation']", data);
		
		return  this;
	}
	
	public FormCRegistrationPage enterEmailId(String data)
	{
		enterByXpath("//input[@id='u_emailid']", data);
		
		return this;
	}
	public FormCRegistrationPage enterMobileNum(String data)
	{
		enterByXpath("//input[@id='u_mobile']", data);
		
		return this;
	}
	public FormCRegistrationPage enterPhoneNum(String data)
	{
		enterByXpath("//input[@id='u_phone']", data);
		
		return this;
	}
	
	public FormCRegistrationPage selectNationality(String data)
	{
		selectVisibleTextByXpath("//select[@id='u_nationality']",data);
		
		return this;
	}
	
	public FormCRegistrationPage enterHotelName(String data)
	{
		
		enterByXpath("//input[@id='name']", data);
		
		return this;
	}
	
	public FormCRegistrationPage enterHotelCapacity(String data)
	{
		enterByXpath("//input[contains(@name,'capacity')]", data);
		
		return this;
	}
	
	public FormCRegistrationPage enterHotelAddress(String data)
	{
		enterByXpath("//textarea[contains(@name,'address')]", data);
		
		return this;
	}
    public FormCRegistrationPage selectState(String data)
    {
    	selectVisibleTextByXpath("//select[@id='state']", data);
    	
    	return this;
    }
    
    public FormCRegistrationPage selectDistrict(String data)
    {
    	selectVisibleTextByXpath("//select[@id='city_distr']", data);
    	
    	return this;
    }
    
    public FormCRegistrationPage selectAccomidationType(String data)
    {
    	selectVisibleTextByXpath("//select[contains(@id,'acco_type')]",data);
    	
    	return this;
    }
    
    public FormCRegistrationPage selectAccomidationGrade(String data)
    {
    	
    	selectVisibleTextByXpath("//select[contains(@id,'star_rat')]",data);
    	
    	return this;
    }
    
    public FormCRegistrationPage enterHotelEmail(String data)
    {
    	
    	enterByXpath("//input[@id='email']",data);
    	
    	return this;
    }
    
   
    
    public FormCRegistrationPage enterHotelMobileNum(String data)
    
    {
    	
    	enterByXpath("//input[@id='mcontact']", data);
    	
    	return this;
    }
    
    public FormCRegistrationPage enterHotelPhoneNum(String data)
    {
    	enterByXpath("//input[@id='contact']", data);
    	
    	return this;
    }
    
    public FormCRegistrationPage enterOwnerName(String data)
    {
    	enterByXpath("//input[@name='name_o']", data);
    	return this;
    }
    
    public FormCRegistrationPage enterOwnerAddress(String data)
    {
    	
    	enterByXpath("//input[@name='address_o']", data);
    	
    	return this;
    }
    
    public FormCRegistrationPage selectOwnerState(String data)
    {
    	selectVisibleTextByXpath("//select[@id='state_o']",data);
    	
    	return this;
    }
    
    public FormCRegistrationPage selectOwnerDistrict(String data)
    {
    	selectVisibleTextByXpath("//select[@id='citydistr_o']", data);
    	return this;
    	
    }
    
    public FormCRegistrationPage  enterOwnerEmailId(String data)
    {
    	
    	enterByXpath("//input[@name='emailid_o']", data);
    	return this;
    }
    
    public FormCRegistrationPage enterOwnerPhoneNum(String data)
    {
    	enterByXpath("//input[@name='phoneno_o']", data);
    	return this;
    }
    
    public FormCRegistrationPage enterOwnerMobileNum(String data)
    {
    	enterByXpath("//input[@name='mobile_o']", data);
    	
    	return this;
    }
    
	public  FormCRegistrationPage waitForFormCRegistrationPage(long time)
	{
		waitProperty(time);
		return new FormCRegistrationPage(driver, test);
	}
    
    
} 
