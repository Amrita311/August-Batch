package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.FacebookLoginPage;

@Listeners(Listners.class)
public class FacebookLoginTest 
{
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		 driver=Browser.openBrowser("https://www.facebook.com/");
		
	}
	@Test
	public void loginWithValidUsernameAndValidPassword()
	{
		FacebookLoginPage facebookLoginPage=new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("Amrita@gmail.com");
		facebookLoginPage.enterPassword("12345");
		facebookLoginPage.clickOnLogin();
		System.out.println("Test1");
	}
	
	@Test(enabled=false)
	public void loginWithValidUsernameAndInvalidPassword()
	{
		FacebookLoginPage facebookLoginPage=new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("Amrita@gmail.com");
		facebookLoginPage.enterPassword("3456");
		facebookLoginPage.clickOnLogin();
		System.out.println("Test2");
	}
	
	@Test
	public void loginWithInvalidUsernameAndValidPassword()
	{
		FacebookLoginPage facebookLoginPage=new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("amrita");
		facebookLoginPage.enterPassword("12345");
		facebookLoginPage.clickOnLogin();
		System.out.println("Test3");
	}

}
