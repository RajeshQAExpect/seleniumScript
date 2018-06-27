	package pages;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

	import wrappers.DiversSupply;

	public class CategoryPage extends DiversSupply{
		
		public CategoryPage(RemoteWebDriver driver, ExtentTest test) {
			this.driver = driver;
			this.test =test;
			
			if(!verifyTitle("Buy Dive Suits at Divers Supply")){
				reportStep("This is not a category page", "FAIL");
			}		
		}
		
		
		//---------------------------------------------------------------------Verify Category --------------------------------------------------------------------------
		
		public CategoryPage verifyCategories(){
			WebElement apparelSubCate = driver.findElement(By.xpath("(//a[@title='Apparel'])[1]"));
			WebElement bcdSubCate = driver.findElement(By.xpath("(//a[@title='BCD'])[1]"));
			WebElement bagsSubCate= driver.findElement(By.xpath("(//a[@title='Bags'])[1]"));
			WebElement bmSubCate = driver.findElement(By.xpath("(//a[@title='Books & Media'])[1]"));
			WebElement bootsSubCate = driver.findElement(By.xpath("(//a[@title='Boots'])[1]"));
			WebElement diveComputersSubCate = driver.findElement(By.xpath("(//a[@title='Dive Computers'])[1]"));
			/*WebElement diveSuitsbmSubCate = driver.findElement(By.xpath("(//a[@title='Dive Suits'])[1]"));
			WebElement scubaFinesSubCate = driver.findElement(By.xpath("(//a[@title='Scuba Fins'])[1]"));
			WebElement gaugesSubCate = driver.findElement(By.xpath("(//a[@title='Gauges'])[1]"));
			WebElement glovesSubCate = driver.findElement(By.xpath("(//a[@title='Gloves'])[1]"));
			WebElement giftToysSubCate = driver.findElement(By.xpath("(//a[@title='Gifts & Toys'])[1]"));
			WebElement hookahSurfaceSubCate = driver.findElement(By.xpath("(//a[@title='Hookah & Surface Air Systems'])[1]"));
			WebElement hosesAdaptesrsSubCate = driver.findElement(By.xpath("(//a[@title='Hoses & Adapters'])[1]"));
			WebElement knivesSubCate = driver.findElement(By.xpath("(//a[@title='Knives'])[1]"));
			WebElement lightsSubCate = driver.findElement(By.xpath("(//a[@title='Lights'])[1]"));
			WebElement masksSubCate = driver.findElement(By.xpath("(//a[@title='Masks'])[1]"));
			WebElement octopusSubCate = driver.findElement(By.xpath("(//a[@title='Octopus'])[1]"));
			WebElement packagesSubCate = driver.findElement(By.xpath("(//a[@title='Packages'])[1]"));
			WebElement regulatorsSubCate = driver.findElement(By.xpath("(//a[@title='Regulators'])[1]"));
			WebElement snorkelsSubCate = driver.findElement(By.xpath("(//a[@title='Snorkels'])[1]"));
			WebElement tanksAccessoriesSubCate = driver.findElement(By.xpath("(//a[@title='Tanks & Accessories'])[1]"));
			WebElement underWaterCommSubCate = driver.findElement(By.xpath("(//a[@title='Underwater Communications'])[1]"));
			WebElement scubaAccSubCate = driver.findElement(By.xpath("(//a[@title='Scuba Accessories'])[1]"));
			WebElement watchesSubCate = driver.findElement(By.xpath("(//a[@title='Watches'])[1]"));
			WebElement WeightsBeltsSubCate = driver.findElement(By.xpath("(//a[@title='Weights & Belts'])[1]"));
			WebElement clearanceUsedSubCate = driver.findElement(By.xpath("(//a[@title='Clearance & Used'])[1]"));
			WebElement scubaGearServiceSubCate = driver.findElement(By.xpath("(//a[@title='SCUBA Gear Service'])[1]"));*/
			
			if (apparelSubCate.isDisplayed()) {
				System.out.println("Apparel subcategory is displaying");
				if (bcdSubCate.isDisplayed()) {
					System.out.println("BCD subcategory is displaying");
				}
					if (bagsSubCate.isDisplayed()) {
						System.out.println("Bags subcategory is displaying");
					}
						if (bmSubCate.isDisplayed()) {
							System.out.println("Books & Media subcategory is displaying ");
						}
							if (bootsSubCate.isDisplayed()) {
								System.out.println("Boots subcategory is displaying");
							}
								if (diveComputersSubCate.isDisplayed()) {
									System.out.println("Dive Computers subcategory is displaying");
									
								}
					
				
				
			} else {
				System.out.println("No subcategory has displayed");
			}
			
			return this;
			
		}
		

		//-----------------------------------------------------subscription Popup------------------------------------------------------------		
				/*public CategoryPage subscriptionPopup(){
					WebElement subPopup1=driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
					WebElement cloIcon1 = driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']"));
					
					try {
						if (subPopup1.isDisplayed()) {
							cloIcon1.click();
							} else {
								System.out.println("No Popup has displayed");
							}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					return this;
				}	
		*/
		
		
   //------------------------------------------------------------------Click SubCategory--------------------------------------------------
		
		
		public SubCategoryPage clkSwimCaps(){
		clickByXpath("(//*[contains(text(),'Swim Caps')])[2]");
			return new SubCategoryPage(driver, test);
		}
		
		
	//---------------------------------------------------------Pop up Data------------------------------------------------------------------------
		
		public CategoryPage subEnterEmail(String eMailId){
			enterByXpath("//input[@id='tb_email']", eMailId);
			return this;
		}
				
		public CategoryPage subClkSubmitBtn(){
			clickByXpath("//input[@id='tb_submit']");
			return this;
		}
				
			
				
//-----------------------------------------------------------------------------------------------------------------------------------------	
		
public CategoryPage scrollDownCate(){
	JavascriptExecutor scrollDownPage = (JavascriptExecutor) driver;
	scrollDownPage.executeScript("window.scrollBy(0,100)" );
	return this;
}
		
		
		
//-----------------------------------------------------------------------------------------------------------------------------------------	
		

public SubCategoryPage clkApparel(){
	clickByXpath("(//a[@title='Apparel'])[1]");
	return new SubCategoryPage(driver, test) ;
}


//--------------------------------------------------------------------------------------------------------------------------
			
		/*public CategoryPage clickProduct(){ 
			//Actions proAct = new Actions(driver);
			//proAct.moveToElement(driver.findElement(By.xpath("(//img[@id='product-collection-image-64547'])"))).build().perform();
			clickByXpathNoSnap("(//img[@id='product-collection-image-64547'])");
			return this;
		}
		

		public CategoryPage selectColor(int index) throws InterruptedException{
			Select clrdp = new Select(driver.findElement(By.xpath("//select[@id='attribute92']")));
			//Thread.sleep(3000);
			clrdp.selectByIndex(index);
			return this;
		}
		
		public ProductPage clickAddToCartBtn() throws InterruptedException{
			Thread.sleep(10000);
			try {
				clickByXpathNoSnap("//button[@id='product-addtocart-button']");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return new ProductPage (driver, test) ;
		}*/
		
}