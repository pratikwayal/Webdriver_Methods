package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s = new Select(year);
		boolean result =s.isMultiple();
		System.out.println(result);
		if(result==true) {
			System.out.println("listbox is selectable ");
		}
		else {
			System.out.println("list box is single  not selectable");
		}

	}

}
