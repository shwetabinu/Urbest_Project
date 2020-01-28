package adactin.urbest.testrunner;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import adactin.urbest.util.Browser_Factory;
import adactin.urbest.util.Common_Util;
import adactin.urbest.webpages.Home_Page;
import adactin.urbest.webpages.Login_Page;


public class Verify_Login{
	public static WebDriver driver=null;
	//Method to open browser and load the url for urbest. This needs to be executed before every test
	@BeforeTest
	public static void Prior_to_Signon() throws IOException
	
		{
			FileInputStream fis=new FileInputStream("/Users/aswinvijayan/git/Urbest_Project/Urbest/Testdata/config.properties");
			Properties P=new Properties();
			P.load(fis);
			String bname=P.getProperty("browser_name");
			driver=Browser_Factory.getBrowser(bname);
			String url=P.getProperty("url");
			Browser_Factory.openurl(url);
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/section/div/div/a/i")).click();
	 }
	
	//Method to login to the urbest application
	@Test(priority=1)
	public static void Verify_Sign_On() throws IOException
			
	{	    
			Home_Page hp=PageFactory.initElements(driver, Home_Page.class);
			hp.clickonlogin();
			String userid=Common_Util.getProperties("Usercredentials", "UserName");
			String passw=Common_Util.getProperties("Usercredentials", "Password");
			Login_Page lp=PageFactory.initElements(driver, Login_Page.class);
			lp.enteruserdetails(userid, passw);
			lp.signin();
			}
			
	
			

	@AfterTest
	public static void Close_Browser()
	{
		driver.close();
	}
}

