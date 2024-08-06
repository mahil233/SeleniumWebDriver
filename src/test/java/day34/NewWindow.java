package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");	
		//switch to new blank tab but control is present in parent tab
        driver.switchTo().newWindow(WindowType.TAB);		
        
        //getWindowHandles()- when we call this method, selenium will see currently how many windows are currently open
	                          //all two window id is extracted when call this method & it is stored in set data structure
        
        Set<String> handles=driver.getWindowHandles();
        //our goal is to retrive each window id to switch. if u want to iterate two windows, then we use method called iterator
        Iterator<String> it=handles.iterator();
        String parentWindowId=it.next();
        String childWindowId=it.next();
        //switch to child window id
        driver.switchTo().window(childWindowId);
        Thread.sleep(3000);
        driver.get("https://rahulshettyacademy.com/");
        //fetch all the text
        Thread.sleep(3000);
        String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(2).getText();
        //switch to parent window id
        Thread.sleep(3000);
        driver.switchTo().window(parentWindowId);
        //enter the text in name field which is copy from child window
        Thread.sleep(3000);
        WebElement name=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
        name.sendKeys(courseName);
        
        //taking screenshot of name editbox
        File file=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("logo.png"));
        
        //Get height & width of webelement(editbox)
        System.out.println(name.getRect().getDimension().getHeight()); //38
        System.out.println(name.getRect().getDimension().getWidth());  //930
}

}