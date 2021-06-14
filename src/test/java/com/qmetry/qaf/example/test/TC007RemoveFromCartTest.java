package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.mouseOver;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.Reporter;
public class TC007RemoveFromCartTest extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")	
	@Test(enabled=true)
	
	    public void Remove(Map<String, String> userData) throws InterruptedException {
	           
	         get("/");
	            getDriver().manage().window().maximize();
	           sendKeys("United States", "hotel_loc");
	       
	            click("hotel_in");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            click("hotel_inD");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            click("hotel_out");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            click("hotel_ouD");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	             click("hotel_sel");
	             getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	                 click("hotel_nam");
	                 getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	               
	            click("search_hotel");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            click("book_lux");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            click("proceed");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	            
	        //    mouseOver("cart");
	            
	        //    mouseOver("x");
	        //    click("x");
	            click("Remove");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            Reporter.logWithScreenShot("pass");
	                
	}
	}
	 
	
