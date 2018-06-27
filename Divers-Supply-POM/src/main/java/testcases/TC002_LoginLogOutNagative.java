package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import pages.ProductPage;
import wrappers.DiversSupply;

public class TC002_LoginLogOutNagative extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Login & LogOut For Nagetive";
		testDescription ="Login and Logout of Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC002";
	}	
	
	@Test(dataProvider="fetchData")
	public void loginLogout(String uName, String pwd) throws InterruptedException{
	new HomePage(driver, test)

	.popUpHandling()
	.clickLoginLink()
	.subscriptionPopup()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLoginBtn();
	
	
}
}


	