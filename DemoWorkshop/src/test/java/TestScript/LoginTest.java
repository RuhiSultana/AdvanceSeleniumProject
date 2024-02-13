package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import PomScript.WelcomePage;

public class LoginTest extends BaseClass{
	@Test(dataProvider = "credential")
	public void login(String email,String password) {
		PomScript.WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();;
		Reporter.log("Login Link Clicked",true);
		
		PomScript.LoginPage l = new PomScript.LoginPage(driver);
		l.getEmailID().sendKeys(email);
		l.getPassword().sendKeys(password);
		l.getLoginButton().click();
		Reporter.log("Successfully Login",true);
			
	}
	
	/*@DataProvider(name = "credential")
	public Object[][] fetchData() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet2");	
		}*/		

}
