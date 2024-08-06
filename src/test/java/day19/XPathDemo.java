package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		  //1 Launch the Browser
	       WebDriver driver=new ChromeDriver();
	       
	       //2 Launch the application & maximize the page
	       driver.get("https://demo.opencart.com/");
	       driver.manage().window().maximize();
	       
	       //3 Requirement is to capture the name of product(MacBook)
	      // getText()-it will return text of the element
	       String productname=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
          System.out.println(productname); //MacBook
	}

}
