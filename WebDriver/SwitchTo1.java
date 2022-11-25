package WebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchTo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.leafground.com/pages/Window.html");
		Driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> Window = Driver.getWindowHandles();
		
		for(String st:Window) {
			Driver.switchTo().window(st);
		    if(Driver.getTitle().contains("Bond With Buttons")) {
		    break;
		}
		    
		}
	Driver.findElement(By.id("home")).click();
	}
	
}
