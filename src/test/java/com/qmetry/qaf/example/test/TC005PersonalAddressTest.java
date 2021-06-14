package com.qmetry.qaf.example.test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import com.qmetry.qaf.automation.util.Reporter;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;


public class TC005PersonalAddressTest extends WebDriverTestCase {  

	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")
	@Test(enabled=true)
	
	    public void PersonalAddress(Map<String, String> userData) throws InterruptedException {
	        
	        // Logger log=Logger.getLogger(dataLoginExcel.class);
		        
	            get("https://demo.qloapps.com/login?back=my-account");
	            getDriver().manage().window().maximize();	            
	            clear("LEmail");
	            sendKeys(userData.get("email"), "LEmail");
	            clear("LPassword");
	            sendKeys(userData.get("password"), "LPassword");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            click("LButton");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            click("personal");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            
	            clear("input.firstname1");
	            sendKeys(userData.get("firstName"), "input.firstname1");
	            clear("input.lastname1");
	            sendKeys(userData.get("lastName"), "input.lastname1");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            clear("LEmail");
	            sendKeys(userData.get("email"), "LEmail");
	            sendKeys(String.valueOf(userData.get("days")), "input.days");
	            sendKeys(String.valueOf(userData.get("month")), "input.months");
	            sendKeys(String.valueOf(userData.get("year")), "input.years");
	            sendKeys(userData.get("password"), "Currentpwd");
	           click("save");
	           getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            Reporter.logWithScreenShot("pass");
	}
	
	}


