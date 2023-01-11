import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("filpkart");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7020451763");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pratik@9028");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		

	}

}
