package TestCase;

import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pkg_json.Basepage;
import pkg_json.loginpage;

public class loginpgTC 
{
	@BeforeClass
	public static void driver_installation() throws IOException
	{
		Basepage.driverinstallation();
	}
	@Test
	public static void orangeHRMlogin_TC() throws InterruptedException
	{
		loginpage.loginpageactions();
	}
	
	@AfterClass
	public static void driver_exit()
	{
		Basepage.driver_quit();
	}
}
