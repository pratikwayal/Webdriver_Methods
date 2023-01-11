package basicselinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Corss_browser_xpaths {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver M = new ChromeDriver();

//	System.setProperty("webdriver.gecko.driver","C:\\browser\\geckodriver.exe");
//	WebDriver M = new FirefoxDriver();
//		
//		System.setProperty("webdriver.edge.driver","C:\\browser\\msedgedriver.exe");
//		WebDriver M = new EdgeDriver();
		
		M.get("https://www.nike.com/");
		M.manage().window().maximize();
//		Thread.sleep(3000);
//		M.navigate().back();
//		Thread.sleep(4000);
//		M.navigate().forward();
//		Thread.sleep(5000);
//		M.navigate().refresh();
	
		
		
	}

}
