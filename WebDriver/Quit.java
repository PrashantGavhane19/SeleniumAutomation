package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public Quit() {
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/"); 
	   // Sixth Method of web Driver
	    driver.quit();
	}

}
