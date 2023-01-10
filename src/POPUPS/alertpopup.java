package POPUPS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	    driver.findElement(By.xpath("//button[@id='timerAlertButton']")).sendKeys(Keys.ENTER);		
	    Thread.sleep(6000);
		//driver.switchTo().alert().wait(7000);
		driver.switchTo().alert().accept();
	
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("hello");
		alt.accept();
		Thread.sleep(2000);
		
		
		


	}

}
