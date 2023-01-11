package LOCATOR_XPATHS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class threee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();

	}

}
