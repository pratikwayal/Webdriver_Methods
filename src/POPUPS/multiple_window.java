package POPUPS;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_window {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://millionsadvisory.com/");
		driver.findElement(By.xpath("(//a[@style='color: inherit;'])[1]")).click();
		driver.findElement(By.xpath("(//a[@style='color: inherit;'])[2]")).click();
		driver.findElement(By.xpath("(//a[@style='color: inherit;'])[3]")).click();
		driver.findElement(By.xpath("(//a[@style='color: inherit;'])[4]")).click();
		driver.findElement(By.xpath("(//a[@style='color: inherit;'])[5]")).click();
		
		Set<String> handels = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handels);
	
	}
public void switchToRightWindow (String windowtitle ,List<String> hlist) {
	
	for (String e: hlist) {
		String  title = driver.switchTo().window(e).getTitle();
	}
}
}
