package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testgettext {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actiTime.com/login.do");
	
	/*String element = driver.findElement(By.id("demoCredentials")).getText();
	System.out.println(element);*/
	
	String elements = driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following-sibling::td[contains(text(),'Username: ')]/..")).getText();
	System.out.println(elements);
	
	}

}
