package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.actitime.com/login.do");
		Driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String element = Driver.findElement(By.xpath("//span[(@class='errormsg')and not(@id='errorSpan')]")).getCssValue("color");
		System.out.println(element);
	}

}
