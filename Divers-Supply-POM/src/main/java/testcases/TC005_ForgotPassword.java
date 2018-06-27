package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import wrappers.DiversSupply;

public class TC005_ForgotPassword extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Forgot Password";
		testDescription ="Forgot Password in Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC005";
	}	
	
	@Test(dataProvider="fetchData")
	public void forgotPassword(String eMailId) throws InterruptedException{
	new HomePage(driver, test)
	
	
	.clkSignInLink()
	.subscriptionPopup()
	.clickForgotPwdLink()
	.enterEmailId(eMailId)
	.clkSubmitBtnFP();
	
  }
}


	