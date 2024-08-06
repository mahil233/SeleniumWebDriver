package day18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSSelectorsDemo {

	public static void main(String[] args) {

      //1 Launch the Browser
       WebDriver driver=new ChromeDriver();
       
       //2 Launch the application & maximize the page
       driver.get("https://demo.nopcommerce.com/");
       driver.manage().window().maximize();
       
       
       
              //(a)css with tag & id combinations
       
       //3 Locate the searchbox & pass value like Macbook using css locator
      // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
       //or
       
       //this locator match with 3 element, we r using findElement it will return first element. so input box is first element
      // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook"); 
       
       
       //(b)css with tag & class combinations
       
       //3 Locate the searchbox & pass value like Macbook using css locator
       // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mackbook");
       //or
       
       //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mackbook");
       
       
       //(c)css with tag & attribute combinations
       
     //3 Locate the searchbox & pass value like Macbook using css locator
       
       //inside double quote, double quote is not allowed only single quote is allowed
      // driver.findElement(By.cssSelector("input[name=\"q\"]").sendKeys("Mackbook");
       
      //driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Mackbook");
       //or
      // driver.findElement(By.cssSelector("[name='q']")).sendKeys("Mackbook");
       
       
       //(d)css with tag class & attribute combinations
      
    //3 Locate the searchbox & pass value like Macbook using css locator
      
      //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Mackbook");
       //or
      
       driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Mackbook");
      
      
      
	}

}
