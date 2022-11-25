package WebElement;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GestPosition {

	public GestPosition() {
		
	}

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");	
    Point pt = driver.manage().window().getPosition();
    System.out.println("startX="+pt.getX());
    System.out.println("startY="+pt.getY());
	}
}
