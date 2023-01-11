package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextmethod {    // gettext method
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
		 String result = text.getText();
		 System.out.println(result);
		
	}

}
