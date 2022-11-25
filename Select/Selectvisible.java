package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectvisible {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/signup");
		WebElement element = Driver.findElement(By.id("month"));// Day / year Replace with month for the month list print.
		Select s = new Select(element);
		//s.selectByVisibleText("Jan"); //it Visible to select month
		List<WebElement> allmonths = s.getOptions();
		for(WebElement ele:allmonths) {
			s.selectByVisibleText(ele.getText());
			//System.out.println(ele.isSelected());
			System.out.println(ele.getText());
			if(ele.isSelected()) {
				System.out.println("Pass:"+ele.getText()+"- Is Selected");
			}
		}
	}

}
