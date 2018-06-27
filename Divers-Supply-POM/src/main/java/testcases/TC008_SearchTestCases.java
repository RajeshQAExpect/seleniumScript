package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import pages.Search;
import wrappers.DiversSupply;

public class TC008_SearchTestCases extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Search";
		testDescription ="Product Search of Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC008";
	
	
}
	
	@Test(dataProvider="fetchData")
	public void homepage(String sKeyword) throws InterruptedException{
	new HomePage(driver, test) 
	
	
    .enterSearchKeyword(sKeyword)
	.clickAllDeptLink()
	.subscriptionPopupSearch();
	
  }
}
