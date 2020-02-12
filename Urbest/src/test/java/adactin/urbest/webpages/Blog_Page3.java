package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

public class Blog_Page3 extends BaseClass{
	String s;
	String pgno;
	
	public Blog_Page3() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Inspired By My Passion For Greatness")
	WebElement article1;

	@FindBy(xpath="//div[1]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article1rc;

	@FindBy(partialLinkText="Create The JOYFUL Future You Want With Right HABITS?")
	WebElement article2;

	@FindBy(xpath="//div[2]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article2rc;

	@FindBy(partialLinkText="Fear!!! Let It Go Easily And Effortlessly.")
	WebElement article3;

	@FindBy(xpath="//div[@safeclass~'\\bcategory-blog-2\\b.*\\bcategory-news\\b.*\\bformat-standard\\b.*\\bhentry\\b.*\\bpost\\b.*\\bstatus-publish\\b.*\\btype-post\\b']/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article3rc;

	@FindBy(partialLinkText="Hello World!")
	WebElement article4;

	@FindBy(xpath="//div[@safeclass~'\\bcategory-blog-2\\b.*\\bcategory-news\\b.*\\bformat-gallery\\b.*\\bhentry\\b.*\\bpost\\b.*\\bpost_format-post-format-gallery\\b.*\\bstatus-publish\\b.*\\btype-post\\b']/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article4rc;

	@FindBy(partialLinkText="What Is A Results Life Coach?")
	WebElement article5;

	@FindBy(xpath="//div[5]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article5rc;

	@FindBy(partialLinkText="Achieve With Power Of Your Mind. – Pooja Sethi")
	WebElement article6;

	@FindBy(xpath="//div[6]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article6rc;

	@FindBy(partialLinkText="What Can You Expect?")
	WebElement article7;

	@FindBy(xpath="//div[7]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article7rc; 

	@FindBy(partialLinkText="What Is A Results Life Coach?")
	WebElement article8;

	@FindBy(xpath="//div[8]/div[@safeclass~'\brow\b']/div[@safeclass~'\bblog-list-view\b']/div[@safeclass~'\bblog-meta\b']/a[@innertext='Reading Continue']")
	WebElement article8rc;

	@FindBy(partialLinkText="Life Coach Vs. Therapist")
	WebElement article9;

	@FindBy(xpath="//div[9]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article9rc;

	@FindBy(partialLinkText="How To Find A Life Coach You Love")
	WebElement article10;

	@FindBy(xpath="//div[10]/div[@safeclass~'\\brow\\b']/div[@safeclass~'\\bblog-list-view\\b']/div[@safeclass~'\\bblog-meta\\b']/a[@innertext='Reading Continue']")
	WebElement article10rc;


	@FindBy(linkText="1")
	WebElement firstpage;

	@FindBy(linkText="2")
	WebElement secondpage;

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
		if(pgno=="3")
		{
			try{
				if(s.equalsIgnoreCase("Inspired By My Passion For Greatness"))

					article1.click();
				if(s.equalsIgnoreCase("Create The JOYFUL Future You Want With Right HABITS?"))
					article2.click();
				if(s.equalsIgnoreCase("Fear!!! Let It Go Easily And Effortlessly."))
					article3.click();
				if(s.equalsIgnoreCase("Hello World!"))
					article4.click();
				if(s.equalsIgnoreCase("What Is A Results Life Coach?"))
					article5.click();
				if(s.equalsIgnoreCase("Achieve With Power Of Your Mind. – Pooja Sethi"))
					article6.click();
				if(s.equalsIgnoreCase("What Can You Expect?"))
					article7rc.click();
				if(s.equalsIgnoreCase("What Is A Results Life Coach?"))
					article8.click();
				if(s.equalsIgnoreCase("Life Coach Vs. Therapist"))
					article9.click();
				if(s.equalsIgnoreCase("How To Find A Life Coach You Love"))
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
		if(pgno=="3")
		{

			try{
				if(s.equalsIgnoreCase("Inspired By My Passion For Greatness"))

					article1rc.click();
				if(s.equalsIgnoreCase("Create The JOYFUL Future You Want With Right HABITS?"))
					article2rc.click();
				if(s.equalsIgnoreCase("Fear!!! Let It Go Easily And Effortlessly."))
					article3rc.click();
				if(s.equalsIgnoreCase("Hello World!"))
					article4rc.click();
				if(s.equalsIgnoreCase("What Is A Results Life Coach?"))
					article5rc.click();
				if(s.equalsIgnoreCase("Achieve With Power Of Your Mind. – Pooja Sethi"))
					article6rc.click();
				if(s.equalsIgnoreCase("What Can You Expect?"))
					article7rc.click();
				if(s.equalsIgnoreCase("What Is A Results Life Coach?"))
					article8rc.click();
				if(s.equalsIgnoreCase("Life Coach Vs. Therapist"))
					article9rc.click();
				if(s.equalsIgnoreCase("How To Find A Life Coach You Love"))
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
		if(pgno=="3")
		{
			try{
				if(s.equalsIgnoreCase("1"))
					firstpage.click();
				if(s.equalsIgnoreCase("2"))
					secondpage.click();
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


	

