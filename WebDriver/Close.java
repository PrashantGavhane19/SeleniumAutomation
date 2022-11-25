package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public Close() {
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/"); 
	   // fifth Method of web Driver
	    driver.close();
	}

	}


