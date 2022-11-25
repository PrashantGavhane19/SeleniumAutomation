package WebDriver;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class manage {
	/*Manage--> 1)Windows Related Operations
	            2)Timeouts Related Operations
                3)Coockies Related Operations*/

	public manage() {
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();		

	}

}
