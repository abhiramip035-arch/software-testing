import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//    	Thread.sleep(4000);
		
		
//    	enter
//    	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
//    	search.sendKeys("Laptops"+Keys.ENTER);
//    	search.sendKeys(Keys.ENTER);
		// TODO Auto-generated method stub
		
		
    	//backspace
//    	search.sendKeys("stylish shirts");
//    	Thread.sleep(3000);
//
//    	search.sendKeys(Keys.BACK_SPACE);
		
		
//    	clear
//    	search.sendKeys(Keys.CLEAR);
		
		
//		//copy paste
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/text-box");
//       	Thread.sleep(4000);
//    	WebElement address=driver.findElement(By.id("CurrentAddress"));
//    	address.sendKeys("XYZ Apartment,7 th street banglore");
//    	address.sendKeys(Keys.CONTROL+"a");
//    	address.sendKeys(Keys.CONTROL+"c");
//    	WebElement p=driver.findElement(By.id("permanentAddress"));
//    	p.sendKeys(Keys.CONTROL+"v");
    	
    	//shift
//    	WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/automation-practice-form");
//       	Thread.sleep(4000);
//    	WebElement email=driver.findElement(By.id("userEmail"));
//    	email.sendKeys("abhiramip035"+Keys.SHIFT+2);
//    	email.sendKeys("gmail.com");
    	
    	
    	//arrow up and arrow down
//		WebDriver driver=new ChromeDriver();
//    	driver.get("https://demoqa.com/select-menu");
//       	Thread.sleep(4000);
//       	WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
//       	dropdown.sendKeys(Keys.ARROW_DOWN);
//       	dropdown.sendKeys(Keys.ARROW_DOWN);
//       	dropdown.sendKeys(Keys.ARROW_DOWN);
//       	dropdown.sendKeys(Keys.ARROW_UP);

    	//DELETE
       	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.in/");
     	Thread.sleep(4000);
    	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
     	search.sendKeys("Laptops");
     	Thread.sleep(4000);
     	search.sendKeys(Keys.CONTROL+"A");
       	search.sendKeys(Keys.DELETE);



	}

}
