package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(
				projectPath + "\\src\\test\\resources\\configfiles\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);

	}

}
