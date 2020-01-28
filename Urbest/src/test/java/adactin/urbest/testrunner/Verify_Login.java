package adactin.urbest.testrunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adactin.urbest.util.Browser_Factory;
import adactin.urbest.util.Common_Util;
import adactin.urbest.webpages.Login_Page;

@Test
public class Verify_Login{
	public static WebDriver driver=null;
	public static void main(String args[]) throws IOException
			{
			FileInputStream fis=new FileInputStream("/Users/aswinvijayan/git/Urbest_Project/Urbest/Testdata/Usercredentials.properties");
			Properties P=new Properties();
			P.load(fis);
			String bname=P.getProperty("browser_name");
			driver=Browser_Factory.getBrowser(bname);
			String url=P.getProperty("url");
			Browser_Factory.openurl(url);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String userid=Common_Util.getProperties("Usercredentials", "UserName");
			String passw=Common_Util.getProperties("Usercredentials", "Password");
			Login_Page lp=PageFactory.initElements(driver, Login_Page.class);
			lp.enteruserdetails(userid, passw);
			lp.signin();
			}
			
	
			}

