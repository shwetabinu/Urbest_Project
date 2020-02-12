package adactin.urbest.testscripts;

import static org.testng.Assert.assertEquals;

import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import adactin.urbest.base.BaseClass;
import adactin.urbest.webpages.Dashboard;
import adactin.urbest.webpages.Home_Page;
import adactin.urbest.webpages.Login_Page;

public class To_verify_if_client_can_login_to_the_application_for_invalid_password extends BaseClass {
	static Dashboard db;
	static Home_Page hp1;
	static Login_Page lp;
	static int rno;
	public To_verify_if_client_can_login_to_the_application_for_invalid_password() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Initializes the browser and loads the websire url
	 * @throws Exception 
	 */
	@BeforeTest
	public void Prior_to_Signon() throws Exception

	{
		ExcelUtil.setExcelFileSheet("TestCases");
		rno=ExcelUtil.readexcel("To_verify_if_client_can_login_to_the_application_for_invalid_password");
		initBrowser(rno);
		db=new Dashboard();
		ExcelUtil.setExcelFileSheet("TestCases");

	}

	/**
	 * Reads the test data for the specified test case by reading the excel sheet
	 * Verifies if the Sign-on functionality is working when valid username and password is given and submitted. It verifies the following actions:
	 * Clicks on Login, enter the user details and click on submit
	 * Verifies if the link at the top has changed to "Logout" 
	 * @throws Exception 
	 * @throws IOException
	 */
	@Test(priority=2)
	public static void To_verify_if_client_can_login_to_the_application_for_invalid_password() throws Exception 

	{ String erm;
	String aem = null;
	int rno;

	rno=ExcelUtil.readexcel("To_verify_if_client_can_login_to_the_application_for_invalid_password");
	Log.startTestCase("Verify_Sign_On_With_Invalid_Password Testcase execution started");
	db.closepopup();
	db.clickonlogin();
	try {
		lp=new Login_Page();
		Log.info("Object of Login Page is created");
	} catch (IOException e) {

		Log.error("Unable to create a new object of Login Page");
	}

	try {
		lp.enteruserdetails(rno);

	} catch (IOException e) {
		Log.error("Unable to read the details from the properties file");
	}
	try {
		lp.signin();
		Log.info("Signing into the application");
	} catch (Exception e) {
		Log.error("Unable to sign into the application");
	}

	erm=lp.getexpectedalertmessage(rno);	
	Log.info("The expected alert message is"+erm);
	aem=lp.getactualalertmessageforwrongpassword();
	Log.info("The alert message obtained is"+aem);
	try
	{Assert.assertEquals(erm, aem);
	Log.info("The message is matching. Error message displayed is correct");
	}
	catch(AssertionError e)
	{
		Log.error("The messages are not the same");
	}

	Log.endTestCase("Verify_Sign_On_With_Invalid_Password Testcase execution ended");






	}

	/**
	 * Closing the browser
	 */

	@AfterTest
	public static void Close_Browser()
	{
		driver.close();
		Log.info("Closing the driver");
	}
}




