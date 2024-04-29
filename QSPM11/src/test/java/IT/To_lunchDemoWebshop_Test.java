package IT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_lunchDemoWebshop_Test 
{@Test(groups = "ecom")
	public void Demoshopapp()
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/fiction");
		 driver.manage().window().maximize();
		 driver.quit();
		 
	 }
}
