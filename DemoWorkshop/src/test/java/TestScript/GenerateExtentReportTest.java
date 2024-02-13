package TestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateExtentReportTest {
	@Test
	public void testCase() {
//Step1
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\gblas\\eclipse-workspace\\DemoWorkshop\\ExtentReport\\Report.html");
//Step2
		ExtentReports er = new ExtentReports();
//Step3
		er.attachReporter(esr);
//Step4
		ExtentTest et = er.createTest("GenerateExtentReportTest");
//Step5
		et.log(Status.INFO,"Test Case Successfully Attaches with the Report");
//Step6
		er.flush();
	}

}
