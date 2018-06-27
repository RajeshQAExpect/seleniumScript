package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.P2_CreateAnAccount;
import pages.HomePage;
import pages.P1_Login;
import wrappers.DiversSupply;

public class TC004_RegistrationNegative extends DiversSupply {

	@BeforeClass
	public void setValue(){
		testCaseName = "Registration";
		testDescription ="Registration in Divers-Supply.com";
		category = "Smoke Testing";
		authors = "Rajesh";
		browserName = "Chrome";
		dataSheetName = "TC004";
	}	
	
	@Test(dataProvider="fetchData")
	public void registration(String fName, String lName, String eMailId, String password, String confirmPassword, String errMessage) throws InterruptedException{
	//String xpathVal;
	new HomePage(driver, test)
	
	.popUpHandling()
	.clickLoginLink()
	.subscriptionPopup()
	.clickCreateAccountBtn() 
	.enterFname(fName)
	.enterLname(lName)
	.enterEmailAdd(eMailId)
	.clickCheckbox()
	.enterPwd(password)
	.enterConPwd(confirmPassword)
	.checkboxIsSelected();
	//.clickSubmitCA();
}
}


	