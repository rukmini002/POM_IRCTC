package wrappers;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrapper extends GenericWrappers{

	@BeforeSuite
	public void beforeSuite() {
	
		startReport();

	}
	
	@BeforeTest
	public void beforeTest() {
		
		loadObjects();
		
	}

	
	@BeforeMethod
	public void beforeMethod() {
		
		startTest(testcasename, testdesc);
		invokeApp(browser, url);
	}
	
	@AfterMethod
	public void afterMethod() {
		
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		
		unloadObject();
	}
	
	@AfterSuite
	public void afterSuite() {
		
		endReport();
	}
}
