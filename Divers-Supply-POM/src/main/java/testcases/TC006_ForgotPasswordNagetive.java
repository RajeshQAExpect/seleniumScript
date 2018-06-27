package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import wrappers.DiversSupply;

public class TC006_ForgotPasswordNagetive extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Forgot Password";
		testDescription ="Forgot Password in Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC006";
	}	
	
	@Test(dataProvider="fetchData")
	public void forgotPassword(String eMailId, String text) throws InterruptedException{
	new HomePage(driver, test)
	
	.popUpHandling()
	.clickLoginLink()
	.subscriptionPopup()
	.clickForgotPwdLink()
	.enterEmailId(eMailId)
	.clkSubmitBtnFP();
	
  }
}


	