package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithHiddenOptions {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		driver.manage().window().maximize();
		
		//enter username,password & click on login button
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(3000);
		
		//1 click on PIM Button
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		
		//2 click on job title dropdown
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();

		//3 Capture all the options from dropdown
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		
		for(WebElement option:options)
		{
			//print all the options
			//System.out.println(option.getText());
			
			//click on one option
			if(option.getText().equals("Customer Success Manager"))
			{
				option.click();
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
