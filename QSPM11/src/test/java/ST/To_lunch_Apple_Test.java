package ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_lunch_Apple_Test 
{@Test(groups = "mobile")
	public void ajioapp()
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.apple.com/");
		 driver.manage().window().maximize();
		 driver.quit();
		 
	 }

}
