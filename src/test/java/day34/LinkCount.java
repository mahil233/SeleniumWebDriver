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
import org.openqa.selenium.Keys;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		Thread.sleep(3000);
		
		//1 find the count of link in the page
		System.out.println(driver.findElements(By.tagName("a")).size()); //27
		
		//2 count of footer section link
		WebElement footerDriver=driver.findElement(By.cssSelector("#gf-BIG"));
	    System.out.println(footerDriver.findElements(By.tagName("a")).size()); //20
	    
	    //3 count the first column links in footer section
	    WebElement firstColumnLink=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(firstColumnLink.findElements(By.tagName("a")).size()); //5
	
	    
	    //4 click on each link in the column and check if pages are opening
	    for(int i=1;i<firstColumnLink.findElements(By.tagName("a")).size();i++) {
	    	
	    //open link in new tab using control & enter
	    String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	
	    	firstColumnLink.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
	        Thread.sleep(3000);
	        
	    //5 get titles from all pages which are open in new tab
	        //hasNext()- it tell us whether next index is present or not 
	        //next()-it actually move to next index
	        Set<String> abc=driver.getWindowHandles();
	        Iterator<String> it=abc.iterator();               //iterator will help u move to each & every window
	        
	    //6 this code iterate each & every tab & fetching the title     
	        while(it.hasNext()) {    //it.hasNext() tells if there is any window present
	        	
	        driver.switchTo().window(it.next());//it window present then move to 0th index
	        System.out.println(driver.getTitle());
	        
	        }     
	        }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
