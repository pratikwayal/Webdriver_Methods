package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayed_method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		result.click();
		Thread.sleep(2000);
		boolean display = result.isDisplayed();
		System.out.println(display);
		
				
				
				
				
	}

}
