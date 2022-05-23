package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void captureScreenShot(WebDriver driver , String name) throws IOException {
		
		TakesScreenshot tss =(TakesScreenshot)driver;
		File captureScreen = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\ScreenShot"+name+".png");
		FileHandler.copy(captureScreen , dest);
		System.out.println("screenshot captured");
	}

}
