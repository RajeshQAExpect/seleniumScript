 package utils;

import java.io.File;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider{

	public static String[][] getAllSheetData(String sheetName) {
		//string[][] data= new string[2][2];example of below string

		String[][] data = null;

		try {
			// Load Excel File
			File fis = new File(sheetName);
			
			// Open the WorkBook 
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			// enter the Sheet
			XSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();

			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			// Declaration the array size
			data = new String[rowCount][columnCount];


			// loop through the rows
			//i=1 because 1st row is heading so don't use i=0
			//i<roowcount+1 == i<=rowcount same
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					
					// loop through the columns
					for(int j=0; j <columnCount; j++){ 
						try {
							//string variable commonly decleared this is the shortcut
							String cellValue = "";
							
							try{
								// Based on Cell Type reading the content from Cell
								//apachi poi newly introduced by getcelltype enum
								//Enum is called constant value
								 
								if(row.getCell(j).getCellTypeEnum()==CellType.STRING){	
									
									cellValue = row.getCell(j).getStringCellValue();
								}else if(row.getCell(j).getCellTypeEnum()==CellType.NUMERIC){
									//double returntype convert to (int)-->Typecasting
									//""->in excel sheet (5,0) convert to text format
									cellValue = ""+(int)row.getCell(j).getNumericCellValue();					
								}else if(row.getCell(j).getCellTypeEnum()==CellType.BLANK){
									cellValue = "";
								}
							}catch(NullPointerException e){

							}

							data[i-1][j]  = cellValue; // add to the data - array
						} catch (Exception e) {
							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//fis.close();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}
}




