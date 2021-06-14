package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.io.IOException;
import java.util.Map;

import com.qmetry.qaf.automation.step.CommonStep;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class StepsLibrary {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */ 
    @QAFTestStep(description = "Login")
	public static void Login(String email,String psword)
	{
		click("myaccount");
		click("Login");
		sendKeys(email,"Emailid");
		sendKeys(psword,"Password1");
		click("submit1");
		System.out.println("Login Successfully");
		
	}
	@QAFTestStep(description = "Register fail")
	public static void Registerfailed(String frstname,String lstname,String eml,String pass,String passcon) {
		click("myaccount");
		click("Register");
		sendKeys(frstname, "Firstname");
		sendKeys(lstname,"Lastname");
		sendKeys(eml,"Email");
		sendKeys(pass,"Password");
		sendKeys(passcon,"PasswordConfirm");
		click("NewsLetter");
		click("agree");
		click("submit");
		Reporter.logWithScreenShot("pass");

	}
	@QAFTestStep(description = "Tab")
	public static void Tab(String email,String psword)
	{
		click("myaccount");
		click("Login");
		sendKeys(email,"Emailid");
		sendKeys(psword,"Password1");
		click("submit1");
		System.out.println("Login Successfully");	
		click("Desktop");
		click("showall");
		click("Laptop");
		click("Addtocart");
		System.out.println("AddToCart successfully");
		
	}
}
