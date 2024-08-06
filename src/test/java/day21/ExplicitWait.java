package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		   WebDriver driver=new ChromeDriver();
	       
		   //1 declaring explicit wait
		   WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
	       
		   
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       
	       //enter username
	       //let say this element(Username) take some time to load. now we apply explicit wait for this element(Username) specially
	       
	       //we used explicit wait for multiple times for username & password if some element take some time to load
	       WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='username']")));
	       username.sendKeys("Admin");
	       
	       
	       //enter password
	       WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='password']")));
	       password.sendKeys("admin123");
	       


	}

}
