package Popup;
//Hidden Division Popups 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(10));
		Driver.get("https://www.easemytrip.com/");
		Driver.findElement(By.id("ddate")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse= (JavascriptExecutor) Driver;
		Driver.findElement(By.id("trd_5_15/07/2022")).click();
	}

}
