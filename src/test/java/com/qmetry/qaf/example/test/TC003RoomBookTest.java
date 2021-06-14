package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.core.TestBaseProvider;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class TC003RoomBookTest extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")
	@Test(enabled=true)
	
	    
	    public  void RoomBook(Map<String, String> userData)throws InterruptedException{
	        get("/");
	        getDriver().manage().window().maximize();
	        click("BookHThreeLines");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        click("BookHRooms");
	       
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        click("BookHBookNow");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        String parentHandle = getDriver().getWindowHandle();      
	        for (String winHandle : getDriver().getWindowHandles()) {
	            getDriver().switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
	        }
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        click("Checkin");
	        click("Checkindate");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        click("BookHBookNow2");
	       
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	        click("BookHProceedBtn");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        click("Proceed");
	      
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        click("BookHLoginnow");
	        sendKeys(userData.get("email"), "BookHEmail");
	       
	        sendKeys(userData.get("password"), "BookHPassword");
	       
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        click("BookHSubmitLogin");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        click("BookHProceedBtn2");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        click("BookHAgreeCheckBox");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        click("BookHBankwire");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        click("BookHConfirmMyOrder");
	        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        Reporter.logWithScreenShot("pass");
	}
	   
	    
	}

