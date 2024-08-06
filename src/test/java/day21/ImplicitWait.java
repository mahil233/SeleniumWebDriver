package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {


		// Launch the Browser
	       WebDriver driver=new ChromeDriver();
	       
	       //once u create implicit wait command that is applicable for every statement in automation script
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       
	       //enter username
	       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	       
	       //enter password
	       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

	}

}
