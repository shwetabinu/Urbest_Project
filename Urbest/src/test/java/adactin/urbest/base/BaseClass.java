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
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import adactin.urbest.util.UtilityClass;




public class BaseClass 
{
	public WebDriver driver;
	public Properties prop;
	Logger logger;
	
	public BaseClass() throws IOException
	{
		logger.info("invoking baseclass constructor");
		try {
			prop = new Properties();
			//FIS throws FileNotFoundException
			FileInputStream ip = new FileInputStream("/Users/Rani/URBestWebsiteAutomation/URBest/src/com/urbest/config/config.properties");
			prop.load(ip);// throws IOException
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initBrowser()
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		String brwName = prop.getProperty("browser_name");
		if(brwName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/Rani/selenium/Seleniumjars/chromedriver");
			logger.info("lauching chrome driver");
			driver = new ChromeDriver(options);
		}
		else if(brwName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/Rani/selenium/Seleniumjars/geckodriver");
			logger.info("launching firefox driver");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);//calling from utility class
		driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLCIT_WAIT, TimeUnit.SECONDS);
		logger.info("launching adactin hotel web page in chrome browser");;
		driver.get(prop.getProperty("url"));
	}
}
