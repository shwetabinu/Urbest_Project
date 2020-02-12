package adactin.urbest.webpages;

import java.io.IOException;

import adactin.urbest.util.Log;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.Common_Util;
import adactin.urbest.util.ExcelUtil;
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
	@FindBy(xpath="//button[contains(text(),'Login Now')]")
	WebElement submit;

	//private static WebDriver driver=null;

	/**
	 * Constructor to initialize the Login page and the load the driver
	 * @throws IOException
	 */
	public Login_Page() throws IOException
	{		
		PageFactory.initElements(driver, this);
		Log.info("Initializing the Login Page");
	}

	/**Method to enter the user details of the user in the Username and Password textbox.
	 * This method reads the username and password from the properties file.
	 * Further the Username and password is entered into the Login page.
	 * @throws Exception 
	 */

	public void enteruserdetails(int i) throws Exception
	{	

		String usenameid=ExcelUtil.getCellData(i,1);

		Log.info("Username is "+usenameid);
		String passw=ExcelUtil.getCellData(i,2);
		Log.info("Password is "+passw);

		try
		{
			username.sendKeys(usenameid);
			password.sendKeys(passw);
			Log.info("The user details are entered");
		}
		catch(Exception e)
		{
			Log.error("Unable to enter the user details");
		}
	}

	/*public void enterinvaliduserdetails()
	{

	}
	 */
	/**
	 * Method is used to click on the Submit link, so that the user can login successfully
	 */
	public void signin()
	{
		/*WebDriverWait wait;
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(submit));*/
		submit.click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
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
		WebDriverWait wait;
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("forgot")));
		forgotPwd.click();
		//Assert.assertEquals(true, "Forgot Password Link Available and functional");
	}

	public String getactualalertmessageforwrongpassword()
	{


		//h2[#'swal2-title']/div[@innertext='Wrong username or password.']
		WebDriverWait wait;
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='swal2-title']//div[@class='alert alert-danger'][contains(text(),'Wrong username or password.')]")));


		String errormessage=driver.findElement(By.xpath("//h2[@id='swal2-title']//div[@class='alert alert-danger'][contains(text(),'Wrong username or password.')]")).getText();
		//alt.accept();
		return errormessage;
	}
	/*public String getactualalertmessageforcorrectpassword()
	{

		//h2[#'swal2-title']/div[@innertext='Wrong username or password.']

		String errormessage=driver.findElement(By.xpath("//h2[@id='swal2-title']//div[@class='alert alert-success'][contains(text(),'Login successful,redirecting...')]")).getText();
		//alt.accept();
		return errormessage;
	}*/


	public String getexpectedalertmessage(int r) throws Exception
	{
		String aem=ExcelUtil.getCellData(r,5);
		return aem;
	}

}
