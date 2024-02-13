package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstName;
	
	@FindBy(id = "BillingNewAddress_LastName")
    private WebElement lastName;
    
    @FindBy(id = "BillingNewAddress_Email")
    private WebElement emailID;
    
    @FindBy(id = "BillingNewAddress_Company")
    private WebElement company;
    
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']/child::option[@value='41']")
    private WebElement country;
    
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    private WebElement state;
    
    @FindBy(id = "BillingNewAddress_City")
    private WebElement city;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement address1;

    @FindBy(id = "BillingNewAddress_Address2")
    private WebElement address2;
    
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement PinCode;
    
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneNumber;
    
    @FindBy(id = "BillingNewAddress_FaxNumber")
    private WebElement faxNumber;
    
    @FindBy(xpath = "//div[@ id='billing-buttons-container']/child::input[@value='Continue']")
    private WebElement continuebutton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailID() {
		return emailID;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getPinCode() {
		return PinCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getFaxNumber() {
		return faxNumber;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

}
