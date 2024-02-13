package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadPage extends BasePage{
	public DigitalDownloadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
    private WebElement book1;
	
	@FindBy(xpath = "//div[@class='product-grid']/descendant::input[2]")
    private WebElement book2;
	
	@FindBy(xpath = "//div[@class='product-grid']/descendant::input[3]")
    private WebElement book3;

	public WebElement getBook1() {
		return book1;
	}

	public WebElement getBook2() {
		return book2;
	}

	public WebElement getBook3() {
		return book3;
	}
}
