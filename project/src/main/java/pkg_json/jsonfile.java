package pkg_json;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsonfile 
{

	public static WebDriver driver;
	
	public static Properties p=new Properties();
	
	public static void Base() throws IOException
	{
		FileInputStream fis =new FileInputStream("D:\\JSON_WORKSPACE\\template\\project\\src\\test\\resources\\propertyfile");
		p.load(fis);
	}

	public static void driverinstallation()
	{
		driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();

	}

}
