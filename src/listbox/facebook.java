package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("7020451763");
		driver.findElement(By.name("pass")).sendKeys("Varsh@9028");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(12000);
		driver.findElement(By.name("firstname")).sendKeys("pratik");
		driver.findElement(By.name("lastname")).sendKeys("patil");
		driver.findElement(By.name("reg_email__")).sendKeys("7020451764");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pratik@7878");
		WebElement birth = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(birth);
		day.selectByValue("26");

		WebElement birth1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(birth1);
		month.selectByVisibleText("Mar");

		WebElement birth2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(birth2);
		year.selectByVisibleText("1997");

		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
