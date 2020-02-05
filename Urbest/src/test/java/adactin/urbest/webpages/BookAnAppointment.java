package adactin.urbest.webpages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import adactin.urbest.base.BaseClass;

/**
 * The class has all the webelements in the Appointment booking page identified. It has method to book an appointment
 * @author aswinvijayan
 *
 */
public class BookAnAppointment extends BaseClass {
	
	/**
	 * The method initializes the BookanAppointment page
	 * @throws IOException
	 */
	public BookAnAppointment() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

}
