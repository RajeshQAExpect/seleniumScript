package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class DiversSupply extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;	

	@BeforeSuite
	public void beforeSuite(){
		startResult();    //Reporter Class line #50
	}

	@BeforeTest
	public void beforeTest(){    
		loadObjects();   //GenericWrappers Class line #63
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		invokeApp(browserName);
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();  //Reporter Line #62
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();    //GenericWrappers Class line #76
	}
	
	/*@AfterMethod
	public void afterMethod(){
		endTestcase();     //Reporter Line #65
		closeAllBrowsers();	 //GenericWrappers Class line #76	    
	}*/
	
	@DataProvider(name="fetchData")
	//all value of super class is object
	//string value mentioned string[][] or int[][] so we have to use object[][]
	public Object[][] getData(){
		
		return DataInputProvider.getAllSheetData("./data/"+dataSheetName+".xlsx");		
	}	
	
	
}






