package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import GenericUtility.UtilityMethods;

public class p1
{

	WebDriver driver;
	UtilityMethods um=new UtilityMethods();
	@Test
	public void report()
	{
		ExtentReports reports=new ExtentReports();
		ExtentSparkReporter extentsparkreporter=new ExtentSparkReporter("./ExtentReports/ "+UtilityMethods.getCurrentTime() + ".html");
		reports.attachReporter(extentsparkreporter);
		ExtentTest extentTest = reports.createTest("login");
		WebDriver driver=new ChromeDriver();
		extentTest.log(Status.INFO,"browser is opened");
		driver.manage().window().maximize();
		extentTest.log(Status.INFO,"browser is maximized");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailmailtextbox = driver.findElement(By.id("Email"));
		emailmailtextbox.sendKeys("veenaskote8@gmail.com");
		
		WebElement passwordmailtextbox = driver.findElement(By.id("Password"));
		passwordmailtextbox.sendKeys("nairuthi");
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		try
		{
			if(driver.findElement(By.linkText("Log out")).isDisplayed())
			{
			extentTest.log(Status.PASS,"User is able to logged in");	
			extentTest.log(Status.PASS,"user able to login successfully");
			extentTest.pass(MediaEntityBuilder.createScreenCaptureFromPath(um.takescreenshot(driver)).build());
			}
		}
		catch (Exception e) 
		{
			extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(um.takescreenshot(driver)).build());
			
		}
		reports.flush();
	}
	
	
}
