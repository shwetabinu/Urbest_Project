package adactin.urbest.util;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * Class to retrieve the properties from the Property file
 *
 */
public class Common_Util {
	
	/**
	 * Method to retrieve the properties of a property file 
	 * @param fname The name of the property file
	 * @param key The name of the data retrieved from the property file
	 * @return
	 * @throws IOException
	 */
	public static String getProperties(String fname, String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("/Users/aswinvijayan/git/Urbest_Project/Urbest/Testdata/"+fname+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	
		
	}

}
