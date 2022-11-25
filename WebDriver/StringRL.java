package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class StringRL {

	public StringRL() {
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/"); 
	   String actualurl ="https://www.google.com/";
	   String expectedurl = "https://www.google.com/";
	    if(actualurl.equals(expectedurl)) {
	    	System.out.println("PASS:url is correct");
	    }
	    else
	    {
	    	System.out.println("PASS:url Is not correct");
	}

	}
	}
