package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Operations {
	public WebDriver driver;
	public Properties prop;

	public Operations(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		properties();
	}

	public void properties() throws IOException {
		prop = new Properties();
		FileInputStream fi = new FileInputStream(
				"C:\\Users\\91966\\eclipse-workspace\\SampleSeleniumProject\\src\\test\\java\\Utilities\\Data.properties");
		prop.load(fi);
		fi.close();

	}

	public String getProperty(String key) {
		return prop.getProperty(key);

	}
}
