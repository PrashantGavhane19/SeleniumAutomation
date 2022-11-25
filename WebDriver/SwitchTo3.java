package WebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchTo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(10));
		Driver.get("http://www.leafground.com/pages/Window.html");
		Driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> Window = Driver.getWindowHandles();
		int count=0;
		for(String st:Window) {
			count++;
		Driver.switchTo().window(st);
		if(count>1) {
			Driver.close();
		  }
	  }
   }
 }
