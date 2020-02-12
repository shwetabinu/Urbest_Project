package adactin.urbest.testscripts;


import java.io.FileInputStream;
import adactin.urbest.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.Browser_Factory;
import adactin.urbest.util.Common_Util;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.webpages.Dashboard;
import adactin.urbest.webpages.Home_Page;


import adactin.urbest.webpages.Login_Page;

/**
 * 
 * Testcase to verify the login functionality of the urbest application. The flow is as follows:
 * It initializes the browser. 
 * Closes the subscription pop-up.
 * Clicks on Login, enter the user details and click on submit
 * Verifies if the link at the top has changed to "Logout" 
 * 
 *
 */

public class To_verify_if_client_is_able_to_login_to_the_application extends BaseClass{

	/**
	 * Initializing @param db
	 * @param hp1
	 * @param lp
	 */
	static Dashboard db;
	static Home_Page hp1;
	static Login_Page lp;
	static int rno;

	public To_verify_if_client_is_able_to_login_to_the_application() throws IOException {
		super();
		// TODO Auto-generated constructor stub



	}

	/**
	 * Initializes the browser and loads the websire url
	 * @throws Exception 
	 */
	@BeforeTest
	public void Prior_to_Signon() throws Exception

	{ExcelUtil.setExcelFileSheet("TestCases");
	rno=ExcelUtil.readexcel("To_verify_if_client_is_able_to_login_to_the_application");
	initBrowser(rno);

	db=new Dashboard();


	}

	/**
	 * Verifies if the Sign-on functionality is working when valid username and password is given and submitted. It verifies the following actions:
	 * Clicks on Login, enter the user details and click on submit
	 * Verifies if the link at the top has changed to "Logout" 
	 * @throws Exception 
	 * @throws IOException
	 */


	@Test(priority=0)
	public static void To_verify_if_client_is_able_to_login_to_the_application() throws Exception 

	{ 
		Log.startTestCase("Verify_Sign_On_With_Valid_Credentials Test case execution started");


		db.closepopup();

		db.clickonlogin();
		try {
			lp=new Login_Page();
		} catch (IOException e) {

			Log.error("Unable to create the object of Login Page");
		}

		try {
			lp.enteruserdetails(rno);
		} catch (IOException e) {

			Log.error("Unable to enter the user details");
		}
		try {
			lp.signin();
			Log.info("Signing into the application");
		}catch(Exception e)
		{
			Log.debug("Unable to sign into the application");

		}
		try {
			hp1=new Home_Page();
		} catch (IOException e) {

			Log.error("Unable to create an object of Home Page");
		}
		String text=hp1.verifyifloggedin();
		try
		{Assert.assertEquals(text, "LOGOUT");
		}
		catch(AssertionError e)
		{
			Log.error("The Logout link is not available to logout");
		}

		Log.endTestCase("Verify_Sign_On_With_Valid_Credentials Test case execution ended");
	}

	/**
	 * Closes the browser after the execution of test	
	 */

	@AfterTest
	public static void Close_Browser()
	{
		driver.close();
	}
}

