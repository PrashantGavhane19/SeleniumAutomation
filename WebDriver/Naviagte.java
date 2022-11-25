package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagte {

	public Naviagte() {
	
	}

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/"); 
	    driver.get("https://licindia.in/");
	    driver.get("https://licindia.in/Home-(1)/Customer-Portal");
	    //driver.navigate().back();
	    //driver.navigate().forward();
	    //driver.navigate().refresh();(driver.-->reference variable)
	    //.navigate()--> nonstatic method
	    
	   // A class which is declared with the abstract keyword is
	    //known as an abstract class in Java
	
	    //A derived class that provides the basic implementations for 
	    //all of the methods that are not already implemented in the base class 
	    //is known as a concrete class.
	    }

	}

