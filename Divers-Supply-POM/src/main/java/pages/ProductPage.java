package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DiversSupply;


public class ProductPage extends DiversSupply{
		
		public ProductPage(RemoteWebDriver driver, ExtentTest test) {
			this.driver = driver;
			this.test =test;
			
			if(!verifyTitle("ScubaPro Mesh Sack 2016 - Bags - Scuba")){
				reportStep("This is not a product page", "FAIL");
			}		
		}

	/*public ProductPage selectColor(){
		
		WebElement clrdrop = driver.findElement(By.id("attribute92"));
		Select clrdp = new Select(clrdrop);
		clrdp.selectByIndex(1);
		return this;
	}*/
		


		//------------------------------------------------------------------------------------------------------------------------------------------------

		public ProductPage selectStyle(){
			clickByXpath("//select[@id='attribute177']");
			/*WebElement styleDD = driver.findElement(By.xpath("//select[@id='attribute177']"));
			Select clkStyleDD = new Select(styleDD);
			clkStyleDD.selectByVisibleText("Mens");*/
			
			return this;
		}
//------------------------------------------------------------------------------------------------------------------------------------------------
		public ProductPage scrollDownPDP(){
			JavascriptExecutor sDown = (JavascriptExecutor) driver;
			sDown.executeScript("window.scrollBy(0,1000)");
			return this;
}

		//------------------------------------------------------------------------------------------------------------------------------------------------

		
		public ProductPage clkImage(){
	
			clickByClassName("attributepages-parent-link");
			return this;
}
		
		public ProductPage refreshPDP(){
			pageRefresh();
			return this;
		}
	
		
		public ProductPage clkWriteReview(){
			clickByXpath("//*[contains(text(),' Write a review ')]");
			return this;
		}

		//--------------------------------------------------------------------------------------------------------------------

		
}

