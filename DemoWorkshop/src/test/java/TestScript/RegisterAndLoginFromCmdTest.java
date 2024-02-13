package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomScript.WelcomePage;

public class RegisterAndLoginFromCmdTest extends BaseClass{
	@Test(priority = 1)
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
		
		w.getLogoutButton().click();
		Reporter.log("Successfully Logout",true);
			
	}
	@Test(priority = 2)
	public void login() {
		String uemail = System.getProperty("uemail");
		String upassword = System.getProperty("upassword");
		
			
		Reporter.log(uemail,true);
		Reporter.log(upassword,true);

		PomScript.WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();;
		Reporter.log("Login Link Clicked",true);
		
		PomScript.LoginPage l = new PomScript.LoginPage(driver);
		l.getEmailID().sendKeys(uemail);
		l.getPassword().sendKeys(upassword);
		l.getLoginButton().click();
		Reporter.log("Successfully Login",true);
			
	}

}
