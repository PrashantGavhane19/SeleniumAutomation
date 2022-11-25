package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actiTime.com/login.do");		
	WebElement element = driver.findElement(By.id("username"));	
    if(element.isDisplayed()) {
    System.out.println("PASS:Username is displayed");
	}
    else 
	{
		System.out.println("FAIL:Username is Not displayed");
    }
 }

}
