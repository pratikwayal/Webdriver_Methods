package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		WebElement practice = driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
Actions scroll = new Actions(driver);
scroll.moveToElement(practice).perform();

Thread.sleep(2000);

WebElement p2 = driver.findElement(By.xpath("//div[@class='n2-ss-layer n2-ow']"));
scroll.moveToElement(p2).perform();
	}

}
