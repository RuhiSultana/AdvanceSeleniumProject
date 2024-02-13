package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public final class LoginPage extends BasePage {
	@FindAll ({@FindBy(id = "Email"),@FindBy(name = "Email")})
    private WebElement emailID;
    
    @FindBy(id = "Password")
    private WebElement Password;
    
    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement loginButton;
   
   
    public WebElement getEmailID() {
		return emailID;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//Business Logic
	public void loginFunction() {
		emailID.sendKeys("ruhiAdv12@gmail.com");
		Password.sendKeys("Ruhi@123");
		loginButton.click();
	}

}
