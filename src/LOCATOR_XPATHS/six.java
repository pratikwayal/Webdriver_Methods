package LOCATOR_XPATHS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class six {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("9028735335");
		driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();

	}

}
// //*[@id="email"]
// /html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input