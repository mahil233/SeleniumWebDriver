package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		
		
		//requirement- validate whether logo is present in exact location or not
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		//1 Before maximizing check logo location
		System.out.println("Before maximizing window "+logo.getLocation());
		
		//1 after maximizing check logo location
		driver.manage().window().maximize();
		System.out.println("After maximizing window "+logo.getLocation());  //current position of your logo -(405, 40)

		//2 after maximizing check logo location
		driver.manage().window().minimize();
		System.out.println("After minimizing window "+logo.getLocation());
		
		//3 after full screen check logo location
		driver.manage().window().fullscreen();
		System.out.println("After full screen window "+logo.getLocation());
		
		//4 set the window size or control the size of browser window
		Point p=new Point(100,100); //100 width & 100 height
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 100*100 "+logo.getLocation()); //element(logo) location is changed based on browser window
		
		
		
		
		
		}
}
