package basicselinum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chormenavigate_sumit1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("samsung galaxy S22 ultra");

	WebElement serach1 = driver.findElement(By.id("nav-search-submit-button"));
	search.click();
	driver.quit();
	
	
}
}
