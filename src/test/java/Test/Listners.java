package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class Listners extends BaseTest implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test start="+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		try {
			Screenshot.clickScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test success="+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		try {
			Screenshot.clickScreenshot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test fail="+result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test skipped="+result.getName());
	}

}
