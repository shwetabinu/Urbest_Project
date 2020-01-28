package adactin.urbest.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	private static WebDriver driver=null;
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickonlogin()
	{
		WebElement clickon=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div[1]/a"));
		clickon.click();
	}
}
