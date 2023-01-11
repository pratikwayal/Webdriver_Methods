package basicselinum;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SETSIZE_SETPOSITION {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		Dimension D = new Dimension(300,400);
		driver.manage().window().setSize(D);
		Thread.sleep(4000);
		Point P = new Point(300,400);
		driver.manage().window().setPosition(P);
		
		
		
		
		
		
		
	}

}
