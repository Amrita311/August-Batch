package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage 
{
	@FindBy (xpath="//input[@id='email']") private WebElement email;
	@FindBy (xpath="//input[@id='pass']") private WebElement password;
	@FindBy (xpath="//button[@name='login']") private WebElement login;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgotPass;
	@FindBy (xpath="//a[text()='Create new account']") private WebElement createNewAccount;
	@FindBy (xpath="//a[text()='Create a Page']") private WebElement createAPage;
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String emailId)
	{
		email.sendKeys(emailId);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		login.click();;
	}
	
	public void clickOnForgotPassword()
	{
		forgotPass.click();;
	}
	
	public void clickOncreateNewAccount()
	{
		createNewAccount.click();;
	}
	
	public void clickOncreateAPage()
	{
		createAPage.click();;
	}



}
