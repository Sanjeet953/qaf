package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.Reporter;

public class TC004CancelTest extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")
	@Test(enabled=true)
	
	    public void Cancel(Map<String, String> userData) throws InterruptedException {
		     
            get("https://demo.qloapps.com/login?back=my-account");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            clear("LEmail");
            sendKeys(userData.get("email"), "LEmail");
            clear("LPassword");
            sendKeys(userData.get("password"), "LPassword");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            click("LButton");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            click("OrderHistory");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            click("Details");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            click("Cancel");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //Thread.sleep(3000);
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            click("Checkbox");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
            click("Submit"); 
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
            sendKeys("THANK YOU", "reason");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
            click("SubmitReason");
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
            Reporter.logWithScreenShot("pass");
                }

 }
	

