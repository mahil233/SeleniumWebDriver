package day21;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {


		// Launch the Browser
	       WebDriver driver=new ChromeDriver();
	       
	    // Waiting 30 seconds for an element to be present on the page, checking
	    // for its presence once every 5 seconds.
	       
	       //1 Fluent wait declaration
	       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	           .withTimeout(Duration.ofSeconds(30))
	           .pollingEvery(Duration.ofSeconds(5))
	           .ignoring(NoSuchElementException.class);
          
	       
	      /* //or
	       FluentWait wait=new FluentWait(driver);
	       wait.withTimeout(Duration.ofSeconds(30));
	       wait.pollingEvery(Duration.ofSeconds(5));
	       wait.ignoring(NoSuchElementException.class);
	      */ 
	       
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       
	       //2 usage of one element
	       WebElement username = wait.until(new Function<WebDriver, WebElement>() {
	    	     public WebElement apply(WebDriver driver) {
	    	       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
	    	     }
	    	   });
	       
	       username.sendKeys("Admin");
	      

	}

}
