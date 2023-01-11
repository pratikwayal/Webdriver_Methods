import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicitwait_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//explicit
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("filpkart");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")));
		
		element.click();


	}

}
