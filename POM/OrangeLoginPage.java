package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage {
	public WebDriver driver;

		   @FindBy(id = "txtUsername")
		   private WebElement usernameTextfield;
		   
		   @FindBy(name = "txtPassword")
		   private WebElement passwordTextField;
		   
		   @FindBy(id = "btnLogin")
		   private WebElement loginButton;
		   
		   public OrangeLoginPage(WebDriver driver) {
			   this.driver = driver;
			PageFactory.initElements(driver, this);
		   
		   }

		public WebElement getUsernameTextfield() {
			return usernameTextfield;
		}

		public void setUsernameTextfield(WebElement usernameTextfield) {
			this.usernameTextfield = usernameTextfield;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public void setPasswordTextField(WebElement passwordTextField) {
			this.passwordTextField = passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public void setLoginButton(WebElement loginButton) {
			this.loginButton = loginButton;
		}
		public OrangeHomePage LoginPage1(String userdata,String password) {
			usernameTextfield.sendKeys(userdata);
			passwordTextField.sendKeys(password);
			loginButton.click();
			return new OrangeHomePage(driver);
		}
	}


