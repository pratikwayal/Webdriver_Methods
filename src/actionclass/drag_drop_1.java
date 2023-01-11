package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source = driver.findElement(By.id("column-b"));
		WebElement dest = driver.findElement(By.id("column-a"));
		Actions act = new Actions(driver);
		act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		

	}

}
