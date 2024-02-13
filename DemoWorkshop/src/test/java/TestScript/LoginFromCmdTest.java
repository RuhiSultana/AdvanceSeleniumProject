package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomScript.WelcomePage;


public class LoginFromCmdTest extends BaseClass{
	//Running the testCase from command prompt and passing UN & PW from cmd 
	@Test
	public void login() {
		String email = System.getProperty("email");
		String password = System.getProperty("password");
		
			
		Reporter.log(email,true);
		Reporter.log(password,true);

		PomScript.WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();;
		Reporter.log("Login Link Clicked",true);
		
		PomScript.LoginPage l = new PomScript.LoginPage(driver);
		l.getEmailID().sendKeys(email);
		l.getPassword().sendKeys(password);
		l.getLoginButton().click();
		Reporter.log("Successfully Login",true);
			
	}
		

}
