package ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_lanch_Mi_Test 
{@Test(groups = "mobile")
	public void miapp()
	{
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.mi.com/in/");
	 driver.manage().window().maximize();
	 Reporter.log("user able to maximize the screen",true);
	 driver.quit();
	}

}
