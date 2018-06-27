package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DiversSupply;

public class P3_MyAccountPage extends DiversSupply{

	public P3_MyAccountPage(RemoteWebDriver driver, ExtentTest test) {
	this.driver = driver;
	this.test=test;
	
	if(!verifyTitle("My Account")){
		reportStep("This is not My Account Page", "FAIL");
	
	}
}
	
 public HomePage clickHomeLink(){
	 clickByXpathNoSnap("(//a[@title='Ds Logo'])[1]");
	 return new HomePage(driver, test);
 }
	
 /*public ProductPage clickAddToCart(){
		clickByXpathNoSnap("//button[@id='product-addtocart-button']");
		return new ProductPage(driver, test) ;
	}*/
 
}
	