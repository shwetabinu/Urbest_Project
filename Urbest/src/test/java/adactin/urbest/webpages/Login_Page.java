package adactin.urbest.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	private static WebDriver driver=null;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enteruserdetails(String user_id,String pw)
	{
		driver.findElement(By.name("log")).sendKeys(user_id);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		
	}
	public void signin()
	{
		WebElement SignOn = driver.findElement(By.xpath("//*[@id=\"loginfom\"]/div[4]/button"));
		SignOn.click();
	}
}
