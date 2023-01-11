package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISSELCETDONE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement Male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Male.click();
		Thread.sleep(2000);
		boolean result = Male.isSelected();
		System.out.println(result);
		if (result=true) {
			System.out.println("element is true ");
		}
		else {
			System.out.println("element is not true");
		}
		

	}

}
