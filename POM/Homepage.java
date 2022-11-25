package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
		 @FindBy(id = "logoutLink")
		   private WebElement logoutlink;
		 
		 public Homepage(WebDriver driver) {
				PageFactory.initElements(driver, this );
	 
		 }

		public WebElement getLogoutlink() {
			return logoutlink;
		}

		public void setLogoutlink(WebElement logoutlink) {
			this.logoutlink = logoutlink;
		}
		public Loginpage Homepage() {
			logoutlink.click();
			return new Loginpage(driver);
		}
		 
	}


