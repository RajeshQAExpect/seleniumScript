package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DiversSupply;

public class Search extends DiversSupply{
	
	public Search(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Search results for: 'swim caps'")){
			reportStep("This is not search results page", "FAIL");
		}		
	}
	

	
//-----------------------------------------------------------Subscription Popup--------------------------------------------------------------
	public Search subscriptionPopupSearch(){
		WebElement subPopupSear = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		WebElement cloIconSear =  driver.findElement(By.xpath("//button[@aria-label='Close']"));
		
		if (subPopupSear.isDisplayed()) {
			System.out.println("Pop is displayed");
			cloIconSear.click();
			System.out.println("Pop up is closed");
			} else {
				System.out.println("No Popup has displayed");
			}
		return this;
	}
	
//-----------------------------------------------------------------------------------------------------------------------------------	
	public Search clickCloseIcon() {
		clickByXpath("//button[@class='targetbay_close targetbay_close_center']");
	return this;
}
	
//-----------------------------------------------------------------------------------------------------------------------------------
	
	
 public Search scrollDownSearchPge(){
	 JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
	 //scrollDown.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 scrollDown.executeScript("window.scrollBy(0,1000)");
	 return this;
 }
	
}

