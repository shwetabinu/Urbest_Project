package adactin.urbest.webpages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

/**
 * Blog Page1 class identifies all the elements in the first page of Blog.
 * It extends Base Class.
 * It identifies all the web elements in the first page of Blog.
 * It has methods to perform action on these identified WebElements
 * 
 *
 */
public class Blog_Page1 extends BaseClass{
	
	String s;
	
	/**
	 * Constructor to initialize the Blog page with the driver
	 * @throws IOException
	 */
	public Blog_Page1() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(partialLinkText="Holistic Life Coachi")
	WebElement article1;
	
	@FindBy(xpath="//div[1]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article1rc;
	
	@FindBy(partialLinkText="Let Go Of All The")
	WebElement article2;
	
	@FindBy(xpath="//div[2]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article2rc;
	
	@FindBy(partialLinkText="Do You Know Where You Going")
	WebElement article3;
	
	@FindBy(xpath="//div[@safeclass~'\\bcategory-blog-2\\b.*\\bcategory-news\\b.*\\bformat-standard\\b.*\\bhentry\\b.*\\bpost\\b.*\\bstatus-publish\\b.*\\btype-post\\b']/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article3rc;
	
	@FindBy(partialLinkText="Life Coach And Mentor")
	WebElement article4;
	
	@FindBy(xpath="//div[@safeclass~'\\bcategory-blog-2\\b.*\\bcategory-news\\b.*\\bformat-gallery\\b.*\\bhentry\\b.*\\bpost\\b.*\\bpost_format-post-format-gallery\\b.*\\bstatus-publish\\b.*\\btype-post\\b']/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article4rc;
	
	@FindBy(partialLinkText="Your Strengths And Weakness")
	WebElement article5;
	 
	@FindBy(xpath="//div[5]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article5rc;
	
	@FindBy(partialLinkText="You Ready For The Future")
	WebElement article6;

	@FindBy(xpath="//div[6]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article6rc;
	
	@FindBy(xpath="//div[7]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article7rc; 
	
	@FindBy(partialLinkText="Personal Breakthrough")
	WebElement article8;
	
	@FindBy(xpath="//div[8]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article8rc;
	
	@FindBy(partialLinkText="You Remember A Time?")
	WebElement article9;
	
	@FindBy(xpath="//div[9]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article9rc;
	
	@FindBy(xpath="//div[10]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article10rc;
	
	
	@FindBy(linkText="2")
	WebElement secondpage;
	
	@FindBy(linkText="3")
	WebElement thirdpage;
	
	@FindBy(linkText="4")
	WebElement fourthpage;
	
	@FindBy(xpath="//a[@class='next page-numbers']")
	WebElement nextpage;
	
	/**
	 * Method to click on an article link
	 * @param i Row number where the article name is written
	 * @throws Exception
	 */
	public void clickonarticle(int i) throws Exception
	{
		s=ExcelUtil.getCellData(i, 5);
		
		try{
			if(s.equalsIgnoreCase("Holistic Life Coaching By Dr. Sharon Haasbroek"))
		
			article1.click();
		if(s.equalsIgnoreCase("Let Go Of All The Negative Beliefs – With Miriam..."))
			article2.click();
		if(s.equalsIgnoreCase("Do You Know Where You Going"))
			article3.click();
		if(s.equalsIgnoreCase("Life Coach And Mentor"))
			article4.click();
		if(s.equalsIgnoreCase("Understand Your Strengths And Weakness"))
			article5.click();
		if(s.equalsIgnoreCase("Are You Ready For The Future"))
			article6.click();
		if(s.equalsIgnoreCase("Key of Life"))
			article7rc.click();
		if(s.equalsIgnoreCase("Personal Breakthrough"))
			article8.click();
		if(s.equalsIgnoreCase("Can You Remember A Time?"))
			article9.click();
		else if(s.isEmpty())
			article10rc.click();
		Log.info("The article is clicked");
		}
		catch(Exception e)
		{
			Log.error("The article cannot be clicked");
		}
	}
	
	/**
	 * Method to click on the reading continue button for each of the article
	 * @param i Row number where the article name is written
	 * @throws Exception
	 */
	public void clickonrc(int i) throws Exception
	{
		s=ExcelUtil.getCellData(i, 6);
		
		try{
			if(s.equalsIgnoreCase("Holistic Life Coaching By Dr. Sharon Haasbroek"))
		
			article1rc.click();
		if(s.equalsIgnoreCase("Let Go Of All The Negative Beliefs – With Miriam..."))
			article2rc.click();
		if(s.equalsIgnoreCase("Do You Know Where You Going"))
			article3rc.click();
		if(s.equalsIgnoreCase("Life Coach And Mentor"))
			article4rc.click();
		if(s.equalsIgnoreCase("Understand Your Strengths And Weakness"))
			article5rc.click();
		if(s.equalsIgnoreCase("Are You Ready For The Future"))
			article6rc.click();
		if(s.equalsIgnoreCase("Key of Life"))
			article7rc.click();
		if(s.equalsIgnoreCase("Personal Breakthrough"))
			article8rc.click();
		if(s.equalsIgnoreCase("Can You Remember A Time?"))
			article9rc.click();
		else if(s.isEmpty())
			article10rc.click();
		
		Log.info("The article reading continue button is found and clicked upon");
		}
		catch(Exception e)
		{
			Log.error("No such article found");
		}
		
	}
	
	/**
	 * Method to navigate to the next page
	 */
	public void navigatetonextpage()
	{
		try{
			nextpage.click();
			Log.info("The next button is clicked");
		}
		catch(Exception e)
		{
			Log.error("The next button cannot be clicked");
		}
		
	}
	
	/**
	 * Method to navigate to the nth page depending on the input
	 * @param i Row number where the test case is written
	 * @throws Exception
	 */
	public void navigate_to_nthpage(int i) throws Exception
	{
		s=ExcelUtil.getCellData(i, 6);
		try{
			if(s.equalsIgnoreCase("2"))
			secondpage.click();
			if(s.equalsIgnoreCase("3"))
			thirdpage.click();
			if(s.equalsIgnoreCase("4"))
			fourthpage.click();
			
			Log.info("The page is found and clicked on");
		}
		catch(Exception e)
		{
			Log.error("Invalid page number");
		}
	}
	
}
