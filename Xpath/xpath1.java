package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");	
	driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("span[not(@class='hDTmm5') and text()='Become a Seller']")).click();

	
	/*span[text()='Become a Seller']
	- div[text()='Mobiles']
	- button[class='_2KpZ6l _2doB4z']
	- nobr[text()='actiTIME 2020 Online']
	* Syntax For Contains-TagName[contains(text(),'textValue')]
	                     - nobr[contains(text(),'actiTIME 2020 Online')]
	 Syntax-
	AND ,OR ,NOT
	1) And - //span[not(@class='hDTmm5') and text()='Become a Seller'] 
	          
	2)
	3)
	*/
	}

}
