package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actiTime.com/");
	/*String expectedtext = "Please identify yourself";
	String actualtext = driver.findElement(By.id("headerContainer")).getText();
	
	if (actualtext.equals(expectedtext)) {
		System.out.println("PASS:Text is correct");}
	else {
		System.out.println("FAIL:Text is not correct");
	}*/
	
	String element = driver.findElement(By.id("headerContainer")).getText();
	System.out.println(element);
	}

}
