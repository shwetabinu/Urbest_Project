package adactin.urbest.webpages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;
import adactin.urbest.util.Log;

/**
 * Dashboard class identifies the web elements in the top section of the web page. The elements identified are:
 * loginlink, close button, My Account, Appointment, Register, Coaches List, About, Blog, Contact us, Social media links, Cart, Home, About, Team, 
 * Blog, Contact us, Testimonials, Register, Payment and Book an appointment.
 * Methods are written to perform click action on each of these elements so that it is navigated to the respective pages
 * 
 *
 */

public class Dashboard extends BaseClass{
	//private static WebDriver driver;

	/**
	 * Method to initialize the driver
	 * @throws IOException
	 */


	public Dashboard() throws IOException{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		Log.info("Initializing the dashboard page");
	}

	/**
	 * Link to login to the application
	 */
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginlink;

	/**
	 * The close button on the subscription pop-up
	 */
	@FindBy(xpath="//a[@class='close-btn-popup']//i[@class='fa fa-close']")
	WebElement closebutton;

	/**Link to login to the application
	 * 
	 */
	@FindBy(linkText="My Account")
	WebElement MyAccount;

	/**
	 * Link to Book an appointment with a coach
	 */
	@FindBy(linkText="Appointment")
	WebElement Appointment;

	/**
	 * Link to Register to urbest
	 */
	@FindBy(linkText="Register")
	WebElement Register;

	/**
	 * Link to view the Coaches List
	 */
	@FindBy(linkText="Coaches List")
	WebElement CoachesList;

	/**
	 * Link to see the about section of the page
	 */
	@FindBy(linkText="About")
	WebElement About;

	/**
	 * Link to navigate to the Blog page
	 */
	@FindBy(linkText="Blog")
	WebElement Blog;

	/**
	 * Link to Contact us page
	 */
	@FindBy(linkText="Contact Us")
	WebElement Contactus;

	/**
	 * Link to navigate to the fb page
	 */
	@FindBy(xpath="//a[@pathname='/URbest.com.au/']/i[@safeclass~'\\bfa\\b.*\\bfa-facebook\\b']")
	WebElement facebooklink;

	/**
	 * Link to navigate to the insta page of the website
	 */
	@FindBy(xpath="//a[@pathname='/URbest.com.au/']/i[@safeclass~'\\bfa\\b.*\\bfa-instagram\\b']")
	WebElement instalink;

	/**
	 * Link to navigate to the cart
	 */
	@FindBy(xpath="//div[@safeclass~'\\btopbar\\b']//span[@innertext='0']")
	WebElement cartsymbol;

	/**
	 * The clickable logo of urbest
	 */
	@FindBy(xpath="//div[@safeclass~'\\blogo-area\\b']//a[@title='UR BEST COACH PTY LTD']/img[@alt='logo']")
	WebElement logo;

	/**
	 * Home Page link
	 */
	@FindBy(linkText="HOME")
	WebElement home;

	/**
	 * About page link
	 */
	@FindBy(linkText="ABOUT")
	WebElement about;

	/**
	 * Link to see the team
	 */
	@FindBy(linkText="TEAM")
	WebElement team;

	/**
	 * Link to the Blog page
	 */
	@FindBy(linkText="BLOG")
	WebElement blog;

	/**
	 * Link to Contact us page
	 */
	@FindBy(linkText="CONTACT US")
	WebElement contactus;

	/**
	 * Link to the testimonials
	 */
	@FindBy(linkText="TESTIMONIALS")
	WebElement testimonials;

	/**
	 * Link to register to urbest
	 */
	@FindBy(linkText="REGISTER")
	WebElement register;

	/**
	 * Link to the payment module
	 */
	@FindBy(linkText="PAYMENT")
	WebElement payment;

	/**
	 * Link to book an appointment
	 * 
	 */
	@FindBy(linkText="Book An Appointment")
	WebElement bookapp;

	/**
	 * Method to close the popup for subscription
	 */
	public void closepopup()
	{
		try{
			closebutton.click();
			Log.info("Popup is closed");
		}
		catch(Error e) {


			Log.error("Error opening");
		}
	}
	/**
	 * Method to navigate to the login page
	 */

	public void clickonlogin()
	{
		try{
			loginlink.click();
		}
		catch(Error e)
		{
			Log.error("Login link not clickable");
		}
	}

	/**
	 * Method to go to the My account page for logging in
	 */
	public void gotomyaccount()
	{
		try {
			MyAccount.click();
			Log.info("The page is navigated to My Account");
		}
		catch(Error e)
		{
			Log.error("The link is not clickable");

		}
	}

	/**
	 * Method to navigate to the appointment booking page
	 */
	public void gotoappointment()
	{
		try{
			Appointment.click();

			Log.info("The page is navigated to Appointment page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to Appointment");
		}

	}

	/**
	 * Method to navigate to the registration page
	 */
	public void gotoregistrationpage()
	{
		try{
			Register.click();

			Log.info("The page is navigated to Registration page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to registration page");
		}

	}

	/**
	 * Method to see the list of coaches
	 */
	public void gotocoacheslist()
	{
		try{
			CoachesList.click();

			Log.info("The page is navigated to Coaches list page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to coaches list");
		}
	}

	/**
	 * Method to see the About section of urbest website
	 */
	public void aboutpage()
	{
		About.click();
		Log.info("The page is navigated to About page");
	}

	/**
	 * Method to navigate to the Blog section of Urbest
	 */
	public void blogpage()
	{
		try{
			Blog.click();

			Log.info("The page is navigated to Blog page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to Blog page");
		}
	}

	/**
	 * Method to navigate to the Contact Us page
	 */
	public void contactuspage()
	{
		try
		{
			Contactus.click();
			Log.info("The page is navigated to Contact us page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to contact us page");
		}
	}


	/**
	 * Method to navigate to the facebook page of Urbest
	 */
	public void navigatetofb()
	{

		try{
			facebooklink.click();	
			Log.info("The page is navigated to Facebook link page");
		}
		catch(Exception e)
		{
			Log.error("The page cannot be navigated");
		}
	}

	/**
	 * Method to navigate to the instagram page
	 */

	public void navigatetoinsta()
	{
		try{
			instalink.click();	

			Log.info("The page is navigated to Instagram page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to insta page");
		}
	}

	/**
	 * Method to navigate to the Cart section of the user
	 */
	public void gotocart()
	{
		try{
			cartsymbol.click();
			Log.info("The page is navigated to Cart page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to the cart page");
		}
	}

	/**
	 * Method to navigate to the home page
	 */
	public void checklogo()
	{
		try{
			logo.click();
			Log.info("The page is navigated to Home page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to Home");
		}
	}

	/**
	 * Method to see the Team section
	 */
	public void gototeam()
	{
		try{team.click();
		Log.info("The page is navigated to Team page");
		}
		catch(Exception e)
		{
			Log.error("Unable to click on Team ");
		}
	}

	/**
	 * Method to navigate to the testimonial section
	 */
	public void gototestimonials()
	{
		try{
			testimonials.click();
			Log.info("The page is navigated to Testimonials page");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to Testimonials");
		}
	}

	/**
	 * Method to navigate to the payment module
	 */
	public void gotopayments()
	{
		try{
			payment.click();

			Log.info("The page is navigated to Payment module");
		}
		catch(Exception e)
		{
			Log.error("Unable to navigate to ehe payment");

		}
	}
}
