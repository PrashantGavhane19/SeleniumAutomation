package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://demo.actiTime.com/login.do");
    String element = driver.findElement(By.id("username")).getAttribute("type");
    System.out.println(element);
    //String elements = driver.findElement(By.id("username")).getAttribute("placeholder");
	//System.out.println(elements.isEmpty());
	/*String element = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
    System.out.println(element);*/
	 
 }
}

