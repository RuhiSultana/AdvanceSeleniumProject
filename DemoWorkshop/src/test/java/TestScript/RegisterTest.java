package TestScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.IConstant;
import GenericUtility.ReadExcelUtility;
import PomScript.RegisterPage;
import PomScript.WelcomePage;

public class RegisterTest extends BaseClass{

	@Test(dataProvider = "credential")
	public void register(String fName, String lName, String email,String password, String cPassword) {
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
	@DataProvider(name = "credential")
	public Object[][] fetchData() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet2");
			
	}
}
