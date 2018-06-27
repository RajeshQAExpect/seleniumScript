package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.P2_CreateAnAccount;
import pages.HomePage;
import pages.P1_Login;
import wrappers.DiversSupply;

public class TC003_Registration extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Registration";
		testDescription ="Registration in Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC003";
	}	
	
	@Test(dataProvider="fetchData")
	public void registration(String fName, String lName, String eMailId, String password, String confirmPassword) throws InterruptedException{
	//String xpathVal;
	new HomePage(driver, test)
	

	
	.clkCreateAnAccountLink()
	.subscriptionPopup()
	.enterFname(fName)
	.enterLname(lName)
	.clickCheckbox()
	.enterEmailAdd(eMailId)
	.enterPwd(password)
	.enterConPwd(confirmPassword)
	.clickSubmitCA();
}
}


	