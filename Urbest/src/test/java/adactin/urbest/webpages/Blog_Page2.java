package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

public class Blog_Page2 extends BaseClass{
	String s;
	String pgno;
	public Blog_Page2() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText="All You Ever Wanted To Know")
	WebElement article1;

	@FindBy(xpath="//div[1]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article1rc;

	@FindBy(partialLinkText="What Is Judgement?")
	WebElement article2;

	@FindBy(xpath="//div[2]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article2rc;

	@FindBy(partialLinkText="Are You Ready………")
	WebElement article3;

	@FindBy(xpath="//div[@safeclass~'\\bcategory-blog-2\\b.*\\bcategory-news\\b.*\\bformat-standard\\b.*\\bhentry\\b.*\\bpost\\b.*\\bstatus-publish\\b.*\\btype-post\\b']/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article3rc;

	@FindBy(partialLinkText="Hard To Focus")
	WebElement article4;

	@FindBy(xpath="//div[@safeclass~'\\bcategory-blog-2\\b.*\\bcategory-news\\b.*\\bformat-gallery\\b.*\\bhentry\\b.*\\bpost\\b.*\\bpost_format-post-format-gallery\\b.*\\bstatus-publish\\b.*\\btype-post\\b']/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article4rc;

	@FindBy(partialLinkText="Open Yourself To Be The Best.")
	WebElement article5;

	@FindBy(xpath="//div[5]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article5rc;

	@FindBy(partialLinkText="I Know, You Know You Can Do It")
	WebElement article6;

	@FindBy(xpath="//div[6]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article6rc;

	@FindBy(partialLinkText="NLP & Unconscious Mind")
	WebElement article7;

	@FindBy(xpath="//div[7]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article7rc; 

	@FindBy(partialLinkText="Evaluate Yourself")
	WebElement article8;

	@FindBy(xpath="//div[8]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article8rc;

	@FindBy(partialLinkText="Remove Conflicts")
	WebElement article9;

	@FindBy(xpath="//div[9]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article9rc;

	@FindBy(partialLinkText="Passion For Greatness")
	WebElement article10;

	@FindBy(xpath="//div[10]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article10rc;


	@FindBy(linkText="1")
	WebElement firstpage;

	@FindBy(linkText="3")
	WebElement thirdpage;

	@FindBy(linkText="4")
	WebElement fourthpage;

	@FindBy(xpath="//a[@class='next page-numbers']")
	WebElement nextpage;
	
	@FindBy(xpath="//a[@class='prev page-numbers']")
	WebElement prevpage;

	/**
	 * Method to click on an article link
	 * @param i Row number where the article name is written
	 * @throws Exception
	 */
	public void clickonarticle(int i) throws Exception
	{
		s=ExcelUtil.getCellData(i, 5);
		pgno=ExcelUtil.getCellData(i, 6);
		if(pgno=="2")
		{
			try{
				if(s.equalsIgnoreCase("All You Ever Wanted To Know"))

					article1.click();
				if(s.equalsIgnoreCase("What Is Judgement?"))
					article2.click();
				if(s.equalsIgnoreCase("Are You Ready………"))
					article3.click();
				if(s.equalsIgnoreCase("Hard To Focus"))
					article4.click();
				if(s.equalsIgnoreCase("Open Yourself To Be The Best."))
					article5.click();
				if(s.equalsIgnoreCase("I Know, You Know You Can Do It"))
					article6.click();
				if(s.equalsIgnoreCase("NLP & Unconscious Mind"))
					article7rc.click();
				if(s.equalsIgnoreCase("Evaluate Yourself"))
					article8.click();
				if(s.equalsIgnoreCase("Remove Conflicts"))
					article9.click();
				if(s.equalsIgnoreCase("Passion For Greatness"))
					article10.click();
				else if(s.isEmpty())
					Log.error("Sorry empty argument");
				Log.info("The article is clicked");
			}
			catch(Exception e)
			{
				Log.error("The article cannot be clicked");
			}
		}
		else
			Log.error("Sorry wrong redirection to the page");
	}


	/**
	 * Method to click on the reading continue button for each of the article
	 * @param i Row number where the article name is written
	 * @throws Exception
	 */
	public void clickonrc(int i) throws Exception
	{
		s=ExcelUtil.getCellData(i, 6);
		pgno=ExcelUtil.getCellData(i, 6);
		if(pgno=="2")
		{

			try{
				if(s.equalsIgnoreCase("All You Ever Wanted To Know"))

					article1rc.click();
				if(s.equalsIgnoreCase("What Is Judgement?"))
					article2rc.click();
				if(s.equalsIgnoreCase("Are You Ready………"))
					article3rc.click();
				if(s.equalsIgnoreCase("Hard To Focus"))
					article4rc.click();
				if(s.equalsIgnoreCase("Open Yourself To Be The Best."))
					article5rc.click();
				if(s.equalsIgnoreCase("I Know, You Know You Can Do It"))
					article6rc.click();
				if(s.equalsIgnoreCase("NLP & Unconscious Mind"))
					article7rc.click();
				if(s.equalsIgnoreCase("Evaluate Yourself"))
					article8rc.click();
				if(s.equalsIgnoreCase("Remove Conflicts"))
					article9rc.click();
				if(s.equalsIgnoreCase("Passion For Greatness"))
					article10rc.click();
				else if(s.isEmpty())
					Log.error("Sorry not able to identify the string");;

					Log.info("The article reading continue button is found and clicked upon");
			}
			catch(Exception e)
			{
				Log.error("No such article found");
			}
		}
		else
			Log.error("Sorry wrong page number");

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

	public void navigatetoprevpage()
	{
		try{
			prevpage.click();
			Log.info("The prev button is clicked");
		}
		catch(Exception e)
		{
			Log.error("The prev button cannot be clicked");
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
		pgno=ExcelUtil.getCellData(i, 6);
		if(pgno=="2")
		{
			try{
				if(s.equalsIgnoreCase("1"))
					firstpage.click();
				if(s.equalsIgnoreCase("3"))
					thirdpage.click();
				if(s.equalsIgnoreCase("4"))
					fourthpage.click();

				Log.info("The page is found and clicked on");
			}
			catch(Exception e)
			{
				Log.error("Wrong redirection to the page");
			}
		}
	}

}

