package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.commonFunctions;
import pageObjects.DashboardPageObjects;

public class PendingLeaveRequestTest extends commonFunctions {
	
	@Test
	public void verifyPendingLeaveRequest() {		
		
		PageFactory.initElements(driver, DashboardPageObjects.class);
		String actualMessage = DashboardPageObjects.pendingLeaveRequest.getText();
		
		Assert.assertEquals(actualMessage, "No Records are Available");
		System.out.println(actualMessage);
	}

}
