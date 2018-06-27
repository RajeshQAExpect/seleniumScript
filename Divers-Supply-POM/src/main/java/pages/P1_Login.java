package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DiversSupply;

public class P1_Login extends DiversSupply{

		public P1_Login(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test =test;
			
			if(!verifyTitle("Customer Login")){
				reportStep("This is not Login Page", "FAIL");	
			}		
		}

//-----------------------------------------------------subscription Popup------------------------------------------------------------		
		public P1_Login subscriptionPopup(){
			WebElement subPopup=driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
			WebElement cloIcon = driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
			
			if (subPopup.isDisplayed()) {
				cloIcon.click();
				} else {
					System.out.println("No Popup has displayed");
				}
			return this;
		}
		
//-------------------------------------------------------------Login-------------------------------------------------
	
		public P1_Login enterEmailIdLogin(String emailId){
			enterByXpath("(//input[@id='email'])[1]", emailId);
			return this;
		}
		
		public P1_Login enterPasswordLogin(String pwdLogin){
			enterByXpath("(//input[@id='pass'])[1]", pwdLogin);
			return this;
		}
			
		
		public HomePage clkSignInButton(){
			clickByXpath("(//button[@id='send2'])[1]");
			return new HomePage(driver, test);
		}
		
//-------------------------------------------------Home Link-----------------------------------------------------------		
		
	
		public HomePage clkLogo() throws InterruptedException{
			clickByXpath("//img[@alt='Ds Logo']");
			Thread.sleep(5000);
			return new HomePage(driver, test);
		}
//-----------------------------------------------------------------------------------------------------------------		
		
		
		public P2_CreateAnAccount clickCreateAccountBtn(){
			clickByXpath("//button[@title='Create an Account']");
			return new  P2_CreateAnAccount(driver, test);
		}
		
		public P1_Login enterUserName(String uName){
		enterByName("login[username]", uName);
		return this;
		}	
					
		public P1_Login enterPassword(String uPWD){
		enterByName("login[password]", uPWD);
		return this;	
		}
	
		public P3_MyAccountPage clickLoginBtn(){
			clickById("send2");
			return new P3_MyAccountPage(driver, test);
		}
		
	/*	public Login verifyLoginFailed(String text){
			verifyTextContainsByXpath("xpath", text);
		return this;
		}*/
			
		
//-------------------------------Forgot Password---------------------------------------------------
		public P3_ForgotPassword clickForgotPwdLink() throws InterruptedException{
			clickByXpath("(//*[contains(text(),'Forgot Your Password?')])[1]");
			Thread.sleep(5000);
			return new P3_ForgotPassword(driver, test);
		}
		

//--------------------------------Search---------------------------------------------------------
		
		public HomePage enterSKeyword(String sKeyword){
			enterByXpath("(//span[@id='algolia-autocomplete-tt'])[1]", sKeyword);
			return new HomePage(driver, test);
		}
		
		public P1_Login cPageRefresh(){
			driver.navigate().refresh();
			return this;
		}
		
		
		
		
}
		
	


