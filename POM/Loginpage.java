package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver driver;
   @FindBy(id = "username")
   private WebElement usernameTextfield;
   
   @FindBy(name = "pwd")
   private WebElement passwordTextField;
   
   @FindBy(id = "loginButton")
   private WebElement loginButton;

   
   public Loginpage(WebDriver driver) {
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
	
	public Homepage Loginpage(String userdata,String password) {
		usernameTextfield.sendKeys(userdata);
		passwordTextField.sendKeys(password);
		loginButton.click();
		return new Homepage(driver);
	}
}


