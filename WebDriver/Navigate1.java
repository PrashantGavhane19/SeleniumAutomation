package WebDriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	public Navigate1() {
		
	}

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.get("https://licindia.in/");
    Navigation nav = driver.navigate();
    nav.back();
    nav.forward();
    nav.refresh();
    
	}

}
