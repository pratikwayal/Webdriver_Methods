package I_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wettable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Thread.sleep(2000);
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		System.out.println("NO OF ROWS" + noofrows.size());
		System.out.println(noofrows.get(0).getText());

		for (int i = 1; i < noofrows.size(); i++) {
			List<WebElement> Noofcell = driver.findElements(By.xpath("//table[@id='countries']//tr[" + i + "]//td"));
			System.out.println("ROW NO: " + i + "NO OF CELL: " + Noofcell.size());

			for (int b = 0; b < Noofcell.size(); b++) {
				System.out.print(Noofcell.get(b).getText() + " | ");
			}
			System.out.println();
		}

	}

}
