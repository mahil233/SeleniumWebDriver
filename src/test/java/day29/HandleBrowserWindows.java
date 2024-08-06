package day29;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		driver.manage().window().maximize();
		
		/*
		//1 click on Orange HRM link
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//we need to capture id's of two browser windows. we have multiple browsers so we used getWindowHandles()
		//every window id is unique id. so we used set because set not support duplicate value
		
		
		//In set collection we can not retrieve individual id. but in list collection we can retrieve individual id thats why we convert set to list 
		//2 Capture id's for browser windows
		Set<String> windowIDs= driver.getWindowHandles();  //stores 2 window id's
		
		//Approach-1 using list collection (if we have two browser window follow this approach). want to get individual window id so firstly we convert set to list
		
		//declaration of list collection
		
		//pass this set collection variable into arraylist constructor
		List <String>windowidsList= new ArrayList(windowIDs);	//this collection allow us to store only string
		
		String parentWindowID=windowidsList.get(0);
		String childWindowID=windowidsList.get(1);
		
		//switch to child window
		driver.switchTo().window(childWindowID);
		
		//in child window click on Contact Sales 
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		//switch to parent window
		driver.switchTo().window(parentWindowID);
		
		//in parent window enter entry in username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Ram");
		*/
		
		
		/*
		//approach-2 (if we have more than 2 browser window like 3,5 or 10 then use this approach)
		
		//1 click on Orange HRM link
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
				
		//2 Capture id's for browser windows
		Set<String> windowIDs= driver.getWindowHandles();  //stores 2 window id's
		
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM HR Software | OrangeHRM"))
			{
				//in child window click on Contact Sales 
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			}
		}
			*/
		
		//3 Approach-3 (Closing specific browser windows based on choice)
		//suppose want to close 1st & 5 th windows 
		//suppose title of multiple pages- 1-a  2-b  3-c  4-d 5-e
		
		//1 click on Orange HRM link
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
						
		//2 Capture id's for browser windows
		Set<String> windowIDs= driver.getWindowHandles();  //stores 2 window id's
		
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("a") || title.equals("e"))  //close 1st & 5th browser windows
			//or
				if(title.equals("a") || title.equals("e")||title.equals("c"))  //close 1st,3rd,5th browser windows	
			//or
				if(title.equals("a")) //close only first browser windows	
				
				{
				driver.close();
				
			}
		}
		
		
		
		
        


	}

}
