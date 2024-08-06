package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepStatement {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the Browser
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       
	       //enter username
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
           
	}

}
