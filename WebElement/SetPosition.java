package WebElement;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public SetPosition() {
	
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Point targetposition = new Point(500,300);
		driver.manage().window().setPosition(targetposition);
		

	}

}
