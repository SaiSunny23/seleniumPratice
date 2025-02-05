package resourcesfileget;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetResource {
		Properties prop;

		public void getPropertiesFile() throws IOException {
			prop = new Properties();
			String path = System.getProperty("user.dir") + "\\src\\main\\java\\datafile\\records.properties";
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);

		}

		public String getProperty(String value) throws IOException {
			getPropertiesFile();
			return prop.getProperty(value);

		}
	}
	


