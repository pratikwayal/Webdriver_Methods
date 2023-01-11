package LOCATOR_XPATHS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class five {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("7020451763");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("prati@9028");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click(); 
		 
	

	}

}
