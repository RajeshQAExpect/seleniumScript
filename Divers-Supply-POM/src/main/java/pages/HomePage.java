package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DiversSupply;

public class HomePage extends DiversSupply{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Scuba Gear at Divers-Supply 40 years in business!")){
			reportStep("This is not Home Page", "FAIL");
		}		
	}
	
//------------------------------------------------------------Notification Popup--------------------------------------------------------------------------
	
	public HomePage popUpHandling(){
		WebElement popUp = driver.findElement(By.xpath("//div[@class='iz_buttons_container']"));
		if (popUp.isEnabled()) {
			driver.findElement(By.xpath("//a[@class='iz_block_button']")).click();
		} else {
		   System.out.println("No Popup has displayed");
			
		}  
		 return this;
	}
	
	
//------------------------------------------------------------------------Sign In---------------------------------------------------------------------
	
	public P1_Login clkSignInLink() throws InterruptedException{
		Thread.sleep(4000);
		clickByXpath("(//a[contains(text(),'Sign In')])[1]");
		Thread.sleep(10000);
		return new P1_Login(driver, test);
	}
	
	
//---------------------------------------------------------------------Verify Menu --------------------------------------------------------------------------
	
	public HomePage verifyMenu() throws InterruptedException{
		WebElement scubaMenu = driver.findElement(By.xpath("(//*[contains(text(),'Scuba ')])[2]"));
		WebElement snorkelingMenu = driver.findElement(By.xpath("//*[contains(text(),'Snorkeling ')]"));
		WebElement spearfishingMenu = driver.findElement(By.xpath("(//*[contains(text(),'Spearfishing')])[1]"));
		WebElement swimMenu = driver.findElement(By.xpath("(//*[contains(text(),'Swim')])[1]"));
		WebElement photographyMenu = driver.findElement(By.xpath("(//*[contains(text(),'Photography')])[1]"));
		WebElement scubaLessonsMenu = driver.findElement(By.xpath("(//*[contains(text(),'Scuba Lessons ')])[1]"));
		WebElement retailLocationsMenu = driver.findElement(By.xpath("(//*[contains(text(),'Retail Locations ')])[1]"));
		WebElement brandMenu = driver.findElement(By.xpath("(//*[contains(text(),'Brands')])[1]"));
		
		
		Actions act = new Actions(driver);
		if (scubaMenu.isDisplayed()) {
			act.moveToElement(scubaMenu).build().perform();
			System.out.println("Scuba Menu is displaying");
			Thread.sleep(3000);
			if (snorkelingMenu.isDisplayed()) {
				act.moveToElement(snorkelingMenu).build().perform();
				System.out.println("Snorkeling Menu is displaying");
				Thread.sleep(3000);
				}
			     if (spearfishingMenu.isDisplayed()) {
			    	 act.moveToElement(spearfishingMenu).build().perform();
			    	 System.out.println("Spearfishing Menu is displaying");
			    	 Thread.sleep(3000);
				}
			        if (swimMenu.isDisplayed()) {
			        	act.moveToElement(swimMenu).build().perform();
			        	System.out.println("Spearfishing Menu is displaying");
			        	Thread.sleep(3000);
					}
			           if (photographyMenu.isDisplayed()) {
			        	   act.moveToElement(photographyMenu).build().perform();
			        	   System.out.println("Spearfishing Menu is displaying");
			        	   Thread.sleep(3000);		
					       if (scubaLessonsMenu.isDisplayed()) {
			                	  act.moveToElement(scubaLessonsMenu).build().perform();
			                	  System.out.println("Scuba Lessons Menu is displaying");  			
			                	  Thread.sleep(3000);
							}
			                     if (retailLocationsMenu.isDisplayed()) {
			                    	 act.moveToElement(retailLocationsMenu).build().perform(); 
			                    	 System.out.println("Retail Locations Menu is displaying");
			                    	 Thread.sleep(3000);
									}
			                     
			                     if (brandMenu.isDisplayed()) {
			                    	 act.moveToElement(brandMenu).build().perform(); 
			                    	 System.out.println("Brand Menu is displaying");
									}
		} else {
			System.out.println("Menu not appeared");
		}
		}
			           return this;
	}
	
//-------------------------------------------------------------------------------Login----------------------------------------------------------------------
	
	public P1_Login clickLoginLink() throws InterruptedException{
		clickByXpath("//a[@title='Log In']");
		Thread.sleep(5000);
		return new P1_Login(driver,test); 
	}
	
//-------------------------------------------------------------------------------Create New Account----------------------------------------------------------------------
	

	public P2_CreateAnAccount clkCreateAnAccountLink() throws InterruptedException{
		Thread.sleep(3000);
				clickByXpath("(//*[contains(text(),'Create an Account')])[1]");
				Thread.sleep(5000);
		return new P2_CreateAnAccount(driver, test);
	}
	
//-----------------------------------------------------------------------------Search ----------------------------------------------------------------------
	
	public HomePage enterSearchKeyword(String sKeyword) throws InterruptedException {
		enterByXpath("//input[@id='search']", sKeyword);
		Thread.sleep(3000);
		return this;
	}
		
	public Search clickAllDeptLink() throws InterruptedException{
		clickByLink("All departments");
		Thread.sleep(3000);
		return new Search(driver, test);
	}
	
