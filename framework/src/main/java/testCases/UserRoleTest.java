package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.commonFunctions;
import pageObjects.UserRolePageObjects;

public class UserRoleTest extends commonFunctions {

	public void moveToUsersPage() {
		
		Actions mouseAction = new Actions(driver);
		mouseAction.moveToElement(UserRolePageObjects.adminLink);
		mouseAction.moveToElement(UserRolePageObjects.UserManagementLink);
		mouseAction.moveToElement(UserRolePageObjects.usersLink);
		mouseAction.click().build().perform();

	}

	public void selectUserRole() {

		Select selectRole = new Select(UserRolePageObjects.userRoleDropdown);
		selectRole.selectByIndex(1);

	}

	public void selectUserStatus() {

		Select selectStatus = new Select(UserRolePageObjects.userStatusDropdown);
		selectStatus.selectByIndex(1);

	}

	@Test
	public void verifyUserRole() {

		PageFactory.initElements(driver, UserRolePageObjects.class);
		moveToUsersPage();
		selectUserRole();
		selectUserStatus();
		
		UserRolePageObjects.searchButton.click();
		
		String actualRole = UserRolePageObjects.userRoleValue.getText();
		String actualStatus = UserRolePageObjects.userStatusValue.getText();
		
		Assert.assertEquals(actualRole, "Admin");
		Assert.assertEquals(actualStatus, "Enabled");

	}

}
