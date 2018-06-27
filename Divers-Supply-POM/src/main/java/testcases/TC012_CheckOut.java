package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import pages.Search;
import pages.CategoryPage;
import pages.SubCategoryPage;
import wrappers.DiversSupply;

public class TC012_CheckOut extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Checkout ";
		testDescription ="Checkout of divers-supply";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC001";
	
	
}
	
	@Test(dataProvider="fetchData")
	public void homepage(String eMailId, String pwdLogin) throws InterruptedException{
	new HomePage(driver, test) 
	
	
	.clkSignInLink()
	.subscriptionPopup()
	.enterEmailIdLogin(eMailId)
	.enterPasswordLogin(pwdLogin)
	.clkSignInButton()
	.clkCartIcon()
	.clkEditBtn();
//	.clkCheckoutBtn();
	
	
	
}
}