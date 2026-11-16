package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
    	Thread.sleep(4000);
    	String ogwindow=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        System.out.println(ogwindow);
        String child=driver.getWindowHandle();
        System.out.println(child);
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
    	Thread.sleep(3000);
    	driver.close();
    	driver.switchTo().window(ogwindow);
    	driver.quit();

        
        


		
		// TODO Auto-generated method stub

	}

}
