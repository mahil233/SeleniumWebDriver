package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //only one browser window is open
		driver.manage().window().maximize();
		
		//click on Orrange HRM link
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//1 close()-this command will automatic close the browser
		//driver.close(); //it will close first browser window
		
		//2 quit()- this command will close all browser windows
		driver.quit();
		
		
		
		
		

	}

}
