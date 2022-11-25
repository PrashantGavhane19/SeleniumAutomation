package WebElement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Dimension dim = driver.manage().window().getSize();
	//Dimension--> Its is concrete class of selenium package
	System.out.println("width="+dim.getWidth());
	System.out.println("height"+dim.getHeight());
	}


}
