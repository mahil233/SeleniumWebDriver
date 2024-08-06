package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {



		//1 open app
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
        
		//2 Maximize the window
		driver.manage().window().maximize();
		
		//3 Requirement is want to find Total number of sliders which r present in Home page
		//we need to find out one common locator which is matching with all the sliders
		//try to identify one slider & see what are the attributes r available then see other sliders have same attribute or not
		
		// want to capture all the sliders. findElements are used because we r finding multiple WebElements
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		
		//Find the size of list
		System.out.println("Number of Sliders: "+sliders.size()); //Number of Sliders: 5     5 is actual value
		
		
		//4 Requirement is Find total number of images in Home Page
		//Every image have common tag name
		
		
		List<WebElement> images=driver.findElements(By.tagName("img"));  //this will return all images in form of webelement. i capture all images into this variable(img)
	
        //Find total no of images
		System.out.println("Total number of images: "+images.size());//Total number of images: 22    22 is actual value
		
		
		
		//5 Requirement is to Find total number of links
		//tagname(a) is same for every links. we need to capture all links using tag name
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Totak number of links: "+links.size());//Total number of links: 94   94 is actual value
	
	
	
	}

}
