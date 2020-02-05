package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;

/**
 * The Home Page class inherits the properties of the Baseclass as it extends it.
 * The Home Page identifies the web elements in the Home page.
 * It has method to check the content of the Home Page.
 * It has method to check if the user is logged in.
 * It also has methods to navigate to other sections of the urbest website.
 * 
 *
 */
public class Home_Page extends BaseClass{
	
	/**
	 * Constructor to initialize the Home Page with the driver
	 * @throws IOException
	 */
	public Home_Page() throws IOException{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
/**
 * link to logout from the application	
 */
@FindBy(xpath="//a[contains(text(),'Logout')]")
WebElement Logout_link;
	
/**
 * Method to verify if the user is logged in
 * @return
 */
	public String verifyifloggedin()
	{
		
		return Logout_link.getText();
	}

}
