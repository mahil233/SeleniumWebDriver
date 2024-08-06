package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		
		   // Launch the Browser
	       WebDriver driver=new ChromeDriver();
	       
	       //1 navigate.to()- getCurrentUrl() is used to check whether it is navigated or not
	       driver.navigate().to("https://www.amazon.com/");
	       System.out.println(driver.getCurrentUrl()); //https://www.amazon.com/
	       
	       driver.navigate().to("https://www.flipkart.com/");
	       System.out.println(driver.getCurrentUrl()); //https://www.flipkart.com/

	       
	       //2 naviage.back()
	       driver.navigate().back();
	       System.out.println(driver.getCurrentUrl()); //https://www.flipkart.com/

	       
	       //3 navigate.forward()
	       driver.navigate().forward();
	       System.out.println(driver.getCurrentUrl()); //https://www.amazon.com/
	       
	       //4 navigate.refresh();
	       driver.navigate().refresh(); //it will refresh or reload the page
	}

}
