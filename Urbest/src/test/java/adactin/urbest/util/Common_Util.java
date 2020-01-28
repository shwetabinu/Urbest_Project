package adactin.urbest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Common_Util {
	
	public static String getProperties(String fname, String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("/Users/aswinvijayan/git/Urbest_Project/Urbest/Testdata/"+fname+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	
		
	}

}
