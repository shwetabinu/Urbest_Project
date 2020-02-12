package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;


/**
 * Class checks the article: Fear!!! Let It Go Easily And Effortlessly.
 * @author aswinvijayan
 *
 */
public class Article_Blog extends BaseClass{

	
	String s,name,mail,urlink,comment;
	public Article_Blog() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//?/a[@innertext='Home  ']")
	WebElement homelink;
	
	@FindBy(linkText="Fear")
	WebElement tag1;
	
	@FindBy(linkText="Let Go My Fear")
	WebElement tag2;
	
	@FindBy(linkText="Quick Learn")
	WebElement category1;

	@FindBy(linkText="Uncategorized")
	WebElement category2;
	
	@FindBy(xpath="//input[#'author']")
	WebElement fname;//8
	
	@FindBy(xpath="//input[#'email']")
	WebElement email;//9
	
	@FindBy(xpath="//input[#'subject']")
	WebElement url;//10
	
	@FindBy(xpath="//textarea[#'comment']")
	WebElement cmnt;//11
	
	@FindBy(xpath="//a[@class='comment-reply-link']")
	WebElement reply_link;

	@FindBy(xpath="//a[@id='cancel-comment-reply-link']")
	WebElement cancelreply;

	/**
	 * Method to click on the items in tag
	 * @param i
	 * @throws Exception 
	 */
	
	public void clickontag(int i) throws Exception
	{
		s=ExcelUtil.getCellData(i, 15);
		try
		{if(s.equalsIgnoreCase("Fear"))
			tag1.click();
		if(s.equalsIgnoreCase("Let Go my fear"))
			tag2.click();
	}
		catch(Exception e)
		{
			Log.error("Sorry couldnt find the tag link");
		}
	}
	
	/**
	 * Method to click on items in a category
	 * @param i row number
	 * @throws Exception
	 */
	
	public void clickoncategory(int i) throws Exception
	{
		s=ExcelUtil.getCellData(i, 16);
		try
		{if(s.equalsIgnoreCase("Quick Learn"))
			tag1.click();
		if(s.equalsIgnoreCase("Uncategorized"))
			tag2.click();
	}
		catch(Exception e)
		{
			Log.error("Sorry couldnt find the category link");
		}
	}
	
	/**
	 * Method to enter the user details in the comment
	 * @throws Exception 
	 */
	public void enter_userdetails_cmnt(int rno) throws Exception
	{
		name=ExcelUtil.getCellData(rno, 8);
		mail=ExcelUtil.getCellData(rno, 9);
		urlink=ExcelUtil.getCellData(rno, 10);
		
		try
		{
			fname.sendKeys(name);
			email.sendKeys(mail);
			url.sendKeys(urlink);
		}
		catch(Exception e)
		{
			Log.error("Unable to enter the details");
		}
	}
	
	public void enter_cmnt(int rno) throws Exception
	{
		comment=ExcelUtil.getCellData(rno, 11);
		try
		{
			cmnt.sendKeys(comment);
		}
		catch(Exception e)
		{
			Log.error("Unable to enter the comment text");
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
		
		//enter_cmnt(rno);
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
