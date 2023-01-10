package POPUPS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_accept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.name("enter-name")).sendKeys("pratik");
	driver.findElement(By.id("confirmbtn")).click();
	//driver.findElement(By.id("alertbtn")).click();
	Alert A1 = driver.switchTo().alert();
	A1.accept();

	}

}
