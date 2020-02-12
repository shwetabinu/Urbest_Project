package adactin.urbest.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import adactin.urbest.base.BaseClass;
import adactin.urbest.webpages.Dashboard;
import adactin.urbest.webpages.Home_Page;
import adactin.urbest.webpages.Login_Page;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

public class To_verify_if_client_is_able_to_login_to_the_application_with_case_insensitive_user_name extends BaseClass {

	static Dashboard db;
	static Login_Page lp;
	static Home_Page hp1;
	static int rno;

	public To_verify_if_client_is_able_to_login_to_the_application_with_case_insensitive_user_name() throws IOException {
		super();

	}
/**
 * Reading the test case sheet to identify the test data for the specific test case
 * @throws Exception
 */
	@BeforeTest
	public void Prior_to_Signon() throws Exception

	{
		ExcelUtil.setExcelFileSheet("TestCases");
		
		/**
		 * The row where the Test Data for the Testcase is written
		 */
		rno=ExcelUtil.readexcel("To_verify_if_client_is_able_to_login_to_the_application_with_case_insensitive_user_name");
		initBrowser(rno);
		db=new Dashboard();
		


	}
	
	@Test(priority=3)
	public void To_verify_if_client_is_able_to_login_to_the_application_with_case_insensitive_user_name() throws Exception 
	{
		Log.startTestCase("To_verify_if_client_is_able_to_login_to_the_application_with_case_insensitive_user_name execution started");
		
		
		db.closepopup();
		//clicking on login button 
		db.clickonlogin();
		try {
			lp=new Login_Page();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			Log.error("The object of Login page cannot be created");
		}
		try {
			lp.enteruserdetails(rno);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			Log.error("Unable to enter the user details into the Login Page");
		}
		//Clicking on sign in to login to the application
		try {
			lp.signin();
			Log.info("Signing into the application");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			Log.error("Unable to sign into the Login Page");
		}
		
		try {
			hp1=new Home_Page();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			Log.error("Unable to create an object of Home Page");
		}
		String text=hp1.verifyifloggedin();
		try
		{Assert.assertEquals(text, "LOGOUT");
		}
		catch(AssertionError e)
		{
			Log.error("The Logout link is not available");
		}
		
		
		Log.endTestCase("To_verify_if_client_is_able_to_login_to_the_application_with_case_insensitive_user_name test case execution is over");
	}

	@AfterTest
	public static void Close_Browser()
	{
		driver.close();
		
	}

}
