package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	@FindBy(id = "txtUsername")
	public static WebElement usernameTextbox;
	
	@FindBy(id = "txtPassword")
	public static WebElement passwordTextbox;
	
	@FindBy(id = "btnLogin")
	public static WebElement loginButton;

}
