package FindElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenshot {

	public static void main(String[] args) throws InterruptedException, Exception {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://www.Google.com/doodles");	
	TakesScreenshot ts = (TakesScreenshot) driver;        //Downcasting
	File tempfile = ts.getScreenshotAs(OutputType.FILE); //Calling Method getScreenshotAs
	/*System.out.println(tempfile.getAbsolutePath());   // Passing Argument  
	Thread.sleep(90000);*/
	File destfile = new File("./errorshot/google.png"); //Create A Folder errorshot in project then take a destfile and pass any name it should be ended in .png/jpg form 
	//tempfile.renameTo(destfile);                      // Rename file tempfile to destfile 
	FileUtils.copyFile(tempfile, destfile);            //goto https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0 latest version (jar 319KB) and past in jars folder build a path and then type FileUtils.copy and run if Exception IO 
	LocalDateTime ldt = LocalDateTime.now();          //Display to Date And Time use java class LocalDateTime
	String timestamp = (ldt.toString().replace(':','-')); // Replace (:) with (-) Format of Datetime
	File destfile1 = new File("./errorshot/google"+timestamp+".png");
	}
}
