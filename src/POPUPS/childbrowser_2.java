package POPUPS;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> B1 = new ArrayList<String>(ids);
		String cwid = B1.get(1);
		driver.switchTo().window(cwid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Cypress'])[2]"));
		driver.switchTo().window(B1.get(0));
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
	}

}
