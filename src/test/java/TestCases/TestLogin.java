package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Screens.Login;
import TestBase.BaseClass;

public class TestLogin extends BaseClass {

	@Test
	public void testLogin() throws IOException
	{
		Login l=new Login(driver);
		l.login();
		boolean status=l.dashboardOptionCheck.isDisplayed();
		Assert.assertFalse(status);

	}
	
}
