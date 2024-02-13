package TestScript;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class Sample1Test extends BaseClass{
	public class SampleTest {
		@Test
		/*public void testCase() {
		 * driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			Reporter.log("Sample Test1 executed",true);
		}*/
		public void testCase() {
			Reporter.log("Sample Test1 executed",true);
		}
		
	}
}
