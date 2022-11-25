package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		/*  EXCEPTION 
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(null); --> java.lang.IllegalArgumentException
		//driver.findElement(By.xpath("//div[text()='Login ']")).sendKeys(Keys.ENTER);  --> org.openqa.selenium.ElementNotInteractableException
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        //driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("loginButton")).sendKeys(Keys.ENTER);*/
	}

}