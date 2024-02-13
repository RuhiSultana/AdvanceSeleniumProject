package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility extends WebDriverUtility{
	/**
	 * This method is used to give the data which is used in the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String propertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(IConstant.propertyPath);
		
		p = new Properties();
		
		p.load(fis);
		
		return p.getProperty(key);
		
	}

}
