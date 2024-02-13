package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomScript.WelcomePage;

public class RegisterFromCmdTest extends BaseClass{
	@Test
	public void register() {
		
		String fName = System.getProperty("fName");
		String lName = System.getProperty("lName");
		String email = System.getProperty("email");
		String password = System.getProperty("password");
		String cPassword = System.getProperty("cPassword");
		
		Reporter.log(fName,true);
		Reporter.log(lName,true);
		Reporter.log(email,true);
		Reporter.log(password,true);
		Reporter.log(cPassword,true);
		
		PomScript.WelcomePage w = new WelcomePage(driver);
		w.getRegisterLink().click();;
		Reporter.log("Register Link Clicked",true);
		
		PomScript.RegisterPage r = new PomScript.RegisterPage(driver);
		r.getGender().click();
		r.getFirstName().sendKeys(fName);
		r.getLastName().sendKeys(lName);
		r.getEmailID().sendKeys(email);
		r.getPassword().sendKeys(password);
		r.getConfirmPassword().sendKeys(cPassword);
		r.getRegisterButton().click();
		Reporter.log("Successfully Registered",true);
			
	}

}
