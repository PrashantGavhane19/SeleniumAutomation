package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
