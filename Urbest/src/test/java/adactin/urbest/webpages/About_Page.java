package adactin.urbest.webpages;

import java.io.IOException;

import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

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
	String cmnt,fname,em,url;
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
	WebElement urllink;

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
		try
		{driver.getTitle();
		}
		catch(Error e)
		{
			Log.error("Unable to obtain the title of the page");
		}
	}
	/**
	 * Method to leave a comment about the experience at Urbest. It reads the data from the Test Data file
	 * @throws Exception 
	 */
	public void leaveacomment(int rno) throws Exception
	{
		String cmnt,fname,em,url;
		fname=ExcelUtil.getCellData(rno,8);
		em=ExcelUtil.getCellData(rno,9);
		url=ExcelUtil.getCellData(rno, 10);
		cmnt=ExcelUtil.getCellData(rno,11);
		try {
		fullname.sendKeys(fname);
		Log.info("The first name is entered");
		email.sendKeys(em);
		Log.info("The email is entered");
		urllink.sendKeys(url);
		Log.info("The url is entered");
		comment.sendKeys(cmnt);
		Log.info("The comment is entered");
		submitbutton.click();
		Log.info("The submit button is clicked");
		}
		catch(Exception e)
		{
			Log.error("The details cannot be entered");
		}
	}

	/**
	 * Method to reply to a comment by clicking on the "Reply" button.
	 * @param rno Row where the test case is specified.
	 * @throws Exception
	 */
	public void replytoacomment(int rno) throws Exception
	{
		try{
			reply_link.click();
		
		leaveacomment(rno);
		Log.info("The reply button is clicked and the comment details are entered");
		}
		catch(Exception e)
		{
			Log.error("The reply to a comment failed");
		}
	}

	/**
	 * Method to cancel a reply
	 * @return
	 */
	public boolean cancelareply()
	{
		Boolean op;
	
			cancelreply.click();
		if(cancelreply.isDisplayed())
			{op= true;
			Log.info("A boolean value is assigned to the output of the operation");
			}
		else
			{
			op= false;
			Log.error("The cancel reply failed to work");
			}	
		return op;
		
	}

}
