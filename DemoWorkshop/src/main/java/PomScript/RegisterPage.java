package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	  @FindBy(id = "gender-female")
	    private WebElement gender;
	    
	    @FindBy(id = "FirstName")
	    private WebElement firstName;
	    
	    @FindBy(id = "LastName")
	    private WebElement lastName;
	    
	    @FindBy(id = "Email")
	    private WebElement emailID;
	    
	    @FindBy(id = "Password")
	    private WebElement Password;
	    
	    @FindBy(id = "ConfirmPassword")
	    private WebElement confirmPassword;
	    
	    @FindBy(id = "register-button")
	    private WebElement registerButton;

		public WebElement getGender() {
			return gender;
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getEmailID() {
			return emailID;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getConfirmPassword() {
			return confirmPassword;
		}

		public WebElement getRegisterButton() {
			return registerButton;
		}
	    
	    public RegisterPage(WebDriver driver) {
	    	super(driver);
		}
	   //Business Logic
	    public void registerFunction() {
	    	firstName.sendKeys("Ruhi");
	    	lastName.sendKeys("Sultana");
	    	emailID.sendKeys("ruhiAdv12@gmail.com");
	    	Password.sendKeys("Ruhi@123");
	    	confirmPassword.sendKeys("Ruhi@123");
	    	registerButton.click();
	    	
	    }

}
