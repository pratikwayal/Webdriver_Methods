package LOCATOR_XPATHS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class two {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7020451763");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Wayal@9028");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
		

	}

}
