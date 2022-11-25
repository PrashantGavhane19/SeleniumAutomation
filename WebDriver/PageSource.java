package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageSource {

	public PageSource() {
	
	}
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
 	    ChromeDriver driver = new ChromeDriver();
 	    driver.get("https://demo.actitime.com/login.do"); 
		// Fourth method of web driver
 	    String actualpagesource = driver.getPageSource();
 	    
 	    String expectedpagesource ="actiTIME 2020 online";
 	    
 	    if(actualpagesource.contains(expectedpagesource))
 	    // Here except equal keyword we use contains keyword
 	    {
 	    	System.out.println("PASS:Text is Present");
	    }
	    else
	    {
	    	System.out.println("PASS:Text Is not Present");
 	    }
 	    
 	    
	}

}
