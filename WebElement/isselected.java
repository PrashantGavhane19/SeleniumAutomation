package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com/login.do");
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));		
		if(element.isSelected()) {
			System.out.println("TRUE:Checkbox is selected");
		}else {
			System.out.println("FALSE:Checkbox is not selected");
		}
		element.click();
		if(element.isSelected()) {
			System.out.println("TRUE:Checkbox is selected");
		}else {
			System.out.println("FALSE:Checkbox is not selected");
		}
	}

}
