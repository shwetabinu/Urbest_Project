package adactin.urbest.webpages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.Common_Util;

/**
 * Login class inherits all the properties of the Base class.
 * Initially the Login Page is initialized. 
 * Methods are present to enter the user details into the login page, and to click on login.
 * Method is present to validate the page title and the page heading.
 * Methods are also present to validate the Forgot password link and the Remember password link in the login page.
 *
 */
public class Login_Page extends BaseClass{
	
	/**
	 * The Login link
	 */
	@FindBy(linkText="Login")
	WebElement login;
	
	/**
	 * The heading of Login Page
	 */
	@FindBy(xpath="//span[contains(text(),'login and register')]")
	WebElement pageHeading;
	
	/**
	 * The textbox to enter the username
	 */
	@FindBy(name="log")
	WebElement username;
	
	/**
	 * The textbox to enter the password
	 */
	@FindBy(name="pwd") 
	WebElement password;
	
	/**
	 * The "Remember password "checkbox
	 */
	@FindBy(name="rempass")
	WebElement remember;
	
	
	/**
	 * The Forgot password weblink
	 */
	@FindBy(className="forgot")
	WebElement forgotPwd;
	
	/**
	 * The submit button
	 */
	@FindBy(css="button[type='submit']")
	WebElement submit;

	//private static WebDriver driver=null;
	
	/**
	 * Constructor to initialize the Login page and the load the driver
	 * @throws IOException
	 */
	public Login_Page() throws IOException
	{		
		PageFactory.initElements(driver, this);
	}
	
	/**Method to enter the user details of the user in the Username and Password textbox.
	 * This method reads the username and password from the properties file.
	 * Further the Username and password is entered into the Login page.
	 * @throws IOException
	 */
	
	public void enteruserdetails() throws IOException
	{	String userid=Common_Util.getProperties("Usercredentials", "UserName");
		String passw=Common_Util.getProperties("Usercredentials", "Password");
		username.sendKeys(userid);
		password.sendKeys(passw);
	}
	
	/**
	 * Method is used to click on the Submit link, so that the user can login successfully
	 */
	public void signin()
	{
		submit.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	/**
	 * The method prints the page Heading when the Login page is loaded.
	 */
	public void validatePageHeading()
	{
		
		System.out.println("page title is : " +pageHeading);
	}
	
	/**
	 * The method is used to validate the Page title of the Login page.
	 */
	public void validatePageTitle()
	{
		String acttitle=driver.getTitle();
		
	}
	
	/**
	 * The method performs click action on the "Remember password" checkbox
	 */
	public void validateCheckBox()
	{
		remember.click();
	}
	
	/**
	 * This method is used to click on the "Forgot Password" link.
	 * It displays the message that the forgot password link is available and functional if the user can click on it.
	 */
	public void validateForgotPWD()
	{
		forgotPwd.click();
		Assert.assertEquals(true, "Forgot Password Link Available and functional");
	}
	
}
