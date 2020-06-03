package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRolePageObjects {
	
	@FindBy(linkText = "Admin")
	public static WebElement adminLink;
	
	@FindBy(linkText = "User Management")
	public static WebElement UserManagementLink;
	
	@FindBy(linkText = "Users")
	public static WebElement usersLink;
	
	@FindBy(id = "searchSystemUser_userName")
	public static WebElement usernameTextbox;
	
	@FindBy(id = "searchSystemUser_userType")
	public static WebElement userRoleDropdown;
	
	@FindBy(id = "searchSystemUser_status")
	public static WebElement userStatusDropdown;
	
	@FindBy(id = "searchBtn")
	public static WebElement searchButton;
	
	@FindBy(xpath = "(//table[@id='resultTable']//following::tbody/tr/td)[3]")
	public static WebElement userRoleValue;
	
	@FindBy(xpath = "(//table[@id='resultTable']//following::tbody/tr/td)[5]")
	public static WebElement userStatusValue;

}
