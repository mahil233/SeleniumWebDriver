package day33;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//this is heirarche while writing the script
//File->Workbook->Sheets->Rows->Cells


public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//or workbook.getSheetAt(0);
		
		//find the no of rows in sheet
		int totalRows=sheet.getLastRowNum();  //this method will give u last row number that is equal to no of rows
		
		//find the total no of cells
		int totalCells=sheet.getRow(1).getLastCellNum();
		
		//print no of rows & no of cells
		System.out.println("No of rows "+totalRows); //No of rows 5
		System.out.println("No of cells "+totalCells); //No of cells 4
		
		//two for loop is used-one for incrementing the rows & one for incrementing the columns	
	}
}
