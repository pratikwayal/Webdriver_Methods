package POPUPS;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenInNewTabWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("TESTINg");
        element.submit();
        String str = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement element2 =      driver.findElement(By.partialLinkText("Software testing - Wikipedia"));
        element2.sendKeys(str);
        String str2 = driver.getWindowHandle();
        Set<String> str3 = driver.getWindowHandles();
        for(String obj: str3) {
        if(!obj.equals(str2)) {
            driver.switchTo().window(obj);
        }
        }

	}

}
