	package pages;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

	import wrappers.DiversSupply;

	public class CheckoutPage extends DiversSupply{
		
		public CheckoutPage(RemoteWebDriver driver, ExtentTest test) {
			this.driver = driver;
			this.test =test;
			
			if(!verifyTitle("Buy Dive Suits at Divers Supply")){
				reportStep("This is not a category page", "FAIL");
			}		
		}
		
		
		//---------------------------------------------------------------------C --------------------------------------------------------------------------
	
	   
	
	}