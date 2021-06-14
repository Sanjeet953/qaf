package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
public class TC006ContactTest extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")	
	@Test(enabled=true)
	public  void Contact(Map<String, String> userData)throws InterruptedException{
		get("/");
		getDriver().manage().window().maximize();
		
		click("Button");	
		  click("Contact");
		  click("Subject");
		  click("Customer");
		  clear("Email");
		  sendKeys(userData.get("email"),"Email");
		  sendKeys(userData.get("message"),"Message");
		  click("SubmitMessage");	
	}
	
}
