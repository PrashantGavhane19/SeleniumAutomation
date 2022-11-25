package WebElement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public SetSize() {
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//Dimension dim = new Dimension(500,300);
		Dimension targetSize = new Dimension(500,300);
		//driver.manage().window().setSize(dim);
		driver.manage().window().setSize(targetSize);
	}
}
		



