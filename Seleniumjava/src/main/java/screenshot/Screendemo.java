package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v146.page.model.Screenshot;

import com.google.common.io.Files;

public class Screendemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://saucelabs.com/");
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("facebook.png");
	    Files.copy(source,dest);
	    driver.quit();
		// TODO Auto-generated method stub.

	}

	private static void maximize() {
		// TODO Auto-generated method stub
		
	}

}
