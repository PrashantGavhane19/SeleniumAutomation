package FindElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	for(WebElement ele:allLinks) {
		System.out.println(ele.getText());
		String text = ele.getText();
		if(!text.isEmpty()) {
			//System.out.println(text);
		}
	}
 }
}
