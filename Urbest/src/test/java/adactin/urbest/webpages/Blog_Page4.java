package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

public class Blog_Page4 extends BaseClass{
	String s,pgno;
	public Blog_Page4() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Do I Need A Life Coach?")
	WebElement article1;

	@FindBy(xpath="//div[1]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article1rc;

	@FindBy(partialLinkText="How To Create A Personal Growth Plan")
	WebElement article2;

	@FindBy(xpath="//div[2]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article2rc;

	@FindBy(partialLinkText="How Can I Establish Joyful Habits?")
	WebElement article3;

	@FindBy(xpath="//div[@safeclass~'\\bcategory-blog-2\\b.*\\bcategory-news\\b.*\\bformat-standard\\b.*\\bhentry\\b.*\\bpost\\b.*\\bstatus-publish\\b.*\\btype-post\\b']/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article3rc;

	


	@FindBy(linkText="1")
	WebElement firstpage;

	@FindBy(linkText="2")
	WebElement secondpage;

	@FindBy(linkText="3")
	WebElement thirdpage;

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
		if(pgno=="3")
		{
			try{
				if(s.equalsIgnoreCase("Do I Need A Life Coach?"))

					article1.click();
				if(s.equalsIgnoreCase("How To Create A Personal Growth Plan"))
					article2.click();
				if(s.equalsIgnoreCase("How Can I Establish Joyful Habits?"))
					article3.click();
				
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
		if(pgno=="3")
		{

			try{
				if(s.equalsIgnoreCase("Do I Need A Life Coach?"))

					article1rc.click();
				if(s.equalsIgnoreCase("How To Create A Personal Growth Plan"))
					article2rc.click();
				if(s.equalsIgnoreCase("How Can I Establish Joyful Habits?"))
					article3rc.click();
				
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
		if(pgno=="3")
		{
			try{
				if(s.equalsIgnoreCase("1"))
					firstpage.click();
				if(s.equalsIgnoreCase("2"))
					secondpage.click();
				if(s.equalsIgnoreCase("3"))
					thirdpage.click();

				Log.info("The page is found and clicked on");
			}
			catch(Exception e)
			{
				Log.error("Wrong redirection to the page");
			}
		}
	}

}
	


