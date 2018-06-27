package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import wrappers.DiversSupply;

public class TC001_LoginLogOut extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Login & LogOut";
		testDescription ="Login and Logout of Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC001";
	}	
	
	@Test(dataProvider="fetchData")
	public void homepage(String emailId, String pwdLogin) throws InterruptedException{
	new HomePage(driver, test)

	
	
	.clkSignInLink()
	.subscriptionPopup()
	.enterEmailIdLogin(emailId)
	.enterPasswordLogin(pwdLogin)
	.clkSignInButton();
	
}
}


	