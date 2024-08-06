package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* 1 Open the application
 * 2 Login to the application
 * 3 Logout the application 
 */


public class SecondTest {

	//if u want to access driver in every method we can create driver as global variable or class variable
	WebDriver driver;
	
	//test steps1- Open the application
	@Test(priority=1)
	void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	

	//test steps2-Login to the application
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.xpath("//input[@name='username']"));
		driver.findElement(By.xpath("//input[@name='password']"));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	}
	
	
	//test steps3-Close the application
	@Test(priority=3)
	void logout()
	{
		driver.close();
	}
	

}
