package pages;


import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DiversSupply;

public class P3_ForgotPassword extends DiversSupply{
	
	public P3_ForgotPassword(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Forgot Your Password")){
			reportStep("This is not Forgot Password Page", "FAIL");
		}		
	}
	
	public P3_ForgotPassword enterEmailId(String eMailId) throws InterruptedException{
		enterByXpath("//input[@id='email_address']", eMailId);
		Thread.sleep(2000);
		return this;
	}
	
	
	public P3_ForgotPassword clkSubmitBtnFP(){
		clickByXpath("//*[contains(text(),'Reset My Password')]");
		return this;
	}

	public P3_ForgotPassword verifyFPFailed(String vFPText){
		verifyTextById("advice-required-entry-email_address", vFPText);
		return this;
	}
}

