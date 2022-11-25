package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actiTime.com/login.do");	
    Dimension username = driver.findElement(By.id("username")).getSize();
    System.out.println("Height="+username.getHeight());
    System.out.println("Width="+username.getWidth());
    
	}

}
