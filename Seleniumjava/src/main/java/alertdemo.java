import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		//simple alert
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/alerts");
//    	Thread.sleep(4000);
//    	driver.findElement(By.id("alertButton")).click();
//    	Thread.sleep(4000);
//
//    	Alert a=driver.switchTo().alert();
//    	a.accept();
//    	
    	//confirmation alert
//    	WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/alerts");
//    	Thread.sleep(4000);
//
//    	driver.findElement(By.id("confirmButton")).click();
//    	Thread.sleep(2000);
//
//    	Alert a=driver.switchTo().alert();
//    	a.dismiss();
//    	Thread.sleep(2000);

//    	System.out.println(a.getText());
    	
    	//prompt alert
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
    	Thread.sleep(4000);
        driver.findElement(By.id("promtButton")).click();
    	Thread.sleep(2000);
        Alert a=driver.switchTo().alert();
    	a.dismiss();
    	Thread.sleep(2000);
        a.sendKeys("hy all");
    	a.accept();



		// TODO Auto-generated method stub

	}

}
