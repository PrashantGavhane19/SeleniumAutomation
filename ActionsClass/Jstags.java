package ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jstags {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://collegedunia.com/college/2868-mallamma-marimallappa-womens-arts-and-commerce-college-mysore");
		Actions actions = new Actions(driver);
		List<WebElement> elements = driver.findElements(By.xpath("//nav[@class='jsx-1813360254 tab-wrapper position-relative  overflow-x-hidden bg-white false']//a"));
		actions.keyDown(Keys.CONTROL);
		for(WebElement ele:elements) {
		actions.click(ele);
		actions.perform();
		}
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		
	}

}
