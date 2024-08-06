package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		//1 open app
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
        
		//2 Maximize the window
		driver.manage().window().maximize();
        
		//3 Search T-shirts in search box using id locator
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		//4 click on search button using name locator
		driver.findElement(By.name("submit_search")).click();
		
		//5 click on Blouse using linktext/partial linktext. but mostly we used linktext
		//driver.findElement(By.linkText("Blouse")).click();
		//or
		driver.findElement(By.partialLinkText("Bl")).click();
		
		//6 Requirement is want to find Total number of sliders which r present in that particular page
		//we need to find out one common locator which is matching with all the sliders
		//try to identify one slider & see what are the attributes r available then see other sliders have same attribute or not
		
		
		
		
		
		
		//7 want to find Total number of images(Slider image, Product image) in this page
		//8 Want to find total number of links in this page
		
		
	}

}
