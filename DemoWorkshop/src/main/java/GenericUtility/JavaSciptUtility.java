package GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaSciptUtility extends WebDriverUtility{
	/**
	 * This method is used to scroll the web page according to the current X axis and Y axis
	 * @param xAxis
	 * @param yAxis
	 */
	public void scroll_By(int xAxis, int yAxis) {
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xAxis+","+yAxis+")");
		
	}
	/**
	 * This method is used to scroll the web page according to X and Y axis
	 * @param xAxis
	 * @param yAxis
	 */
	public void scroll_To(int xAxis, int yAxis) {
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo("+xAxis+","+yAxis+")");
		
	}
	/**
	 * This method is used to scroll the web page until the element is Visible
	 * @param index
	 * @param b
	 * @param element
	 */
	public void scroll_in_to_View(int index, Boolean b, WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments["+index+"].scrollIntoView("+b+");",element);
		
	}
	/**
	 * This method is used to click the disable element
	 * @param element
	 */
	public void clickDisable(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		
	}

}
