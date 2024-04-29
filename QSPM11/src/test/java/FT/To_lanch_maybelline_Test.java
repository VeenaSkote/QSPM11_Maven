package FT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_lanch_maybelline_Test 
{@Test(groups = "beauty")
	public void maybelline()
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.maybelline.com/");
		 driver.manage().window().maximize();
		 driver.quit();
	}
	

}
