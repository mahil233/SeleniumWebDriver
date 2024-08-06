package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseAlertWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        
        //1 handle JS Confirm POPUP in which Ok & Cancel button r there
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        
        //2 close Alert window
        driver.switchTo().alert().accept(); 

	}

}
