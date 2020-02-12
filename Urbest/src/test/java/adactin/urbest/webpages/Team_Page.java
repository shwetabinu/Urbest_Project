package adactin.urbest.webpages;

import java.io.IOException;
import adactin.urbest.util.ExcelUtil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.ExcelUtil;
import adactin.urbest.util.Log;

/**
 * Class identifies all the web elements in the Team page and has methods written to perform action on these elements
 * 
 *
 */

public class Team_Page extends BaseClass{

	String member;
	/**
	 * Initializing the Team page
	 * @throws IOException
	 */
	public Team_Page() throws IOException{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	/**
	 * Identifying the webelements in the team page
	 */
	@FindBy(partialLinkText="Dr Sharon Haasbroek")
	WebElement firstmem;

	@FindBy(partialLinkText="Chantelle Corbett Nl")
	WebElement secondmem;

	@FindBy(partialLinkText="Karen L. Corbe")
	WebElement thirdmem;

	@FindBy(partialLinkText="Bharat Set")
	WebElement fourthmem;

	@FindBy(partialLinkText="Pooja")
	WebElement fifthmem;

	@FindBy(partialLinkText="Miriam Marmole")
	WebElement sixthmem;

	@FindBy(xpath="//ul[@safeclass~'\\bteam-social\\b']/?/?/a[@pathname='/team-w-o-sidebar/']")
	WebElement chantelflink;

	@FindBy(xpath="//a[@pathname='/URbest.com.au/']/i[@safeclass~'\\bfa\\b.*\\bfa-facebook-square\\b']")
	WebElement bharatflink;

	@FindBy(xpath="//?/a[@pathname='/in/bharat-sethi-3138a210/']")
	WebElement bharatllink;

	@FindBy(xpath="//?/a[@pathname='/bharat.consultant']")
	WebElement bharatflink2;

	@FindBy(xpath="//?/a[@pathname='/pooja.sethi.161']")
	WebElement poojaflink;

	@FindBy(xpath="//?/a[@pathname='/in/pooja-sethi-coach/']")
	WebElement poojallink;

	@FindBy(xpath="//?/a[@pathname='/urbest.com.au']")
	WebElement poojaflink2;


	@FindBy(xpath="//?/a[@pathname='/livingwiharmony/']")
	WebElement miriamflink;

	@FindBy(xpath="//?/a[@pathname='/miriam.marmolejo.37']")
	WebElement miriamflink2;

	@FindBy(xpath="//?/a[@pathname='/miriammarmolej2']")
	WebElement miriamtlink;

	@FindBy(xpath="//?/a[@pathname='/+miriammarmolejo']\")")
	WebElement miriamglink;

	@FindBy(xpath="//?/a[@pathname='/in/miriam-marmolejo-b4b2a34a']")		
	WebElement miriamllink;

	@FindBy(linkText="Home")
	WebElement homelink;

	/**
	 * Method to validate the title of the page
	 * @return
	 */
	public String validatepagetitle()
	{
		return driver.getTitle();
	}

	/**
	 * Method to navigate to the page of each of the team members
	 * @param member
	 */
	public void navigatetomember(String member)
	{
		try{
			if(member.equalsIgnoreCase("Dr Sharon Haasbroek"))

				firstmem.click();
			if(member.equalsIgnoreCase("Chantelle Corbett"))
				secondmem.click();
			if(member.equalsIgnoreCase("Karen L. Corbett"))
				thirdmem.click();
			if(member.equalsIgnoreCase("Bharat Sethi"))
				fourthmem.click();
			if(member.equalsIgnoreCase("Pooja"))
				fifthmem.click();
			if(member.equalsIgnoreCase("Miriam Marmole"))
				sixthmem.click();
			Log.info("The member link is clicked upon");
		}
		catch(Exception e)
		{
			Log.error("Unable to click on the team member link");
		}
	}

	/**
	 * Method to navigate to the facebook page of each member
	 * @param rno Rownumber where the test case is written
	 * @throws Exception
	 */
	public void navigate_to_flink(int rno) throws Exception
	{
		member=ExcelUtil.getCellData(rno,12);

		try
		{
			if(member.equalsIgnoreCase("Dr Sharon Haasbroek"))

				Log.error("Sorry facebook link not available");
			if(member.equalsIgnoreCase("Chantelle Corbett"))
				chantelflink.click();
			if(member.equalsIgnoreCase("Karen L. Corbett"))
				Log.error("Sorry facebook link not available");
			if(member.equalsIgnoreCase("Bharat Sethi"))
				bharatflink.click();
			if(member.equalsIgnoreCase("Pooja"))
				poojaflink.click();	
			if(member.equalsIgnoreCase("Miriam Marmole"))
				miriamflink.click();
			Log.info("The facebook link of the required team member is clicked upon");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to the facebook link of the member");
		}

	}

	/**
	 * Method to navigate to other facebook page of the member
	 * @param rno Rownumber where the test case is written
	 * @throws Exception
	 */

	public void navigate_to_flink2(int rno) throws Exception
	{
		member=ExcelUtil.getCellData(rno,12);

		try{
			if(member.equalsIgnoreCase("Dr Sharon Haasbroek"))

				Log.error("Sorry facebook link not available");
			if(member.equalsIgnoreCase("Chantelle Corbett"))
				Log.error("Sorry second facebook link not available");
			if(member.equalsIgnoreCase("Karen L. Corbett"))
				Log.error("Sorry facebook link not available");
			if(member.equalsIgnoreCase("Bharat Sethi"))
				bharatflink2.click();
			if(member.equalsIgnoreCase("Pooja"))
				poojaflink2.click();	
			if(member.equalsIgnoreCase("Miriam Marmole"))
				miriamflink2.click();

			Log.info("The second facebook link is clicked upon and navigated to");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to the second facebook link");
		}

	}

	/**
	 * Method to navigate to the linkedin url of each of the team member
	 * @param rno Row number where the test case is written
	 * @throws Exception
	 */
	public void navigate_to_linkedinlink(int rno) throws Exception
	{
		member=ExcelUtil.getCellData(rno,12);

		try{
			if(member.equalsIgnoreCase("Dr Sharon Haasbroek"))

				Log.error("Sorry Linkedin link not available");
			if(member.equalsIgnoreCase("Chantelle Corbett"))
				Log.error("Sorry Linkedin link not available");
			if(member.equalsIgnoreCase("Karen L. Corbett"))
				Log.error("Sorry Linkedin link not available");
			if(member.equalsIgnoreCase("Bharat Sethi"))
				bharatllink.click();
			if(member.equalsIgnoreCase("Pooja"))
				poojallink.click();	
			if(member.equalsIgnoreCase("Miriam Marmole"))
				miriamllink.click();
			Log.info("Navigation to the linkedin url successful");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to the linkedin link");
		}

	}

	/**
	 * Method to navigate to the twitter link of each of the team member
	 * @param rno  Row number where the test case is written
	 * @throws Exception
	 */
	public void navigate_to_twitterlink(int rno) throws Exception
	{
		member=ExcelUtil.getCellData(rno,12);

		try{
			if(member.equalsIgnoreCase("Dr Sharon Haasbroek"))
				Log.error("Sorry Twitter link not available");
			if(member.equalsIgnoreCase("Chantelle Corbett"))
				Log.error("Sorry Twitter link not available");
			if(member.equalsIgnoreCase("Karen L. Corbett"))
				Log.error("Sorry Twitter link not available");
			if(member.equalsIgnoreCase("Bharat Sethi"))
				Log.error("Sorry Twitter link not available");
			if(member.equalsIgnoreCase("Pooja"))
				Log.error("Sorry Twitter link not available");
			if(member.equalsIgnoreCase("Miriam Marmole"))
				miriamtlink.click();
			Log.info("Navigation to the twitter link successful");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to the twitter link");
		}

	}

	/**
	 * Method to navigate to the google+ page of the team member
	 * @param rno Row number where the test case is written
	 * @throws Exception
	 */
	public void navigate_to_gpluslink(int rno) throws Exception
	{
		member=ExcelUtil.getCellData(rno,12);

		try{
			if(member.equalsIgnoreCase("Dr Sharon Haasbroek"))

				Log.error("Sorry Google plus link not available");
			if(member.equalsIgnoreCase("Chantelle Corbett"))
				Log.error("Sorry Google plus link not available");
			if(member.equalsIgnoreCase("Karen L. Corbett"))
				Log.error("Sorry Google plus link not available");
			if(member.equalsIgnoreCase("Bharat Sethi"))
				Log.error("Sorry Google plus link not available");
			if(member.equalsIgnoreCase("Pooja"))
				Log.error("Sorry Google plus link not available");
			if(member.equalsIgnoreCase(	"Miriam Marmole"))
				miriamtlink.click();
			Log.info("Navigation to the gplus link successful");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to gpluslink");
		}

	}

	/**
	 * Method to navigate back home
	 */

	public void navigatebacktohome()
	{
		try
		{
			homelink.click();
			Log.info("Navigation to the home page successful");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to the home page");
		}
	}


}
