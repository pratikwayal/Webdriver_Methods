package POPUPS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Thread.sleep(2000);
		 Alert alt = driver.switchTo().alert();
		 Thread.sleep(2000);
		 alt.sendKeys("Yes");
		 alt.accept();
		
		

	}

}
