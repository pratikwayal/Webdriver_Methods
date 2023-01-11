package I_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saticwebtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("no of rows" +rows.size());
		System.out.println(rows.get(0).getText());
		// no of rows present in webtable
		for (int i=1;i<rows.size();i++) {
			List<WebElement> Noofcell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			System.out.println("ROW NO:"+ i + "NO OF CELL: "+Noofcell.size());
			for (int cell=0;cell<Noofcell.size();cell++) {
				System.out.print(Noofcell.get(cell).getText() +", ");
			}
			System.out.println();
			
		}
		
		
		

	}

}
