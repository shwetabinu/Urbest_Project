package adactin.urbest.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Class to load the url in multiple browsers and in multiple modes
 * @author aswinvijayan
 *
 */
public class Browser_Factory {

	private static WebDriver driver=null;
	
	/**
	 * Method to load the browser (Chrome, Firefox and Opera) in two modes: local and remote
	 * @param bn
	 * @return
	 */
	public static WebDriver getBrowser(String bn)
	{
		if(bn.equalsIgnoreCase("Chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "/Users/aswinvijayan/git/Urbest_Project/Urbest/All_browser_exes/chromedriver");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
				}
		else
			
			return null;
	
		return driver;
				
		
				
	}
	
	/**
	 * Method to open the url
	 * @param url
	 */
	public static void openurl(String url)
	{
		driver.get(url);
	}
}
