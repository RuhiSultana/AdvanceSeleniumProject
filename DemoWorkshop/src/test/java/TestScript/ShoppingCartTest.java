package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import PomScript.CheckOutPage;
import PomScript.DigitalDownloadPage;
import PomScript.ShoppingCartPage;
import PomScript.WelcomePage;
import PomScript.ShoppingCartPage;

public class ShoppingCartTest extends BaseClass{
	
	@Test(priority = 1, dataProvider = "credential")
	public void logIn(String email,String password) {
		PomScript.WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();;
		Reporter.log("Login Link Clicked",true);
		
		PomScript.LoginPage l = new PomScript.LoginPage(driver);
		l.getEmailID().sendKeys(email);
		l.getPassword().sendKeys(password);
		l.getLoginButton().click();
		Reporter.log("Successfully Login",true);
			
	}
	@DataProvider(name = "credential")
	public Object[][] fetchLoginData() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet2");
			
	}
	
//Navigated to shippingCart
	@Test(priority = 2)
	public void addtocart() {
		PomScript.WelcomePage w = new WelcomePage(driver);
		w.getDigitaldownloadLink().click();
		
		DigitalDownloadPage d = new DigitalDownloadPage(driver);
		d.getBook1().click();
		Reporter.log("book1 added to Cart",true);				
}
	
	@Test(priority = 3)
	public void checkCart() {
		PomScript.WelcomePage w = new WelcomePage(driver);
		w.getShopCartLink().click();
		ShoppingCartPage s = new ShoppingCartPage(driver);
		s.getTermsAndCondition().click();
		s.getCheckout().click();
		Reporter.log("Proceed to Cart", true);
	}
	
	@Test(priority = 4, dataProvider = "credCheck")
	public void checkOut(String company, String city,String add1,String add2,String zipCode,String phNo,String faxNo) {
		CheckOutPage c = new CheckOutPage(driver);
		//c.getContinuebutton().click();
		//c.getCompany().sendKeys(country);
		c.getCountry().click();
		c.getCity().sendKeys(city);
		c.getAddress1().sendKeys(add1);
		c.getAddress2().sendKeys(add2);
		c.getPinCode().sendKeys(zipCode);
		c.getPhoneNumber().sendKeys(phNo);
		c.getFaxNumber().sendKeys(faxNo);
		c.getContinuebutton().click();
		Reporter.log("successfully Checked out", true);
	}
	@DataProvider(name = "credCheck")
	public Object[][] fetchCheckOutData() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet3");
			
	}
}
