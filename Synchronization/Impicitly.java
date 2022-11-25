package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Impicitly {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.actiTime.com/login.do");	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String expectedtitle = "actiTIME - Enter Time-Track";
		wait.until(ExpectedConditions.titleIs(expectedtitle));
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("PASS: Title is same");
		}else {
			System.out.println("FAIL: Title is Different");
		
		}	   
	}
}


