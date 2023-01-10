import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		
//		Step 1: Go to URL
		driver.get("http://www.htmlcanvasstudio.com/");
		
//		Step 2: Click on Draw a Line
		driver.findElement(By.xpath("//input[@title='Draw a line']")).click();
		
//		Step 3: Draw one Horizontal Line
		act.moveByOffset(275, 350).click().moveByOffset(400, 0).click().perform();
		
//		Step 4: Draw one Vertical Line(Intercepting Each Other)
		act.moveByOffset(-200, -100).click().moveByOffset(0, 200).click().perform();
		
//		Step 5: Click on Draw a Rectangle
		driver.findElement(By.xpath("//input[@title='Draw a rectangle']")).click();
		
//		Step 6: Draw one Rectangle
		act.moveByOffset(-200, 50).click().moveByOffset(400, 100).click().perform();
		
//		Step 7: Click Eraser and Erase Horizontal Line
		driver.findElement(By.xpath("//input[@title='Use eraser']")).click();
		act.moveByOffset(-400, -250).clickAndHold().moveByOffset(400, 0).release().build().perform();
			
		driver.close();
		
} }
