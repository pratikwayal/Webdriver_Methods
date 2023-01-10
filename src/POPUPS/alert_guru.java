package POPUPS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_guru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		Alert alert = driver.switchTo().alert();
		String alertmess = driver.switchTo().alert().getText();
		System.out.println(alertmess);
		alert.accept();


	}

}
