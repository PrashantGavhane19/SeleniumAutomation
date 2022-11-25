package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		String expectedclr = "rgb(24, 119, 242)";
		String actualclr = Driver.findElement(By.name("login")).getCssValue("background-color");
		//System.out.println(element);
		if(actualclr.contains(expectedclr)) {
		System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
