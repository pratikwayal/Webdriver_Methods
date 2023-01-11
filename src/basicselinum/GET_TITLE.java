package basicselinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class GET_TITLE {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	String title =driver.getTitle();
	System.out.println(title);
	//C:\\browser\\chromedriver.exe
	String exptitle ="Instagram";
	if (title.equalsIgnoreCase(exptitle)) {
		System.out.println("navigate to right page");
		}
	else {
		System.out.println("navigate to wrong page");
	}
			
	
}
}
