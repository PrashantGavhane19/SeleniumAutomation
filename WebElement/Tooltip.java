package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com/login.do");		
		String expectedtooltip = "Do not select if this computer is shared";
		String actualtooltip = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		if(actualtooltip!=null)
		if (actualtooltip.equals(expectedtooltip)) {
			System.out.println("PASS:Tooltip is correct");}
		else {
			System.out.println("FAIL:Tooltip is not correct");
		     }else {
		    	 System.out.println("FAIL: actualtooltip attribute is not present");
		     }

	}

}
