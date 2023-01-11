package POPUPS;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
	
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();

	}

}
