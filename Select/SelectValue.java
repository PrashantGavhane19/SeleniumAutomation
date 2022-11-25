package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		//Driver.get("https://www.facebook.com/signup");
		Driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		WebElement element = Driver.findElement(By.name("Country"));//month
		Select s = new Select(element);
		List<WebElement> allmonths = s.getOptions();
		for(WebElement ele:allmonths) {
			s.selectByValue(ele.getAttribute("value"));
			System.out.println(ele.getAttribute("value"));
		}

	}

}
