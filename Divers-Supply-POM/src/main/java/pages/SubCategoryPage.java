	package pages;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

	import wrappers.DiversSupply;

	public class SubCategoryPage extends DiversSupply{
		
		public SubCategoryPage(RemoteWebDriver driver, ExtentTest test) {
			this.driver = driver;
			this.test =test;
			
			if(!verifyTitle("Buy Swim at Divers Supply")){
				reportStep("This is not a category page", "FAIL");
			}		
		}
		
		
		//---------------------------------------------------------------------ScrollDown --------------------------------------------------------------------------
	
	     public SubCategoryPage scrollDownSC(){
	    	 JavascriptExecutor sDown = (JavascriptExecutor) driver;
	    	 sDown.executeScript("window.scrollBy(0,1500)");
	    	 return this;
	     }
	
	     public ProductPage clkProduct() throws InterruptedException{
	    	 clickByXpath("(//a[@class='product-item-link'])[15]");
	    	 Thread.sleep(5000);
	    	 return new ProductPage(driver, test);
	     }
	
	
			//---------------------------------------------------------------------Subscription Popup --------------------------------------------------------------------------
	
	     public SubCategoryPage subscriptionPopup(){
	    		WebElement subPopup=driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
	    		WebElement cloIcon = driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
	    		
	    		if (subPopup.isDisplayed()) {
	    			cloIcon.click();
	    			} else {
	    				System.out.println("No Popup has displayed");
	    			}
	    		return this;
	    	}
	     
		    //-----------------------------------------------------Quick View-----------------------------------------------------------------
	     
	     public SubCategoryPage quickView() throws InterruptedException{
	    	 clickByXpath("(//*[contains(text(),'Quickview')])[15]");
	    	 Thread.sleep(8000);
	    	 return this;
	     }
	     

		    //-----------------------------------------------------Click Add To Cart----------------------------------------------------------------

	     
	     public SubCategoryPage clkAddToCartBtn() throws InterruptedException{
	    	 clickByXpath("//button[@id='product-addtocart-button']");
	    	 Thread.sleep(4000);
	    	 return this;
	     }
	     
	     
		    //---------------------------------------------------------Frame--------------------------------------------------------------
	     
	     
	     public SubCategoryPage switchToFramePopUp() {
	    	 driver.switchTo().frame(0);
	    	 return this;
	     }

	     
	     
	     
	     public ProductPage clkGoToProductBtn() throws InterruptedException{
	    	 clickByXpath("//a[@id='product-gotoproduct-button']");
	    	
	     return new ProductPage(driver, test);
	     }
	     
	     
	     public CheckoutPage goToCheckOutPage(){
	    	 
	    	 clickByXpath("(//button[@class='action primary'])[2]");
	    	 return new CheckoutPage(driver, test);
	     }
	     
	     
	     public SubCategoryPage clkCloseIconPopUp(){
	    	 clickByXpath("//button[@data-role='closeBtn']");
	    	 return this;
	     }
	     
	     public SubCategoryPage clkCloseIconPDPPopup(){
	    	 clickByXpath("//button[@class='mfp-close']");
	    	 return this;
	     }
	     
	  
	     
		    //---------------------------------------------------------Child Window--------------------------------------------------------------

	     
	     public SubCategoryPage childWindowPopUp(){
	 		switchToLastWindow();
	 		return this;
	 	}
	     
	     
		    //------------------------------------------------------------------------------------------------------------------------------------

    public SubCategoryPage sizeDropDown(){
    	WebElement sizeDDEle = driver.findElement(By.xpath("//select[@name='super_attribute[136]']"));
    	Select sizeDD= new Select(sizeDDEle);
    	sizeDD.selectByIndex(2);
    	return this;
    }
	     
	    //-----------------------------------------------------------------------Test Purpose----------------------------------------------------
	     
	     public ProductPage clkBagProduct() throws InterruptedException{
	    	 clickByXpath("(//a[@class='product-item-link'])[2]");
	    	 Thread.sleep(5000);
	    	 return new ProductPage(driver, test);
	     }
	     
	}