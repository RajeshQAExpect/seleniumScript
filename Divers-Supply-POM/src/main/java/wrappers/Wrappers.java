package wrappers;


public interface Wrappers {
	
	
	
//-----------------------------------------------------Invoke Method------------------------------------------------------------
	

	/**
	 * This method will launch the given browser and maximize the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Innoppl Technologies
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @throws Exception 
	 * 
	 */
	
	public void invokeApp(String browser);

	/**
	 * This method will launch the given browser and maximize the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Innoppl Technologies
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @throws Exception 
	 * 
	 */		
	public void invokeApp(String browser, boolean bRemote);
	
	
//-----------------------------------------------------Enter Method------------------------------------------------------------	
	

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Innoppl Technologies
	 * @return 
	 * @throws Exception 
	 */

	
	public void enterById(String idValue, String data);

	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Innoppl Technologies
	 */
	public void enterByName(String nameValue, String data);	

	/**
	 * This method will enter the value to the text field using xpath attribute to locate
	 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Innoppl Technologies
	 */
	public void enterByXpath(String xpathValue, String data);


	
//----------------------------------------------------- Verify Method ------------------------------------------------------------		

	
	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Innoppl Technologies
	 */
	
	public boolean verifyTitle(String title);

	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Innoppl Technologies
	 */
	public void verifyTextById(String id, String text);

	/**
	 * This method will verify the given text with exact match
	 * @param xpath - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Innoppl Technologies
	 */
	public void verifyTextByXpath(String xpath, String text);

	/**
	 * This method will verify the given text with partial match
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Innoppl Technologies
	 */
	public void verifyTextContainsByXpath(String xpath, String text);

	
//-----------------------------------------------------Click Method------------------------------------------------------------		

	
	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Innoppl Technologies
	 */
	public void clickById(String id);

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Innoppl Technologies
	 * @throws Exception 
	 */
	public void clickByClassName(String classVal);

	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Innoppl Technologies
	 */
	public void clickByName(String name);


	/**
	 * This method will click the element using link name as locator and do take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Innoppl Technologies
	 */
	public void clickByLink(String name);

	/**
	 * This method will click the element using link name as locator and do not take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Innoppl Technologies
	 */
	public void clickByLinkNoSnap(String name);

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Innoppl Technologies
	 */
	public void clickByXpath(String xpathVal);

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Innoppl Technologies
	 */
	public void clickByXpathNoSnap(String xpathVal);
	
	
//-----------------------------------------------------Get Method------------------------------------------------------------		

	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 * @author Innoppl Technologies
	 */
	
	public String getTextById(String idVal);

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Innoppl Technologies
	 */
	public String getTextByXpath(String xpathVal);
	
	
//-----------------------------------------------------Select Method------------------------------------------------------------		
	

	/**
	 * This method will select the drop down visible text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Innoppl Technologies
	 */
	public void selectVisibileTextById(String id, String value);

	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Innoppl Technologies
	 */
	public void selectIndexById(String id, int value);
	
	
//-----------------------------------------------------Switch Method------------------------------------------------------------		

	/**
	 * This method will switch to the parent Window
	 * @author Innoppl Technologies
	 */
	public void switchToParentWindow();

	/**
	 * This method will move the control to the last window
	 * @author Innoppl Technologies
	 */
	public void switchToLastWindow();
	
	
	
//-----------------------------------------------------Alert Method------------------------------------------------------------		

	/**
	 * This method will accept the alert opened
	 * @author Innoppl Technologies
	 */
	public void acceptAlert();

	/**
	 * This method will dismiss the alert opened
	 * @author Innoppl Technologies
	 */
	public void dismissAlert();

	/**
	 * This method will return the text of the alert
	 * @author Innoppl Technologies
	 */
	public String getAlertText();
	
	
//-----------------------------------------------------Takesnap Method------------------------------------------------------------		

	/**
	 * This method will take snapshot of the browser
	 * @author Innoppl Technologies
	 */
	public long takeSnap();


//-----------------------------------------------------Page refresh------------------------------------------------------------		
	
	/**
	 * This method will refersh the current page
	 * @author innoppl Technologies
	*/
	public void pageRefresh();
	
//-----------------------------------------------------Close Method------------------------------------------------------------	
	
	/**
	 * This method will close the active browser
	 * @author Innoppl Technologies
	 */
	public void closeBrowser();


	/**
	 * This method will close all the browsers
	 * @author Innoppl Technologies
	 */
	
	public void closeAllBrowsers();

}
