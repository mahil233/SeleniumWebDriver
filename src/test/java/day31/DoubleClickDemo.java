package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3"); 
		driver.manage().window().maximize();
		
		//switch to frame using id or name
		driver.switchTo().frame("iframeResult");
		
		//scenario1- clear the text from field 1  & pass another text then perform double click action & check same text is present in field 2 or not
        WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
        f1.clear();                   //clear value from field 1
        
        f1.sendKeys("Welcome");       //enter new value in field 1
        
        
        //double click on copy text button
        WebElement button=driver.findElement(By.xpath("//button[.='Copy Text']"));
        Actions act=new Actions(driver);
        act.doubleClick(button).perform();
        
        //scenario2-We need to validate whatever value is provided in Field1 input box, same value is populated in Field2 input box or not
        
        //we can capture text from input box using getText()
        WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));//capture the Field2 element
        
        //getText() is not working here  because inner text is not present
        //String copiedText=f2.getText(); //capture text value from that element which is copied automatically after performing double click action
        //or
        
        String copiedText=f2.getAttribute("value");
        
        System.out.println("Copied text is "+copiedText); 
        
        
        if(copiedText.equals("Welcome"))
        {
        	System.out.println("Test Passed");
        }
        
        else
        {
        	System.out.println("Test failed");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
	}

}
