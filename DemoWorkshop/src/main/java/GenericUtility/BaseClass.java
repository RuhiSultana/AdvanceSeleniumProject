package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends WebDriverUtility{
	@BeforeSuite
	public void connectServer() {
		Reporter.log("Connected to the server succsessfully",true);
	}
	
	@AfterSuite
	public void disconnectServer() {
		Reporter.log("Disconnected the server succsessfully",true);
	}
	
	@BeforeTest
	public void connectDB() {
		Reporter.log("Connected to the DataBase succsessfully",true);
	}
	
	@AfterTest
	public void disconnectDB() {
		Reporter.log("Disconnected the DataBase succsessfully",true);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException {
		  driver = new ChromeDriver();
		  maximize();
		  implicitWait();
		 String url = PropertyFileUtility.propertyData("url");
		 getUrl(url);
		 Reporter.log("Launched the Browser succsessfully",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		//driver.quit();
		Reporter.log("Closed the Browser succsessfully",true);
	}
	
	@BeforeMethod
	public void login(){
		
		Reporter.log("login succsessfully",true);
	}
	
	@AfterMethod
	public void logOut() {
		
		Reporter.log("Logout succsessfully",true);
	}
}
