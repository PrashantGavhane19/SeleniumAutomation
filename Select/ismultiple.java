package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/signup");
		WebElement element = Driver.findElement(By.id("month"));
		Select s = new Select(element);
		if(s.isMultiple()) {
			System.out.println("Pass: it a multiple");
		}else {
			System.out.println("Fail: it a not multiple");

		}
	}

}
