package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown_filpkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions x = new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		x.moveToElement(fashion).perform();
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		x.moveToElement(men).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[3]")).click();

	}

}
