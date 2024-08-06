package day23;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));  //explicit wait declaration
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        
        //1 handle JS Confirm POPUP in which Ok & Cancel button r there
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        
        //2 Switch from ui to popup
        //Alert alert=driver.switchTo().alert(); //once u capture window in variable alert. that variable should be Alert type.
        
        //or using explicit wait-one we declare explicit wait we can use many time
        //sometime alert take so much time then we can use this explicit wait command
        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent()); //it will wait for the alert. once alert is available it will get u the alert in a variable

        //3 it will get u the text which present in alert window
        System.out.println(alertwindow.getText()); //I am a JS Confirm
        
        //4 This will close alert window using ok button
       // alertwindow.accept();
        
        //5 This will close alert window using cancel button
          alertwindow.dismiss();
        
        
        
        
        
        
        
	}

}
