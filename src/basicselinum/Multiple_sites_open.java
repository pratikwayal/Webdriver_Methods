package basicselinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_sites_open {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB); // to open a new tab
		
		driver.navigate().to("https://www.tcs.com/");
		Thread.sleep(2000);
		driver.close();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver1.quit();

	}

}
