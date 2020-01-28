package adactin.urbest.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Factory {

	private static WebDriver driver=null;
	public static WebDriver getBrowser(String bn)
	{
		if(bn.equalsIgnoreCase("Chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "Users/aswinvijayan/git/Urbest_Project/Urbest/All_browser_exes/chromedriver");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
				}
		else
			
			return null;
	
		return driver;
				
		
				
	}
	
	public static void openurl(String url)
	{
		driver.get(url);
	}
}
