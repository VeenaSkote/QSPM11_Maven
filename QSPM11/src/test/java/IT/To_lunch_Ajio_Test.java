package IT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_lunch_Ajio_Test 
{@Test(groups = "ecom")
	public void ajioapp()
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.ajio.com/");
		 driver.manage().window().maximize();
		 driver.quit();
		 
	 }

}
