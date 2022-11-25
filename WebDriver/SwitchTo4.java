package WebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchTo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(10));
		Driver.get("http://www.leafground.com/pages/Window.html");
		String parentwindowID = Driver.getWindowHandle();
		Driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> allwindowID = Driver.getWindowHandles();
		allwindowID.remove(parentwindowID);
		for(String st: allwindowID) {
			Driver.switchTo().window(st);
			Driver.close();
		}
	}
}
