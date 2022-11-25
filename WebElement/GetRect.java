package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com/login.do");	
	    Rectangle username = driver.findElement(By.id("username")).getRect();
	    System.out.println("Height="+username.getHeight());
	    System.out.println("Width="+username.getWidth());
	    
	    System.out.println("Start X="+username.getX());
	    System.out.println(" Start Y="+username.getY());
	    

	}

}
