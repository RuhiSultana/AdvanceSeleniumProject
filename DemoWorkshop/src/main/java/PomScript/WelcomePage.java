package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{
	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//a[text()='Log out']")
	 private WebElement logoutButton;
	    
	@FindBy(linkText = "Shopping cart")
	private WebElement shopCartLink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBar;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement DigitaldownloadLink;
	
	
	public WebElement getDigitaldownloadLink1() {
		return DigitaldownloadLink;
	}
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public WebElement getSearchBar() {
		return searchBar;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getShopCartLink() {
		return shopCartLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	public WebElement getDigitaldownloadLink() {
		return DigitaldownloadLink;
	}
	

}
