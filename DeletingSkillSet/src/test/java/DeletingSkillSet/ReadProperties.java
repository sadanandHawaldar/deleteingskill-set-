package DeletingSkillSet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	static Properties pr = new Properties();

	public static String readFile(String Key) throws IOException {

		// Read the properties file
		FileInputStream fis = new FileInputStream("./db.properties");

		pr.load(fis);

		/*
		 * Search for the property with the specified key in this property list and
		 * return
		 */
		String browser = pr.getProperty(Key);
		return browser;
	}

}
