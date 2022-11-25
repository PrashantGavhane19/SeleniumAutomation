package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Cssvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		//String expectedvalue = "#1877f2";
		String actualvalue = Driver.findElement(By.name("login")).getCssValue("background-color");
		System.out.println(actualvalue);

		/*String actualhexavalue = Color.fromString(actualvalue).asHex();
		if(actualhexavalue.contains(expectedvalue)) {
			System.out.println("Pass:Value is Same");
			}else {
				System.out.println("Fail: Value is not same");
			}*/
		
	}

}
