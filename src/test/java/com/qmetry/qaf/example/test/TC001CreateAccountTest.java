package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.Reporter;
public class TC001CreateAccountTest extends  WebDriverTestCase {  

	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")	
	@Test(enabled=true)
	public  void Createaccount(Map<String, String> userData)throws InterruptedException{
		get("/");
		getDriver().manage().window().maximize();
        click("click.sigin");
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        sendKeys(userData.get("email1"), "input.Email");
        click("click.create");
      
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click("click.mr");
        sendKeys(userData.get("firstName"), "input.firstname");
        sendKeys(userData.get("lastName"), "input.lastname");
        sendKeys(userData.get("password"), "input.password");
         sendKeys(String.valueOf(userData.get("days")), "input.days");
         sendKeys(String.valueOf(userData.get("month")), "input.months");
         sendKeys(String.valueOf(userData.get("year")), "input.years");
        
      click("click.register");
      getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //System.out.println("Account created Successfully");
      //verifyLinkWithPartialTextPresent("Your account has been created");
      Reporter.logWithScreenShot("pass");

}

 	}	
	
	

