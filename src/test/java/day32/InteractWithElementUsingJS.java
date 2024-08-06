package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithElementUsingJS {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1 swith to that frame
		driver.switchTo().frame(0);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//2 Enter in name field using javascript executor
		Thread.sleep(4000);
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','john')",inputbox);
		
		//3 Handle radio button using javascript executor
		WebElement male_Rd=driver.findElement(By.xpath("//input[@id='male']"));
		male_Rd.click(); //element click intercept exception
		
		js.executeScript("arguments[0].click();",male_Rd);
		
		//4 Handle Sunday checkbox
		// driver.findElement(By.xpath("id=\"sunday\"")).click(); //no such element exception
		
		WebElement chkbox=driver.findElement(By.xpath("id=\"sunday\""));
		js.executeScript("arguments[0].click();",chkbox);
		
		//5 Handle Submit Button
		WebElement button=driver.findElement(By.xpath("id=\"FSsubmit\""));
		js.executeScript("arguments[0].clcik();",button);
		
		
		
		
		
		
		

	}

}
