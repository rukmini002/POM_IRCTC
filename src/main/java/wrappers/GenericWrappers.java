package wrappers;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers  extends Reporting  implements Wrappers {

	
	public RemoteWebDriver driver;
	
	public String browser,url;
	

	
	public static Properties prop;
	
	public void loadObjects() {
		
		 prop = new Properties();
		
		 try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
     
	public void unloadObject()
	{
		prop=null;
	}
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
			try {
				if(browser.equalsIgnoreCase("chrome"))
				{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				  driver = new ChromeDriver();
				
			}
	
		else
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.drive","./drivers/geckodriver.exe");
				driver =new FirefoxDriver();
			}
			else
				if(browser.equalsIgnoreCase("ie"))
				{
					System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
					driver =new InternetExplorerDriver();
					
				}
				
				driver.manage().window().maximize();
				
				driver.get(url);
				
				//System.out.println("The given browser"+browser+"is launched with given url"+url+"successfully");
				
				reportStep("pass","The given browser"+browser+"is launched with given url"+url+"successfully");
				
				
			}
				
		catch (SessionNotCreatedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//System.err.println("The given browser is not launched due to session not created issue");
				reportStep("fail","The given browser is not launched due to session not created issue");
			}
			catch (WebDriverException e) {
				// TODO: handle exception
			//	System.err.println("The browser is closed due to unknown errors");
				reportStep("fail","The browser is closed due to unknown errors");
			}
		  
}
	

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The WebElement with id"+idValue+"is entered with data"+data+"successfully");
			reportStep("pass","The webelement with id"+idValue+"is entered with data"+data+"successfully");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The WebElement with id"+idValue+"is not found in the application");
			reportStep("fail","The webelement with id\"+idValue+\"is not found in the application");
		}
		catch(ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with id"+idValue+"is not interactable in the application");
			reportStep("fail","The WebElement with id\"+idValue+\"is not interactable in the application");
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			//System.out.println("The WebElement with name"+nameValue+"is entered with data"+data+"successfully");
			reportStep("pass","The WebElement with name"+nameValue+"is entered with data"+data+"successfully");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The WebElement with name"+nameValue+"is not found in the application");
			reportStep("fail","The WebElement with name"+nameValue+"is not found in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with name"+nameValue+"is not intractable in the application");
			reportStep("fail","The WebElement with name"+nameValue+"is not interactable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with name"+nameValue+"is not interceptable in the application");
			reportStep("fail","The WebElement with name"+nameValue+"is not interceptable in the application");
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	}

	public void enterByXpath(String xpathValue,String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
		
			//System.out.println("The WebElement with XPath"+xpathValue+"is entered with data"+data+"successfully");
			reportStep("pass","The WebElement with xpath"+xpathValue+"is entered with data"+data+"successfully");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The WebElement with XPath"+xpathValue+"is not found in the application");
			reportStep("fail","The WebElement with XPath"+xpathValue+"is not found in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with XPath"+xpathValue+"is not intractable in the application");
			reportStep("fail","The WebElement with XPath"+xpathValue+"is not intractable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors" );
			
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		
		try {
			
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title))
			{
				//System.out.println("The actualTitle"+actualTitle+" is matched with title"+title+"successfully");
				reportStep("pass","The actualTitle"+actualTitle+" is matched with title"+title+"successfully");
			}
			else
			{
				//System.out.println("The actualTitle"+actualTitle+"is not matched with title");
				reportStep("pass","The actualTitle"+actualTitle+"is not matched with title");
			}
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The session not created due to unknown errors);
			reportStep("fail","The session not created due to unknown errors");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
		
		//System.err.println("The browser is closed due to unknown errors");	
			reportStep("fail","The browser is closed due to unknown errors");
	}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
	try {
		String actualtext =	driver.findElementById(id).getText();
		
		if(actualtext.equals(text))
		{
			//System.out.println("The actualtext"+actualtext+" is matched with text"+text+" successfully");
			reportStep("pass","The actualtext"+actualtext+" is matched with text"+text+" successfully");
		}
		else
		{
			//System.out.println("The actualtext"+actualtext+"is not matched with text");
			reportStep("pass","The actualtext"+actualtext+"is not matched with text");
		}
	} catch (ElementNotVisibleException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The WebElement with id"+id+"is not visible in the application");
		reportStep("fail","The WebElement with id"+id+"is not visible in the application");
		
	}
	catch (NoSuchElementException e) {
		// TODO: handle exception
		//System.err.println("The WebElement with id"+id+"is not found in the application");
		reportStep("fail","The WebElement with id"+id+"is not found in the application");
	}
	catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The The WebElement with id"+id+"is not intractable in the application");
		reportStep("fail","The The WebElement with id"+id+"is not intractable in the application");
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser is closed due to unknown errors");
		reportStep("fail","The browser is closed due to unknown errors");
	}
	
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	try {
		String actualtext =	driver.findElementByXPath(xpath).getText();
		if(actualtext.equals(text))
		{
			//System.out.println("The actualtext"+actualtext+"is matched with text"+text+"successfully");
			reportStep("pass","The actualtext"+actualtext+"is matched with text"+text+"successfully");
		}
		else
		{
			//System.out.println("The actualtext"+actualtext+"is not matched with text");
			reportStep("pass","The actualtext"+actualtext+"is not matched with text");
		}
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The WebElement with XPath"+XPath+"is not found in the application");
		reportStep("fail","The WebElement with XPath"+xpath+"is not found in the application");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The WebElement with XPath"+XPath+"is not visible in the application");
		reportStep("fail","The WebElement with XPath"+xpath+"is not visible in the application");
		}
		
	catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The WebElement with XPath"+XPath+"is not interactable in the application");
		reportStep("fail","The WebElement with xpath"+xpath+"is not interactable in the application");
		
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser is closed due to unknown errors");
		reportStep("fail","The browser is closed due to unknown errors");
	}
	
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		String actualtext;
		try {
			actualtext = driver.findElementByXPath(xpath).getText();
			if(actualtext.contains(text))
			{
				//System.out.println("The actualtext"+actualtext+" is matched with text"+text+"successfully");
				reportStep("pass","The actualtext"+actualtext+" is matched with text"+text+"successfully");
			}
			else
			{
				//System.out.println("The actualtext"+actualtext+"is not matched with text");
				reportStep("pass","The actualtext"+actualtext+"is not matched with text");
			}
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The WebElement with XPath"+XPath+"is not visible in the application");
			reportStep("fail","The WebElement with XPath"+xpath+"is not visible in the application");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with XPath"+XPath+"is not visible in the application");
			reportStep("fail","The WebElement with XPath"+xpath+"is not visible in the application");
			
			
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with XPath"+XPath+"is not intractable in the application");
			reportStep("fail","The WebElement with XPath"+xpath+"is not intractable in the application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with XPath"+XPath+"is not stable in the application");
			reportStep("fail","The WebElement with XPath"+xpath+"is not stable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(id).click();
			//System.out.println("The WebElement with id"+id+"is clicked successfully");
			reportStep("pass","The WebElement with id"+id+"is clicked successfully");
			
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The WebElement with id"+id+"is not visible in the application");
			reportStep("fail","The WebElement with id"+id+"is not visible in the application");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with id"+id+"is not found in the application");
			reportStep("fail","The WebElement with id"+id+"is not found in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with id"+id+" is not interceptable in the application" );
			reportStep("fail","The WebElement with id"+id+" is not interceptable in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The WebElement  with id"+id+"is not intractable in the application");
			reportStep("fail","The WebElement  with id"+id+"is not intractable in the application");
			
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The WebElement with classVal"+classVal+"is clicked successfully");
			reportStep("pass","The WebElement with classVal"+classVal+"is clicked successfully");
			
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The WebElement with classVal"+classVal+"is not visible in the application");
			reportStep("fail","The WebElement with classVal"+classVal+"is not visible in the application");
			
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with classVal"+classVal+"is not found in the application");
			reportStep("fail","The WebElement with classVal"+classVal+"is not found in the application");
			
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The WebElement with classVal"+classVal+"is not interceptable in the application");
			reportStep("fail","The WebElement with classVal"+classVal+"is not interceptable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(name).click();
		
			//System.out.println("The WebElement with name"+name+"is clicked successfully");
			reportStep("pass","The WebElement with name"+name+"is clicked successfully");
			
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The WebElement with name"+name+"is not visible in the application");
			reportStep("fail","The WebElement with name"+name+"is not visible in the application");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The webelement with name"+name+"is not found in the application");
			reportStep("fail","The webelement with name"+name+"is not found in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The webelement with name"+name+"is not interceptable in the application");
			reportStep("fail","The webelement with name"+name+"is not interceptable in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The webelement with name"+name+"is not interactable in the application");
			reportStep("fail","The webelement with name"+name+"is not interactable in the application");
		}
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The webelement with name"+name+"is not interactable in the application");
		}
	
	}
	

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
	 try {
		driver.findElementByLinkText(name).click();
		//System.out.println("The webelement with link"+name+"is clicked successfully");
		reportStep("pass","The webelement with link"+name+"is clicked successfully");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The webelement with link"+name+"is not found in the application");
		reportStep("fail","The webelement with link"+name+"is not found in the application");
	}
	 catch (ElementNotVisibleException e) {
		// TODO: handle exception
		 //System.err.println("The webelement with link"+name+"is not visible in the application");
		 reportStep("fail","The webelement with link"+name+"is not visible in the application");
	}
	 catch (ElementNotInteractableException e) {
		// TODO: handle exception
		// System.err.println("The webelement with link"+name+"is not interactable in the application");
		 reportStep("fail","The webelement with link"+name+"is not interactable in the application");
	}
	 catch (WebDriverException e) {
		// TODO: handle exception
		 //System.err.println("The browser is closed due to unknown errors");
		 reportStep("fail","The browser is closed due to unknown errors");
	}
	 
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name);
			
			//System.out.println("The webelement with link"+name+"is clicked successfully");
			reportStep("pass","The webelement with link"+name+"is clicked successfully");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The webelement with link"+name+"is not found in the application");
			reportStep("fail","The webelement with link"+name+"is not found in the application");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The webelement with link"+name+"is not visible in the application");
			reportStep("fail","The webelement with link"+name+"is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The webelement with link"+name+"is not interceptable in the application");
			reportStep("fail","The webelement with link"+name+"is not interceptable in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The webelement with link"+name+"is not intractable in the application");
			reportStep("fail","The webelement with link"+name+"is not intractable in the application");
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The webelement with xpath"+xpathVal+"is clicked successfully");
			reportStep("pass","The webelement with xpath"+xpathVal+"is clicked successfully");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The webelement with xpath"+xpathVal+"is not found in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not found in the application");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The webelement with xpath"+xpathVal+"is not visible in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The webelement with xpath"+xpathVal+"is not intercepted in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not intercepted in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The webelement with xpath"+xpathVal+"is not interactable in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not interactable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The webelement with xath"+xpathVal+"is clicked succesfully");
			reportStep("pass","The webelement with xpath"+xpathVal+"is clicked succesfully");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The webelement with xpath"+xpathVal+"is not found in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not found in the application");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The webelement with xpath"+xpathVal+"is not visible in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not visible in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The webelement with xpath"+xpathVal+"is not interceptable in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not interceptable in the application");
		}
	
	   catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The webelement with xpath"+xpathVal+"is not intractable on the application");
		   reportStep("fail","The webelement with xpath\"+xpathVal+\"is not interactable on the application");
	}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
	}
	
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		
		String Text =null;
		try {
			String text =driver.findElementById(idVal).getText();
			//System.out.println("The webelement with id"+idVal+"is found in the application");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("The webelement with id"+idVal+"is not found in the application");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The webelement with id"+idVal+"is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The webelement with id"+idVal+"is not interactable in the application");
			
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The webelement with id"+idVal+"is not stable in the application");
			
		}
		
		return Text;
	}

	public String getTextByXpath(String xpathVal) {
		
		String Text =null;
		try {
			
		String text =driver.findElementByXPath(xpathVal).getText();
		//System.out.println("The webelement with xpath"+xpathVal+"is found successfully");
		reportStep("pass","The webelement with xpath"+xpathVal+"is found successfully");
		
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The webelement with xpath"+xpathVal+"is not found oin the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not found oin the application");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The web element with xpath"+xpathVal+"is not visible in the application");
			reportStep("fail","The web element with xpath"+xpathVal+"is not visible in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The webelement with xpath"+xpathVal+"is not intractable in the application");
			reportStep("fail","The webelement with xpath"+xpathVal+"is not intractable in the application");
		
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
		return Text;
	
}
	

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
	try {
		WebElement ele =driver.findElementById(id);
		Select text = new Select(ele);
		text.selectByVisibleText(value);
		//System.out.println("The webelement with id"+value+"is selected successfully");
		reportStep("pass","The webelement with id"+value+"is selected successfully");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The webelement with id"+value+"is not found in the application");
		reportStep("fail","The webelement with id"+value+"is not found in the application");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The webelement with id"+value+"is not visible in the application");
		reportStep("fail","The webelement with id"+value+"is not visible in the application");
		
	}
	catch (ElementNotSelectableException e) {
		// TODO: handle exception
		//System.err.println("The webelement with id"+value+"is not selectable in the application");
		reportStep("fail","The webelement with id"+value+"is not selectable in the application");
	}
	catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The webelement with id"+value+"is not interactable in the application");
		reportStep("fail","The webelement with id"+value+"is not interactable in the application");
	}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser is closed due to unknown errors");
		reportStep("fail","The browser is closed due to unknown errors");
	}
	
		
}
	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		
		try {
			WebElement element =driver.findElementById(id);
			Select index = new Select(element);
			index.selectByIndex(value);
			
			//System.out.println("The webelemet with id"+value+"is selected successfully");
			reportStep("pass","The webelemet with id"+value+"is selected successfully");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The webelement with id"+value+"is not found in the application");
			reportStep("fail","The webelement with id"+value+"is not found in the application");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The webelement with id"+value+"is not visible in the application");
			reportStep("fail","The webelement with id"+value+"is not visible in the application");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The webelement with id "+value+"is not selectable in the application");
			reportStep("fail","The webelement with id "+value+"is not selectable in the application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The webelement with id"+value+"is not interactable in the application");
			reportStep("fail","The webelement with id\"+value+\"is not interactable in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
			}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
	
	try {
		Set<String>  allwinid = driver.getWindowHandles();
		for (String parentwin: allwinid) {
			
			driver.switchTo().window(parentwin);
			break;
		}
			//System.out.println("The browser is closed due to unknown errors);
		reportStep("pass","The browser is closed due to unknown errors");
	} 
	
	  
	catch (NoSuchWindowException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The window to be switched does not exists");
		reportStep("fail","The window to be switched does not exists");
	}
     catch (SessionNotCreatedException e) {
	// TODO: handle exception
    	// System.err.println("The session not created in the application");
    	 reportStep("fail","The session not created in the application");
}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser is closed due to unknown errors");
		reportStep("fail","The browser is closed due to unknown errors");
	}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try
		 {
			Set<String> eachwin = driver.getWindowHandles();
			for (String lastwin : eachwin) {
				
				driver.switchTo().window(lastwin);
			}
	   // System.out.println("The method will switch to lastwindow");
			reportStep("pass","The method will switch to lastwindow");
			
		} 
		catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The window to be switched does not exist");
			reportStep("fail","The window to be switched does not exist");
		}
		catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The session not created in the application");
			reportStep("fail","The session not created in the application");
		}
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted successfully");
			reportStep("pass","The alert is accepted successfully");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The alert to be accept does not exist");
			reportStep("fail","The alert to be accept does not exist");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The webdriver is unable to handle the alert operation");
			reportStep("fail","The webdriver is unable to handle the alert operation");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			
			//System.out.println("The alert is dismissed successfully");
			reportStep("pass","The alert is dismissed successfully");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The alert to be dismiss does not exist");
			reportStep("fail","The alert to be dismiss does not exist");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The webdriver is unable to handle the alert operation");
			reportStep("fail","The webdriver is unable to handle the alert operation");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
		
	}
	

	public String getAlertText() {
		// TODO Auto-generated method stub
		String text =null;
	 try {
		String Text =driver.switchTo().alert().getText();
		
		//System.out.println("The method will get the text");
		reportStep("pass","The method will get the text");
		
	} catch (UnhandledAlertException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The webdriver is unable to get the alerttext");
		reportStep("fail","The webdriver is unable to get the alerttext");
	}
		return text;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number =0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			
			File temp =driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshot/"+number+".png");
			FileUtils.copyFile(temp, dest);
		    
			
			//System.out.println("The method will take snap");
		//	reportStep("pass","The method will take snap");
			
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The browser is closed due to unknown errors ");
		//	reportStep("fail","The browser is closed due to unknown erroes");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return number;
	}
	
	public void enterTextInAlert(String data)
	{
		
		try {
			driver.switchTo().alert().sendKeys(data);
			//System.out.println("The method will send the data in to alertbox");
			reportStep("pass","The method will send the data in to alertbox");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors");
		}
	}
	
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
		try {
			driver.close();
			//System.out.println("The method will close the active window");
			reportStep("pass","The method will close the active windows",false);
			
		} catch (UnreachableBrowserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The browser is unreacable due to some issues");
			reportStep("fail","The browser is unreacable due to some issues",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors",false);
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
		try {
			driver.quit();
			//System.out.println("The method will close all the browser");
			reportStep("pass","The method will close all the browser",false);
			
		} catch (UnreachableBrowserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("The browser is unreachable due to some issues");
			reportStep("fail","The browser is unreachable due to some issues",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("fail","The browser is closed due to unknown errors",false);
		}
	}
	
	public void selectValueByXpath(String Xpath , String Value)
	{
		
	try {
		WebElement web =driver.findElementByXPath(Value);
		Select data= new Select(web);
		data.selectByValue(Value);

		//System.out.println("The webelement with xpath"+Value+"is selected successfully");
		reportStep("pass","The webelement with xpath"+Value+"is selected successfully");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The webelement with xpath"+Value+"is not found in  the application");
		reportStep("fail","The webelement with xpath"+Value+"is not found in  the application");
		
	}
		catch (ElementNotSelectableException e2) {
			// TODO: handle exception
			//System.err.println("The webelement with xpath"+Value+"is not selectable in the application");
			reportStep("fail","The webelement with xpath"+Value+"is not selectable in the application");
			
		}
	catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser is closed due to unknown errors");
		reportStep("fail","The browser is closed due to unknown errors");
	}
	}
	public void switchToFrameById(String Id)
	{
		driver.switchTo().frame(Id);
	
		//System.out.println("The method will switch in the frame");
		reportStep("fail","The method will switch in the frame");
	}

   public void refresh(){
	
	try {
		driver.navigate().refresh();
		
		//System.out.println("The method will refresh the page");
		reportStep("pass","The method will refresh the page");
		
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		//System.err.println("The browser is closed due to unknown errors");
		reportStep("fail","The browser is closed due to unknown errors");
		
	}
   }


public void selectVisibleTextByXpath(String xpath, String data) {
	// TODO Auto-generated method stub
	
	try {
		WebElement ele =driver.findElementByXPath(xpath);
		Select text = new Select(ele);
		text.selectByVisibleText(data);
		//System.out.println("The webelement with xpath"+value+"is selected successfully");
		reportStep("pass","The webelement with xpath"+data+"is selected successfully");
		
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The webelement with xpath"+value+"is not found in the application");
		reportStep("fail","The webelement with xpath"+data+"is not found in the application");
	}
	catch (ElementNotVisibleException e) {
		// TODO: handle exception
		
		//System.err.println("The webelement with xpath"+value+"is not visible in the application");
		reportStep("fail","The webelement with xpath"+data+"is not visible in the application");
	}
	catch (ElementNotInteractableException e) {
		// TODO: handle exception
		
		//System.err.println("The webelement with xpath"+value+"is not interactable in the application");
		reportStep("fail","The webelement with xpath"+data+"is not interactable in the application");

	}
	catch (ElementNotSelectableException e) {
		// TODO: handle exception
		//System.err.println("The webelement with xpath"+value+"is unable to select in the application");
		reportStep("fail","The webelement with xpath"+data+"is unable to select in the application");
	}
	
	catch (WebDriverException e) {
		// TODO: handle exception
		
		//System.err.println("The browser is closed due to unknown errors");
		reportStep("fail","The browser is closed due to unknown errors");
	}

	
}


public void waitProperty(long time) {
	// TODO Auto-generated method stub
	
	try {
		Thread.sleep(5000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
}

public void keyActivityByXpath(String action,String xpath ) {
	// TODO Auto-generated method stub
	
	 
		try {
			
			if(action.equalsIgnoreCase("pageDown")) {
			driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_DOWN);
			
			}
	else
	{
		driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_UP);
	
		// TODO Auto-generated catch block
	}
		}
	 catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("fail","The browser is closed due to unknown errors");
    }

  }

public void enterByXpath(String xpathValue) {
	// TODO Auto-generated method stub
	
}

public void enterTestInAlert(String data) {
	// TODO Auto-generated method stub
	
	driver.switchTo().alert().sendKeys(data);
}



}


