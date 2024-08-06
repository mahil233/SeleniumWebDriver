package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class writeExcel {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		
		//1 create object of new workbook
		XSSFWorkbook wb=new XSSFWorkbook();
		
		//2 create new sheet & mention name
		XSSFSheet sheet=wb.createSheet("Data");
		
		//3 create first row
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(100);
		row1.createCell(2).setCellValue("Automation");
		
		//4 create second row I want to create multiple cell & update value
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(200);
		row2.createCell(2).setCellValue("Java Automation");
		
		//5 To open file in writing mode, we have to use FileOutputStream() & we pass test data folder path & myfile is created inside test data folder
		    FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		//6 workbook write into the file
		wb.write(file);
		wb.close();
		file.close();
	
	}
}
