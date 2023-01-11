import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genric_explicit_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("filpkart");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		By elelocator = By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']");
		waitForElementPresent(driver, elelocator, 10).click();

	}

	private static WebElement waitForElementPresent(WebDriver driver, By elelocator, int timeout) {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		mywait.until(ExpectedConditions.presenceOfElementLocated(elelocator));

		return driver.findElement(elelocator);
		// TODO Auto-generated method stub

	}

}
