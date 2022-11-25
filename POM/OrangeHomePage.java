package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHomePage {
	public WebDriver driver;
@FindBy(xpath = "//a[text()='Logout']")
	   private WebElement logoutlink;
	 public OrangeHomePage(WebDriver driver) {
			PageFactory.initElements(driver, this );

	 }
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public void setLogoutlink(WebElement logoutlink) {
		this.logoutlink = logoutlink;
	}

	
}
