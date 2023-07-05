package pkg_json;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage extends Basepage
{
	//x.path
	public static final By usernametextBoxBy =By.xpath("//input[@name='username']");
	public static final By passwordtextBoxBy =By.xpath("//input[@name='password']");
	public static final By LoginButtonBy=By.xpath("//button[@type='submit']");

	//Find.Elements
	public static WebElement usernameTextBox()
	{
		return driver.findElement(usernametextBoxBy);
	}
	public static WebElement passwordTextBox()
	{
		return driver.findElement(passwordtextBoxBy);
	}
	public static WebElement LoginButton()
	{
		return driver.findElement(LoginButtonBy);
	}



	//actions
	public static void userName() throws InterruptedException
	{
		Thread.sleep(5000);
		usernameTextBox().click();
		usernameTextBox().sendKeys("Admin");
	}
	public static void password() throws InterruptedException 
	{
		Thread.sleep(5000);
		passwordTextBox().sendKeys("admin123");
		Thread.sleep(5000);
	}
	public static void clickonlogin() throws InterruptedException
	{
		Thread.sleep(3000);
		LoginButton().click();
		Thread.sleep(3000);
	}
		
		public static void loginpageactions() throws InterruptedException
		{
			userName();
			Thread.sleep(3000);
			password();
			Thread.sleep(2000);
			clickonlogin();
			
		}
}
