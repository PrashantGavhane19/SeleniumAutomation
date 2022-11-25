package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String expectedtag = "img";
	String actualtag = driver.findElement(By.xpath("//*[@alt='Google']")).getTagName();
	if (actualtag.equals(expectedtag)) {
		System.out.println("PASS");
	}else {
		System.out.println("FAIL");

	}
	}

}
