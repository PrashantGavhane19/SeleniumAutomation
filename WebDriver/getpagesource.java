package WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getpagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(10));
		Driver.get("https://demo.actitime.com/login.do");
		String expectedpagesource = "Please identify yourself";
		String actualpagesources = Driver.getPageSource();
		//String element = Driver.getPageSource();
		//System.out.println(element);
		if (actualpagesources.equals(expectedpagesource)) {
			System.out.println("PASS:Element is Present ");
		     } else 
		         {
				System.out.println("FAIL:Element is not Present ");
		}
	}
}