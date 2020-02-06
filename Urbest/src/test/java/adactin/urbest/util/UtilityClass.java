package adactin.urbest.util;

import java.io.IOException;

import adactin.urbest.base.BaseClass;

/**
 * Sets the page load timeout time and the implicit wait time
 * @author aswinvijayan
 *
 */
public class UtilityClass extends BaseClass
{
	public UtilityClass() throws IOException
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLCIT_WAIT = 100;
}
