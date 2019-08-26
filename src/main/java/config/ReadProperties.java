package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	public static InputStream is = null;
	public static Properties prop = null;
	public static Properties fecthProp() {
		try {
			is = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
			prop = new Properties();
			prop.load(is);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error with Loading Properties File");
		}
		return prop;
	}

}
