//testng smoketests
//java docs
//util for webdriver
//testscript jira id
//waits for page load
//screen validations on the page throw error
//test for verification

package adactin.urbest.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import adactin.urbest.util.Log;

import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.UtilityClass;

/** Class to 
 * Loads the configuration properties into a properties file
 * Sets the Chrome options, disables notifications in chrome
 * Reads the Browser name and Browser mode from the Test Data file
 * Opens the specified browser (Chrome, Firefox or Opera) in the specified mode
 * Opens a fresh window of the browser, maximizes the screen, deletes all cookies
 * Waits for the Page Load timeout time and again waits for the implicit wait period
 * Opens the url for urbest website
 * 
 * @author aswinvijayan
 *
 */


public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;
	public static final String testDataExcelFileName="testdata.xlsx";
	//static final Logger logger=Logger.getLogger(Log.class.getName());

	public BaseClass() throws IOException
	{
		Log.info("invoking baseclass constructor");
		/*try {
			prop = new Properties();
			//FIS throws FileNotFoundException
			FileInputStream ip = new FileInputStream("/Users/aswinvijayan/git/Urbest_Project/Urbest/Testdata/config.properties");
			prop.load(ip);// throws IOException
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}*/
	}

	/**
	 * Sets the Chrome options, disables notifications in chrome
	 * Reads the Browser name and Browser mode from the Test Data file
	 * Opens the specified browser (Chrome, Firefox or Opera) in the specified mode
	 * Opens a fresh window of the browser, maximizes the screen, deletes all cookies
	 * Waits for the Page Load timeout time and again waits for the implicit wait period
	 * Opens the url
	 * @throws Exception 
	 */

	public static void initBrowser(int i) throws Exception
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//TestDataReader td=new TestDataReader();
		String brwName=ExcelUtil.getCellData(i,3);
		String brwmode=ExcelUtil.getCellData(i,4);
		String url=ExcelUtil.getCellData(1,7);
		
		
		//String brwName = prop.getProperty("browser_name");
		//String brwmode=prop.getProperty("mode");
		//BrowserFactory(brwName, brwmode,options);
		//}


		//	public void BrowserFactory(String brwName,String brwmode,ChromeOptions options)
		//{
		if (brwmode.equalsIgnoreCase("local"))
		{	if(brwName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/aswinvijayan/git/Urbest_Project/Urbest/All_browser_exes/chromedriver");
			Log.info("lauching chrome driver");
			driver = new ChromeDriver(options);
		}
		else if(brwName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/aswinvijayan/git/Urbest_Project/Urbest/All_browser_exes/geckodriver");
			Log.info("launching firefox driver");
			driver = new FirefoxDriver();
		}
		else if (brwName.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "/Users/aswinvijayan/git/Urbest_Project/Urbest/All_browser_exes/geckodriver");
			Log.info("launching opera driver");
			driver = new OperaDriver();
		}
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);//calling from utility class
		driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLCIT_WAIT, TimeUnit.SECONDS);
		Log.info("Launching adactin hotel web page in chrome browser");;
		driver.get(url);
		//}
	}
}
