package POPUPS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		Thread.sleep(2000);
		driver.findElement(By.id("user_full_name")).sendKeys("pratik wayal");
		driver.findElement(By.id("user_email_login")).sendKeys("pratikwayal9020@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("pratik@123");
		driver.findElement(By.id("user_submit")).click();
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click();
		Alert alert = driver.switchTo().alert();
		String alertmesssage = driver.switchTo().alert().getText();
		System.out.println(alertmesssage);
		Thread.sleep(7000);
		alert.accept();
		driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click();
		

	}

}
