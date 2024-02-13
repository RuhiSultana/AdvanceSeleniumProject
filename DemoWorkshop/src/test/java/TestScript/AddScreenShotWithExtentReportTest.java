package TestScript;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import GenericUtility.PropertyFileUtility;

public class AddScreenShotWithExtentReportTest {
	@Test
	public void openBrowser() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  String image = driver.getScreenshotAs(OutputType.BASE64);
		  
			ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\gblas\\eclipse-workspace\\DemoWorkshop\\ExtentReport\\Report.html");
			
					ExtentReports er = new ExtentReports();
			
					er.attachReporter(esr);
			
					ExtentTest et = er.createTest("AddScreenShotWithExtentReportTest");
			
					et.log(Status.INFO,"Test Case Successfully Attaches with the Report");
			
					et.addScreenCaptureFromBase64String(image);
					er.flush();
		 Reporter.log("TC executed succsessfully",true);
	}

}
