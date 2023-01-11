package Screenshot_Methods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P1_aug {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String date1 = date.toString().replace(" ","_").replace(":", "-");
		
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file = new File ("E:\\screenshotselinum\\pratik" + date1 + ".jpg");
		FileHandler.copy(source, file);
		

	}

}
