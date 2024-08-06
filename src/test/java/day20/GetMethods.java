package day20;

/* get(url)
 * getTitle()
 * getCurrentURL()
 * getPageSource()
 * getWindowHandle()
 * getWindowHandles()
 */

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//1 get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//2 getTitle() -capture the title of current webpage
		
		System.out.println("title of the page "+driver.getTitle()); //title of the page OrangeHRM
		
		//3 getCurrentURL()- we already launch this application url. how will we know this launch the right url or not
		
		System.out.println("Current URL: "+driver.getCurrentUrl()); //Current URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		//4 getPageSource()-it will return the html of current webpage
		
		/*
		System.out.println("Page Source..................");
		String ps=driver.getPageSource();
		System.out.println(ps);
		
		//In Page source want to verify html is present or not.if it is true that means tag is present
		System.out.println(ps.contains("html"));
		
		*/
		
		//5 getWindowHandle()-it will return current single browser window id. this id is changing every time when executing
		//System.out.println(driver.getWindowHandle()); //435E7689C83C36E1D8251F3FFFAA0272
		                                              //AAA230B1E5A40E3F27A863A42943A35A
		
		
		//6 getWindowHandles()-return id of multiple browser window
		//(a)Scenario is click on Orange HRM link & navigate to new browser window
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //open new browser window
		
		//(b)want to capture id's of both browser window
		Set<String> windowsids=driver.getWindowHandles();
		
		for(String winid:windowsids)
		{
			System.out.println(winid);    //1E3371A7E77FA44722B99085ADCEC15D
			                              //1B30D592EE5EF3095D08E40532559DBA
		}
		
		
		
		
		

	
	}
}
