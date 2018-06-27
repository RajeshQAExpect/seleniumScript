package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.P1_Login;
import wrappers.DiversSupply;

public class TC007_HomePage extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "HomePage";
		testDescription ="HomePage of Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC007";
	
}	
		
	@Test(dataProvider="fetchData")
	public void homePage(String email) throws InterruptedException {
	new HomePage(driver, test)
	
	
	.verifyMenu();
	
	
	
	
	}
}
