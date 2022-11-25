package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//System.out.println("Current URL is-"+driver.getCurrentUrl());
		WebElement element = driver.findElement(By.id("username"));
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.navigate().refresh();
		//element.sendKeys("manager");
		element.sendKeys("admin");
		//driver.findElement(By.partialLinkText("Login")).click();
	}

}
