package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		//mouse hover
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(4000);
//		Actions act=new Actions(driver);
//		WebElement a=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
//	    act.moveToElement(a).build().perform();
//			//RIGHT CLICK
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/buttons");
//      	Thread.sleep(4000);
//      	WebElement rc=driver.findElement(By.id("rightClickbutton"));
//      	Actions act=new Actions(driver);
//      	act.contextClick(rc).build().perform();
      	
//      	WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/buttons");
//      	Thread.sleep(4000);
//      	WebElement dc=driver.findElement(By.id("doubleClickBtn"));
//      	Actions act=new Actions(driver);
//      	act.contextClick(dc).build().perform();
//      	
      	//drag and drop
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/droppable");
//     	Thread.sleep(4000);
//     	Actions act=new Actions(driver);
//     	WebElement src=driver.findElement(By.id("draggable"));
//     	WebElement target=driver.findElement(By.id("droppable"));
//     	act.dragAndDrop(src,target).build().perform();
     	
     	//Click+Hold+Release
//     	WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/droppable");
//     	Thread.sleep(4000);
//     	Actions act=new Actions(driver);
//     	WebElement src=driver.findElement(By.id("draggable"));
////    	WebElement target=driver.findElement(By.id("droppable"));
//        act.clickAndHold(src);
//        act.moveByOffset(200,0);
//        act.release().build().perform();
     	
        //scrolling
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//    	Thread.sleep(5000);
//    	JavascriptExecutor js=(JavascriptExecutor)driver;
//    	
//
//    	js.executeScript("window.scrollBy(0,1000");//scroll down
//    	Thread.sleep(5000);
//    	js.executeScript("window.scrollBy(0,-500");//scroll down
   	
     	//scroll to a element
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
    	Thread.sleep(5000);
    	Actions act=new Actions(driver);
    	WebElement we=driver.findElement(By.xpath("//div[text()='Back to top']"));

		// TODO Auto-generated method stub

	}

}
