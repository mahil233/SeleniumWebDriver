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

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");	
		Thread.sleep(3000);
		
		//1 click on the link
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//2 fetch window id of all the window which are open
		Set<String> windows=driver.getWindowHandles(); // windows object have parent string & child window id string
		Iterator<String> it= windows.iterator(); //pull the id from set data structure using a method called iterator
		String parentId=it.next(); //control will go to 0th index means fetch parent id
		String childId=it.next(); //control will go to 1st index means fetch child id
		 
		//3 switch to child window
		driver.switchTo().window(childId); //which window u want to switch , that window id u need to pass in argument
	
		//4 extract text in child window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	
	    //5 fetch email from aove entire text, use split() to fetch beofore at & after at
		String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
	    //6 switch to parent window
		driver.switchTo().window(parentId);
		
		//7 enter in username field
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
	
	
	
	}
}
