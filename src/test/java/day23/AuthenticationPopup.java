package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		//1 syntax to handle authentication popup-http://username:password@siteurl
		
	    driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
        
        //2 capture the text
        String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();
        
        //3 validate actual result with espected result
        if(text.contains("Congratulations"))  //contains is string method
        {
        	System.out.println("successful login");  //successful login
        }
        
        else
        {
        	System.out.println("login failed");
        }

	}

}
