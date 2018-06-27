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

public class TC011_Product extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Product Page";
		testDescription ="Product Page of divers-supply";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC007";
	
	
}
	
	@Test(dataProvider="fetchData")
	public void homepage(String eMailId) throws InterruptedException{
	new HomePage(driver, test) 
	
	.clkDiveSuites()
	.subscriptionPopup()
	.scrollDownSC()
	.quickView()
	.switchToFramePopUp()
	.sizeDropDown()
	.clkGoToProductBtn()
	.refreshPDP()
	.clkWriteReview();
	
}
}