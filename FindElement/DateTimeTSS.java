package FindElement;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateTimeTSS {

public static void main(String[] args) throws InterruptedException, Exception {
LocalDateTime ldt = LocalDateTime.now();
String timestamp = (ldt.toString().replace(':','-')); 
 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
 ChromeDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
 driver.get("https://www.Google.com/doodles");	
 TakesScreenshot ts = (TakesScreenshot) driver;        
File tempfile = ts.getScreenshotAs(OutputType.FILE);		
File destfile = new File("./errorshot/google"+timestamp+".png");
FileUtils.copyFile(tempfile, destfile);
	}

}
