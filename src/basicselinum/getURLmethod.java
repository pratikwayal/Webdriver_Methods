package basicselinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getURLmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		// https://www.amazon.in/ (output)


	}

}
