package day23;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithInputbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        
        //1 handle alert with input box in which ok & cancel button r there
        //click on click for JS Prompt
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        
        //switch from ui topopup
        Alert alertwindow=driver.switchTo().alert();
        
        //2 fetching text from alert window
        System.out.println(alertwindow.getText()); //I am a JS prompt
        
        //3 pass value into the input box-using sendkeys() we can pass value into the input box
        alertwindow.sendKeys("Welcome");
        
        alertwindow.accept();  //click on OK button
        alertwindow.dismiss(); //click on Cancel button
        
        //4 validation- whatever value we entered in input box as actual value is same as expected value
        String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String exp_text="You entered: Welcome";
        
        if(act_text.equals("exp_text"))
        {
        	System.out.println("test passed");
        }
        
        else
        {
        	System.out.println("test failed");
        }
        
        
        
        
        


	}

}
