package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlesFrameDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/package-summary.html");
		
		//switch to frame-1 
		//1 click on first link in frame 1
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//2 Click on WebDriver in frame 2
		driver.findElement(By.linkText("WebDriver")).click();
		
		//3 click on overview link
		driver.findElement(By.xpath("//div[@class=\"top-nav\"]//a[text()='Overview']")).click();
		
		
		
		
		
		

	}

}
