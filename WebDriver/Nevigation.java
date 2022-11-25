package WebDriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigation {

	public Nevigation() {
	
	}

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.get("https://licindia.in/");	
    driver.navigate().to("https://licindia.in/Products/Insurance-Plan");
    Navigation nav = driver.navigate();
    nav.refresh();
	}

}
