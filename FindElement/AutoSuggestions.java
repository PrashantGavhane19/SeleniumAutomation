package FindElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		for(WebElement ele:autosuggestions) {
			System.out.println(ele.getText());
		}
		int count = autosuggestions.size();
		System.out.println(count);
			if(count<=10) {
				System.out.println("Pass: Count Is Correct");
			}else {
				System.out.println("Fail: Count Is InCorrect");
			}
		}
	}


