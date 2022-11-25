package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
		WebElement element = driver.findElement(By.id("add"));
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();

		/*driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement element = driver.findElement(By.xpath("//div[text() ='More']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		//actions.perform();
		driver.findElement(By.xpath("//div[text() ='Download App']")).click();*/
	}

}
