package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class actualtitle {

	public actualtitle() {
	
	}

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/"); 
    String actualtitle = driver.getTitle();  // to get the title for google. 
    //in this method enter 1st right side and then left side path
    String expectedtitle = "Google"; 
    if(actualtitle.equals(expectedtitle)) {
    	System.out.println("PASS:Title is correct");
    }
    else
    {
    	System.out.println("PASS:Title Is not correct");
    }
    }
	}


