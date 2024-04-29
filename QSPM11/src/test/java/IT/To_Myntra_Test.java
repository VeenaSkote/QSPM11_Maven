package IT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_Myntra_Test 
{@Test(groups = "ecom")
 public void mynthraapp()
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.myntra.com/");
	 driver.manage().window().maximize();
	 driver.quit();
	 
 }
}
