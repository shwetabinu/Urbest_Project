package adactin.urbest.testscripts;

import java.io.IOException;

import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import adactin.urbest.base.BaseClass;
import adactin.urbest.webpages.Dashboard;
import adactin.urbest.webpages.Login_Page;

/**
 * Test case to verify if the user can reset the password when he forgets the password
 * 
 *
 */

public class To_verify_if_client_is_able_to_click_the_forgot_password_button_and_reset_the_credentials extends BaseClass{

	static Login_Page lp;
	static Dashboard db;
	static int rno;
	
	public To_verify_if_client_is_able_to_click_the_forgot_password_button_and_reset_the_credentials() throws IOException
	{
		super();
	}

	@BeforeTest
	public void Prior_to_Signon() throws Exception

	{	ExcelUtil.setExcelFileSheet("TestCases");
		rno=ExcelUtil.readexcel("To_verify_if_client_is_able_to_click_the_forgot_password_button_and_reset_the_credentials");
		initBrowser(rno);
		db=new Dashboard();

	}

	/**
	 * Reads the test data for the specified test case by reading the excel sheet
	 * The test case verifies if the user can reset the password when he forgets the password. 
	 * First the subscription popup is closed. The Login link is clicked. "Forgot Password" link is clicked
	 * @throws IOException
	 */

	@Test(priority=4)
	public static void To_verify_if_client_is_able_to_click_the_forgot_password_button_and_reset_the_credentials() 

	{ 
		//int rno;
		//rno=ExcelUtil.readexcel("To_verify_if_client_is_able_to_click_the_forgot_password_button_and_reset_the_credentials");
		
		Log.startTestCase("To_verify_if_client_is_able_to_click_the_forgot_password_button_and_reset_the_credentials Testcase execution started");
		db.closepopup();
		db.clickonlogin();
		try {
			lp=new Login_Page();
		} catch (IOException e) {
			
			Log.error("Unable to create an object of the Login Page");
		}
		
		lp.validateForgotPWD();

		Log.endTestCase("To_verify_if_client_is_able_to_click_the_forgot_password_button_and_reset_the_credentials Testcase execution ended ");
		



	}

	@AfterTest
	public static void Close_Browser()
	{
		driver.close();
	}
}
