package utils;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public abstract  class Reporting {


	public static ExtentReports report;
	public  ExtentTest test;
	
	public String testcasename, testdesc;
	public void startReport() {
		
		
		report =new ExtentReports("./Reports/rukmini.html",false);
	}
	
	public void startTest(String testcasename,String description)
	{
		
		test = report.startTest(testcasename,description);
		
	
	}
	

	public abstract long takeSnap();
		
	
	public void reportStep(String status, String description)
	{
		long snapNumber =takeSnap();
		
		if(status.equalsIgnoreCase("PASS")) {
			
			test.log(LogStatus.PASS,description+test.addScreenCapture(".././Screenshot/"+snapNumber+".png"));
		}
		
		else if(status.equalsIgnoreCase("FAIL"))
		{
			test.log(LogStatus.FAIL,description+test.addScreenCapture(".././Screenshot/"+snapNumber+".png"));
			
		}
		else if (status.equalsIgnoreCase("WARNING")) {
			
			test.log(LogStatus.WARNING,description+test.addScreenCapture(".././Screenshot/"+snapNumber+".png"));
			
		}
	}
		
		public void reportStep(String status, String description, boolean snap)
		{
			if(!snap)
			
			if(status.equalsIgnoreCase("PASS")) {
				
				test.log(LogStatus.PASS,description);
			}
			
			else if(status.equalsIgnoreCase("FAIL"))
			{
				test.log(LogStatus.FAIL,description);
				
			}
			else if (status.equalsIgnoreCase("WARNING")) {
				
				test.log(LogStatus.WARNING,description);
				
			}
	}	
		public void endTest()
		{
			
			report.endTest(test);
		}
		
		public void endReport()
		{
			report.flush();
	}
	
}
