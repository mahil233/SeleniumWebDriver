package day32;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*
		//1 scroll down page by pixel
		js.executeScript("window.scrollBy(0,3000)",""); //3000 pixel it will scroll down
		
		//2 this will return the current location of your scroll
		System.out.println(js.executeScript("return window.pageYOffset;")); //3000
		
		
		//3 Scroll down the page till the element is present
		
		WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();", flag); //scrollIntoView() means when flag is viewable till that we have to scroll down the page.
		System.out.println(js.executeScript("return window.pageYOffset;")); //7549
		
		*/
		
		//4 scroll down till end of page/document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); //9527
		
		
		//5 Go back to initial position
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//6 //1 horizontal scroll  page by pixel
		js.executeScript("window.scrollBy(0,3000)",""); //3000 pixel it will scroll down
		System.out.println(js.executeScript("return window.pageXOffset;"));
		
		
		
	
		

	}

}
