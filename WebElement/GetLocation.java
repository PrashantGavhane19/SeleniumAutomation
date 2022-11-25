package WebElement;

import java.awt.Point;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com/login.do");	
	    org.openqa.selenium.Point username = driver.findElement(By.id("username")).getLocation();
	    System.out.println("Start X="+username.getX());
	    System.out.println(" Start Y="+username.getY());
	    		

	}

}
