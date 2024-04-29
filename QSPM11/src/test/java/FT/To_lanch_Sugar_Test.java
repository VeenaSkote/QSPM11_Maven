package FT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_lanch_Sugar_Test
{@Test(groups = "beauty")
	public void sugarapp()
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://in.sugarcosmetics.com/");
		 driver.manage().window().maximize();
		 driver.quit();
		 
	 }
	
	
	
	
 
}
