package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktest {

	
	 public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			//driver.findElement(By.linkText("Forgot your password?")).click();
            driver.findElement(By.partialLinkText("Forgot your")).click();
}
}

