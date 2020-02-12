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
	public static String getProperties(String fname, String key) 
	{
		FileInputStream fis = null;
		String data=null;
		try {
			fis = new FileInputStream("/Users/aswinvijayan/git/Urbest_Project/Urbest/Testdata/"+fname+".properties");
		} catch (FileNotFoundException e) {
			
			Log.error("Unable to read the file from the location");
		}
		Properties p=new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			
			Log.error("Unable to create an object for Properties");
		}
		
		try{
			data=p.getProperty(key);
		}
		catch(Exception e)
		{
			Log.error("Unable to read the data from the property file");
		}
		return data;
	}

}
