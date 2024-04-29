package ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_lanch_Motorola_Test 
{@Test(groups = "mobile")
	public void miapp()
	{
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.motorola.in/");
	 driver.manage().window().maximize();
	 driver.quit();
	}
}
