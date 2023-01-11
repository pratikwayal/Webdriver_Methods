package webelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("testing");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='vcVZ7d']//style/descendant::div[@id='SIvCob']"));
		System.out.println("total number of sugg in search box: " + list.size());

	}
	

}
