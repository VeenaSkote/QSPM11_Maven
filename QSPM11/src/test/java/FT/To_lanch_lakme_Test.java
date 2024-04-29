package FT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_lanch_lakme_Test
{@Test(groups = "beauty")
 public void lakmeapp()
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://lakme.com/");
	 driver.manage().window().maximize();
	 driver.quit();
 }
}
