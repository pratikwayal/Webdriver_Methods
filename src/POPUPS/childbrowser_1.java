package POPUPS;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();// click on the new tab
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<String>(ids);
		String CWID = a1.get(1); // child browser address
		driver.switchTo().window(CWID); // switch the focus of window and
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		driver.switchTo().window(a1.get(0));
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
	}

}
