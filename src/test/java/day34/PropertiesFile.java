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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class PropertiesFile {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		//1 Create the object of Properties file
		Properties prop=new Properties();
		
		//2 create object of File Class, inside argument we will pass path of property file
		File file=new File("testdata.properties");
		
		//3 create object of FileInputStream Class, inside argument we will pass object reference of file
		FileInputStream fis=new FileInputStream(file);
		
		//4 using properties object reference, use method called load, inside this we pass object ref of fileinput stream
		prop.load(fis);
		
		//5 read the data from property file
		System.getProperty(prop.getProperty("browser"));
		System.getProperty(prop.getProperty("url"));
		
	    
	}
}
