package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");		
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	// Xpath By Attribute - 
	
	//img[@alt='Top Offers']
	//img[@alt='Grocery']
	//img[@alt='Mobiles']
	//img[@alt='Fashion']
	//img[@alt='Electronics']
	//img[@alt='Home']
	//img[@alt='Appliances']
	//img[@alt='Travel']
	//img[@alt='Toys,Beauty & More']
	
	// Xpath By Text() -
	
	//div[text()='Top Offers']
	//div[text()='Grocery']
	//div[text()='Mobiles']
	//div[text()='Fashion']
	//div[text()='Electronics']
	//div[text()='Home']
	//div[text()='Appliances']
	//div[text()='Travel']
	//div[text()='Toys,Beauty & More']
	//driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[3]/a/div/div/img")).click();
	driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[6]/a/div/div/img")).click();
	
	}

}
