package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		WebElement cb=driver.findElement(By.id("singleFileInput"));
		//cb.click();	
		cb.sendKeys("C:\\Users\\Abhirami Pradeep\\Pictures\\Screenshots");
		// TODO Auto-generated method stub
//		Thread.sleep(4000);
//		WebElement ca=driver.findElement(By.id("multipleFilesInput"));
//		//cb.click();	
//		cb.sendKeys("C:\\Users\\Abhirami Pradeep\\Pictures\\Screenshots");
		


	}

}
