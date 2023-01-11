import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class with_DDF_ZERODHA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		FileInputStream file = new FileInputStream("\\C:\\Users\\DjS\\Desktop\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Zrodha");
		
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// entering UN Using ddf
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		
		
		// enterimg PW using ddf
		String PW = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PW);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//ENTERING PIN BY DDF
		String PIN = sh.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.id("pin")).sendKeys(PIN);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String ActualUID = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
        String expectedUID = "OKP335";
        
        if (expectedUID.equals(ActualUID)) {
      	  System.out.println("TC PASS");
        }
        else System.out.println("FAIL");
}
		
	} 


