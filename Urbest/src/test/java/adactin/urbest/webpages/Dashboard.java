package adactin.urbest.webpages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;

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
		closebutton.click();
	}
	
	/**
	 * Method to navigate to the login page
	 */
	
	public void clickonlogin()
	{
		
		loginlink.click();
	}
	
	/**
	 * Method to go to the My account page for logging in
	 */
	public void gotomyaccount()
	{
		MyAccount.click();
	}
	
	/**
	 * Method to navigate to the appointment booking page
	 */
	public void gotoappointment()
	{
		Appointment.click();
	}
	
	/**
	 * Method to navigate to the registration page
	 */
	public void gotoregistrationpage()
	{
		Register.click();
	}
	
	/**
	 * Method to see the list of coaches
	 */
	public void gotocoacheslist()
	{
		CoachesList.click();
	}
	
	/**
	 * Method to see the About section of urbest website
	 */
	public void aboutpage()
	{
		About.click();
	}
	
	/**
	 * Method to navigate to the Blog section of Urbest
	 */
	public void blogpage()
	{
		Blog.click();
	}
	
	/**
	 * Method to navigate to the Contact Us page
	 */
	public void contactuspage()
	{
		Contactus.click();
	}
	
	/**
	 * Method to navigate to the facebook page of Urbest
	 */
	public void navigatetofb()
	{
		facebooklink.click();	
	}
	
	/**
	 * Method to navigate to the instagram page
	 */
	
	public void navigatetoinsta()
	{
		instalink.click();	
	}
	
	/**
	 * Method to navigate to the Cart section of the user
	 */
	public void gotocart()
	{
		cartsymbol.click();
	}
	
	/**
	 * Method to navigate to the home page
	 */
	public void checklogo()
	{
		logo.click();
	}
	
	/**
	 * Method to see the Team section
	 */
	public void gototeam()
	{
		team.click();
	}
	
	/**
	 * Method to navigate to the testimonial section
	 */
	public void gototestimonials()
	{
		testimonials.click();
	}
	
	/**
	 * Method to navigate to the payment module
	 */
	public void gotopayments()
	{
		payment.click();
	}
}
