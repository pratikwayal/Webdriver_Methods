package POPUPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(2000);
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("asdfgz");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		

	}

}
