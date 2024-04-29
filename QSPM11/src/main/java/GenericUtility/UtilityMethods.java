package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods 
{

	
	public String takescreenshot(WebDriver driver)
	{
		String path="./ScreenShots/" +UtilityMethods.getCurrentTime()+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+path;
	}
	
	public static String getCurrentTime()
	{
		
		LocalDateTime localtime = LocalDateTime.now();
		String name=localtime.toString().replace(":", "-");
		return name;
		
	}
}
