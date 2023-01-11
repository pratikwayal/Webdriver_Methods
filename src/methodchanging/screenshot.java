package methodchanging;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		for(int i=1;i<=10;i++) {
		
File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//System.out.println(source);
File dest = new File ("E:\\screenshotselinum\\pratik"+i+".jpg");
FileHandler.copy(source, dest);







 

	}

	}}
