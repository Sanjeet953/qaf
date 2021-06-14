package com.qmetry.qaf.example.test;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
public class TC002AddressTest extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")
	@Test(enabled=true)
	public void Login1(Map<String, String> userData)throws InterruptedException {

	  // Logger log=Logger.getLogger(dataLoginExcel.class);
		        
		        
	           get("https://demo.qloapps.com/login?back=my-account");
		       
	            getDriver().manage().window().maximize();	            
	            clear("LEmail");
	            sendKeys(userData.get("email1"), "LEmail");
	            clear("LPassword");
	            sendKeys(userData.get("password"), "LPassword");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            click("LButton");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	            click("click.addmyaddress");
	           // click("click.myaddress");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            //click("click.addnewaddress");
	            clear("input.firstname1");
	            sendKeys(userData.get("firstName"), "input.firstname1");
	            clear("input.lastname1");
	            sendKeys(userData.get("lastName"), "input.lastname1");
	          
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            sendKeys(userData.get("Company"), "input.company");
	            
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            sendKeys(userData.get("Address"), "input.address");
	          
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            sendKeys(userData.get("Address2"), "input.address2");
	          
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            sendKeys(userData.get("City1"), "input.city");
	           
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            sendKeys(userData.get("City2"), "input.state");
	           
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            sendKeys(String.valueOf(userData.get("Zipcode")), "input.zipcode");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            sendKeys(String.valueOf(userData.get("country")), "input.country");
	          
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            sendKeys(String.valueOf(userData.get("Home")), "input.homenumber");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	            sendKeys(String.valueOf(userData.get("Mobile")), "input.mobile");
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	            sendKeys(userData.get("Additional"), "input.additional");
	            
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            clear("input.myaddress1");
	            sendKeys(userData.get("Myaddress"), "input.myaddress1");
	            
	            click("click.save");
	           // click("click.update");
	            
	           
	}

	}
	

