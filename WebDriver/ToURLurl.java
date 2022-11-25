package WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToURLurl {

	public ToURLurl() {

	}

	public static void main(String[] args) throws MalformedURLException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.get("https://licindia.in/");	
	URL url = new URL("https://licindia.in/Products/Pension-Plans");
	driver.navigate().to("");

		}	

	}


