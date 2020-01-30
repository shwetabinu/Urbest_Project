package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_Page {

	private static WebDriver driver=null;
	public void Login() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(xpath="//span[contains(text(),'login and register')]")
	WebElement pageHeading;
	
	@FindBy(name="log")
	WebElement username;
	
	@FindBy(name="pwd") 
	WebElement password;
	
	@FindBy(name="rempass")
	WebElement remember;
	
	@FindBy(className="forgot")
	WebElement forgotPwd;
	
	@FindBy(xpath="//button[contains(text(),'Login Now')]")
	WebElement submit;
	
	public void enteruserdetails(String user_id,String pw)
	{
		username.sendKeys(user_id);
		password.sendKeys(pw);
		
	}
	public void signin()
	{
		login.click();
	}
	
	public void validatePageHeading()
	{
		
		System.out.println("page title is : " +pageHeading);
	}
	
	public void validatePageTitle()
	{
		String acttitle=driver.getTitle();
		
	}
	
	
	public void validateCheckBox()
	{
		remember.click();
	}
	public void validateForgotPWD()
	{
		forgotPwd.click();
		Assert.assertEquals(true, "Forgot Password Link Available and functional");
	}
	
}
