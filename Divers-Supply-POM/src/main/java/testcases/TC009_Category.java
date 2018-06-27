package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import pages.Search;
import pages.CategoryPage;
import wrappers.DiversSupply;

public class TC009_Category extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Category Page";
		testDescription ="Category Page of divers-supply";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC001";
	
	
}
	
	@Test(dataProvider="fetchData")
	public void homePage(String emailId, String pwdLogin) throws InterruptedException{
	new HomePage(driver, test) 
	
	
	.clkSignInLink()
	.subscriptionPopup()
	.enterEmailIdLogin(emailId)
	.enterPasswordLogin(pwdLogin)
	.clkSignInButton()
	//.clkLogo()
	.mHoverSwim()
	.clkSwimCaps();
	
	
	
	
	
	
  }
}
