package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public classname() {
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		WebElement ele = driver.findElement(By.name("pwd"));
		ele.sendKeys("Qspider");
		
		driver.findElement(By.className("textField")).sendKeys("prashant");		

	}

}
