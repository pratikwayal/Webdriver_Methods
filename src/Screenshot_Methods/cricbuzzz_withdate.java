package Screenshot_Methods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class cricbuzzz_withdate {

	public static void main(String[] args) throws InterruptedException, IOException {
	Date date = new Date();
	String date1 = date.toString().replace(" ", "_").replace(":", "-");
	
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(3000);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File file = new File("E:\\screenshotselinum\\pratik" + date1 + ".jpg");
		FileHandler.copy(source, file);
	}

}
