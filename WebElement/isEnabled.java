package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actiTime.com/login.do");
	//WebElement element = driver.findElement(By.id("Email"));
	WebElement element = driver.findElement(By.id("username"));	
	if(element.isEnabled()) {
		System.out.println("PASS:textfield is enabled");
	}else {
		System.out.println("FAIL:textfield is not enabled");
	}

 }

}
