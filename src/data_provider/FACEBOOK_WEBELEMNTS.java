package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FACEBOOK_WEBELEMNTS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pratik");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kadam");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7020451818");
		driver.findElement(By.id("password_step_input")).sendKeys("pratik@123");
		WebElement birth = driver.findElement(By.id("day"));
		Select day = new Select(birth);
		day.selectByValue("20");
		WebElement birth1 = driver.findElement(By.id("month"));
		Select month = new Select(birth1);
		month.selectByVisibleText("Mar");
		WebElement birth2 = driver.findElement(By.id("year"));
		Select year = new Select(birth2);
		year.selectByVisibleText("1999");
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		driver.findElement(By.name("websubmit")).click();
		driver.navigate().back();
		

	}

}
