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
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		Thread.sleep(3000);
		
		//1 How to scroll apage
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");  //top to bottom
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,-500)"); //bottom to top
		Thread.sleep(3000);
		
		//2 How to scroll a table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //top to bottom
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=-5000"); ////bottom  to top
		
		//3 for hozrrizontal table we used scrollLeft()
	        
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