//--------------------------------------------------------------Handling Reviews--------------------------------------------------------------------	
	
	
public HomePage clickReviewIcon(){
	clickByXpath("//button[@class='tbSiteReviews-openButton tbSiteDefaultButton tbSiteDefaultButtonColor']");
	return this;
}

	
//---------------------------------------------------------Hover Menu-------------------------------------------------------------------------

public CategoryPage mHoverSwim() throws InterruptedException{
	
	clickByXpath("(//*[contains(text(),'Swim')])[1]");
	Thread.sleep(4000);
	return new CategoryPage(driver,test);
}


//---------------------------------------------------------------------------------------------------------------------------------------------

 public HomePage clkCartIcon() throws InterruptedException{
	 clickByXpath("//a[@class='action showcart']");
	 Thread.sleep(3000);
	 return this;
 }

 
 public CheckoutPage clkEditBtn(){
	 
	 clickByXpath("//a[@class='action viewcart']");
	 return new CheckoutPage(driver, test);
 }
 
 
 public CheckoutPage clkCheckoutBtn(){
	 
	 clickByXpath("//button[@id='top-cart-btn-checkout']");
	 return new CheckoutPage(driver, test);
 }

//---------------------------------------------------------------------------------------------------------------------------------------------


public SubCategoryPage clkDiveSuites() throws InterruptedException{
	
	
	
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='level-top'])[1]"));
	WebElement subEle = driver.findElement(By.xpath("(//*[contains(text(),'Dive Suits')])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	
	act.click(subEle).build().perform();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//img[@id='product-collection-image-64518']")).click();
	return new SubCategoryPage(driver, test);
}


//-------------------------------------------------------Swim Caps----------------------------------------------------------------


public SubCategoryPage swimCaps() throws InterruptedException{
	
	
	
	
	WebElement ele = driver.findElement(By.xpath("(//*[contains(text(),'Swim')])[1]"));
	WebElement subEle = driver.findElement(By.xpath("(//*[contains(text(),'Swim Caps')])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	
	act.click(subEle).build().perform();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//img[@id='product-collection-image-64518']")).click();
	return new SubCategoryPage(driver, test);
}


//---------------------------------------------------------------------------------------------------------------------------------------------
public HomePage subscriptionPopup(){
	WebElement subPopup=driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
	WebElement cloIcon = driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
	
	if (subPopup.isDisplayed()) {
		cloIcon.click();
		} else {
			System.out.println("No Popup has displayed");
		}
	return this;
}

//-----------------------------------------------------------Test Purpose-----------------------------------------------------------


public SubCategoryPage clkBags() {
	
	WebElement ele = driver.findElement(By.xpath("(//a[@class='level-top'])[1]"));
	WebElement subEle = driver.findElement(By.xpath("(//*[contains(text(),'Bags')])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	
	act.click(subEle).build().perform();

	return new SubCategoryPage(driver, test);
}

//---------------------------------------------------------------------------------------------------------------------------------------------


	
	/*public HomePage enterSearchKeyword(String sKeyword){
		enterByXpath("(//input[@id='search'])[1]", sKeyword);
		return this;
	}
	
	public HomePage mHover(){
		Actions ele = new Actions(driver);
		ele.moveToElement(driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"))).click().build().perform();
		return this;
	}*/
	
	/*public HomePage enterEmailId(String emailId){
		enterById("tb_email", emailId);
		return this;
	}
	
	public HomePage cPageRefresh(){
	driver.navigate().refresh();
		Thread.sleep(5000);
		Actions actref = new Actions(driver);
		actref.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		
	return this;
	}
	
	
	
	public Login clickLoginLink() {
	clickByLinkNoSnap("Log In");
	return new Login(driver, test);
	}
	
	public HomePage clickCloseIcon() {
		clickByXpath("//button[@class='targetbay_close targetbay_close_center']");
	return this;
}

	public HomePage clickSearchIcon(){
		clickByXpathCheck("//span[@id='algolia-glass']");
		return this;
	}
	
	
	public HomePage mouseHoverScubaMenu(){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-a relative-level1 level-top nav-a-with-toggler nav-a-level0'])[1]"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-a relative-level1 level-top nav-a-with-toggler nav-a-level0'])[2]"))).build().perform();
		//act.click(driver.findElement(By.linkText("Bags"))).build().perform();
		return this;
	}

	
	
	public CategoryPage clickProduct(){ 
		//Actions proAct = new Actions(driver);
		//proAct.moveToElement(driver.findElement(By.xpath("(//img[@id='product-collection-image-64547'])"))).build().perform();
		clickByXpathNoSnap("(//img[@id='product-collection-image-58718'])");
		return new CategoryPage(driver, test);
	}
	
	public Login clickLogin(){
		
		clickByLink("Log In");
		return new Login(driver, test);
	}
	

	public HomePage enterSKeyword(String sKeyword){
		enterByXpath("(//span[@id='algolia-autocomplete-tt'])[1]", sKeyword);
		return new HomePage(driver, test);
	}
	*/
}