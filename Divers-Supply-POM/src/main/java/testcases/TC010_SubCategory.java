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

public class TC010_SubCategory extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Category Page";
		testDescription ="Category Page of divers-supply";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC007";
	
	
}
	
	@Test(dataProvider="fetchData")
	public void homepage(String eMailId) throws InterruptedException{
	new HomePage(driver, test) 
	
	//	.subscriptionPopup()
		.clkDiveSuites()
		.scrollDownSC()
		.subscriptionPopup()
		.quickView()
		.switchToFramePopUp()
		.sizeDropDown()
		.clkAddToCartBtn()
		.clkCloseIconPDPPopup();
		
		
	

}
}