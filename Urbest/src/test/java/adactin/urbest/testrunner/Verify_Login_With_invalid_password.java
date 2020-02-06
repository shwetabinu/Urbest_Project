package adactin.urbest.testrunner;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import adactin.urbest.base.BaseClass;
import adactin.urbest.webpages.Dashboard;
import adactin.urbest.webpages.Home_Page;
import adactin.urbest.webpages.Login_Page;

public class Verify_Login_With_invalid_password extends BaseClass {
	static Dashboard db;
	static Home_Page hp1;
	static Login_Page lp;
	
	public Verify_Login_With_invalid_password() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Initializes the browser and loads the websire url
	 * @throws IOException
	 */
	@BeforeTest
	public void Prior_to_Signon() throws IOException
	
		{
		initBrowser();
		db=new Dashboard();
		
		 
	 }
	
	/**
	 * Verifies if the Sign-on functionality is working when valid username and password is given and submitted. It verifies the following actions:
	 * Clicks on Login, enter the user details and click on submit
	 * Verifies if the link at the top has changed to "Logout" 
	 * @throws IOException
	 */
	
	//Method to login to the urbest application to view the home page
	@Test(priority=1)
	public static void Verify_Sign_On_With_Invalid_Password() throws IOException
			
	{ String erm;
	String aem;
	
		//Clicking on close popup button on the home page
		db.closepopup();
		//clicking on login button 
		db.clickonlogin();
		lp=new Login_Page();
		//Entering the user details in the Login page
		lp.enteruserdetails();
		//Clicking on sign in to login to the application
		lp.signin();
		erm=lp.getalertmessage();	
		aem=lp.getactualalertmessage();
		Assert.assertEquals(erm, aem);
		
		/*String text=hp1.verifyifloggedin();
		Assert.assertEquals(text, "LOGOUT");*/
		
		
	
	}
	
	/**
	 * 
	 */

	@AfterTest
	public static void Close_Browser()
	{
		driver.close();
	}
}




