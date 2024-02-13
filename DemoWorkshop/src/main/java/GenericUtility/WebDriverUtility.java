package GenericUtility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author gblas
 *
 */
public class WebDriverUtility {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;
	public static Properties p;
	/**
	 * this method is for url
	 * @param url
	 */
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	/**
	 * This method is to Get the Current URL
	 * @return
	 */
	public static String currentUrl() {
		return driver.getCurrentUrl();		
	}
	/**
	 * This method is to get the Source code
	 * @return
	 */
	public static String pageSource() {
		return driver.getPageSource();		
	}
	/**
	 * This method is to get the Title of webpage
	 * @return
	 */
	public static String title() {
		return driver.getTitle();		
	}
	/**
	 * This method is to get Current window
	 * @return
	 */
	public static String currentWindow() {
		return driver.getWindowHandle();	
	}
	/**
	 * This method is to get all the window info
	 * @return
	 */
	public static Set<String> allWindows() {
		return driver.getWindowHandles();	
	}
	/**
	 * This method is to Maximize the window
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitWait() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}
	/**
	 * This method is to Navigate forward(next window)
	 */
	public static void forward() {
		driver.navigate().forward();
	}
	/**
	 * This method is to Navigate backward(prev window)
	 */
	public static void backword() {
		driver.navigate().back();
	}
	/**
	 * This method is to Refresh the window
	 */
	public static void refresh() {
		driver.navigate().refresh();
	}
	/**
	 * This method is to navigate into the web page without get method
	 * 
	 * @param url
	 */
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}
	/**
	 * This method is to close the all the windows
	 */
	public static void closeWindow() {
		driver.close();
	}
	/**
	 * This method is to close the current window
	 */
	public static void quitWindow() {
		driver.quit();
	}
	public static void explicitWait(WebElement element) {
		wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
//SELECT CLASS
	/**
	 * This method is used to select the option from dropdown by using index value
	 * @param index
	 * @param element
	 */
	public static void dropDown(int index, WebElement element) {
		s = new Select(element);
		s.selectByIndex(index);
		
	}
	/**
	 * This method is used to select the option from drop down by using Attribute value
	 * @param value
	 * @param element
	 */
	public static void dropDown(String value, WebElement element) {
		s = new Select(element);
		s.selectByValue(value);	
	}
	/**
	 * This method is used to select the option from drop down by using text function
	 * @param element
	 * @param visibleText
	 */
	public static void dropDown(WebElement element, String visibleText) {
		s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
//ACTION CLASS
	/**
	 * This method is used to move the cursor to the targeted Web element
	 * @param element
	 */
	public static void moveCursor(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * This method is used to perform right click to the targeted Web element
	 * @param element
	 */
	public static void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * This method is used to perform double click to the targeted Web element
	 * @param element
	 */
	public static void doubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	/**
	 * This method is used to drag the source element and place it into the destination
	 * @param source
	 * @param destination
	 */
	public static void dragAndDrop(WebElement source, WebElement destination) {
		a = new Actions(driver);
		a.dragAndDrop(source, destination).perform();
	}
	/**
	 * This method is used to click anywhere in the web page ( wherever we want)
	 * @param element
	 */
	public static void clickElement(WebElement element) {
		a = new Actions(driver);
		a.click(element).perform();
	}
	
	

}
