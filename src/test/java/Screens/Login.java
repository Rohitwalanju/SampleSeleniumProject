package Screens;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Operations;

public class Login extends Operations {

	// public Properties prop;

	public Login(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	
	@FindBy(name = "username")
	WebElement enterUserName;

	@FindBy(name = "password")
	WebElement enterPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']")
   public static WebElement dashboardOptionCheck;
	
	public void login() throws IOException {

		String url = getProperty("Url");
		String username = getProperty("Username");
		String password = getProperty("Password");

		driver.get(url);
		enterUserName.sendKeys(username);
		enterPassword.sendKeys(password);
		submitButton.click();
	}

}
