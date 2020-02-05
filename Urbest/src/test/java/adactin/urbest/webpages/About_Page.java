package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;

/**
 * About class inherits all the properties of the base class.
 * About class identifies all the webelements in the About Page.
 * It has methods to validate the title of the webpage. 
 * It has methods to leave a comment, reply to a comment and cancel the reply to a comment. 
 * Method is also present to Check the content of the About page. 
 * 
 *
 */

public class About_Page extends BaseClass{
	
	/**
	 * Constructor to initialize the About Page
	 * @throws IOException
	 */
	public About_Page() throws IOException{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='author']")
	WebElement fullname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='subject']")
	WebElement subject;
	
	@FindBy(xpath="//textarea[@id='comment']")
	WebElement comment;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submitbutton;
	
	@FindBy(xpath="//a[@class='comment-reply-link']")
	WebElement reply_link;
	
	@FindBy(xpath="//a[@id='cancel-comment-reply-link']")
	WebElement cancelreply;
	
	/**
	 * Method to validate the title of the About page
	 */
	public void validatetitle()
	{
	driver.getTitle();
	
	}
	/**
	 * Method to leave a comment about the experience at Urbest. It reads the data from the Test Data file
	 */
	public void leaveacomment()
	{
		fullname.sendKeys("John Smith");
		email.sendKeys("abc@gmail.com");
	}
	
	
}
