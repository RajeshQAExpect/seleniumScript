package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DiversSupply;

public class P2_CreateAnAccount extends DiversSupply{

	public P2_CreateAnAccount(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
	if (!verifyTitle("Create New Customer Account")) {
		reportStep("This is not the Create Account Page", "Fail");
		
	}
	}		
	
//------------------------------------------------------------Subscription Popup----------------------------------------------	
	public P2_CreateAnAccount subscriptionPopup() throws InterruptedException{
		WebElement subPopup=driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
		WebElement cloIcon = driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
		
		if (subPopup.isDisplayed()) {
			cloIcon.click();
			} else {
				System.out.println("No Popup has displayed");
			}
		Thread.sleep(3000);
		return this;
	}
	
//---------------------------------------------------------------------------------------------------------------------------------	
	public P2_CreateAnAccount enterFname(String fName) throws InterruptedException{
		Thread.sleep(3000);
		enterByXpath("//input[@id='firstname']", fName);
		return this;
	}
	
	
	public P2_CreateAnAccount enterLname(String lName){
		enterByXpath("//input[@id='lastname']", lName);
		return this;
	}
	
	public P2_CreateAnAccount enterEmailAdd(String eMailId){
		enterByXpath("//input[@id='email_address']", eMailId);
		return this;
	}
	
	public P2_CreateAnAccount clickCheckbox(){
		 clickByXpath("//input[@id='is_subscribed']");
		return this;
	}
	
	public P2_CreateAnAccount enterPwd(String password){
		enterByXpath("//input[@id='password']", password);
		return this;
	}
	
	public P2_CreateAnAccount enterConPwd(String confirmPassword){
		enterByXpath("//input[@id='password-confirmation']", confirmPassword);
		return this;
	}
	
	public P2_CreateAnAccount checkboxIsSelected(){
		WebElement chkBox = driver.findElement(By.xpath("//input[@name='persistent_remember_me']"));
		if (chkBox.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}
		return this;
			
		}
	  
	
	public P3_MyAccountPage clickSubmitCA() throws InterruptedException{
		clickByXpath("//button[@class='action submit primary']");
		Thread.sleep(3000);
		return new P3_MyAccountPage(driver,test);
	}
	
	}

	
	
	
