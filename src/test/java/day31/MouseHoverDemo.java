package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/"); 
		
		driver.manage().window().maximize();
		
		//scenario-1 I want to mouse hover two element Desktop & Mouse1 & then click operation
		WebElement desktops=driver.findElement(By.xpath("//a[text()='Desktops']"));	
		WebElement mac=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		//create object of Action Class
		Actions act=new Actions(driver);
		
		//1 mouse hover
		//build()- build() is method which will create an action.
		//perform()- once action is created then perform command can complete that action
		//act.moveToElement(desktops).moveToElement(mac).click().build().perform(); 
		//or
		act.moveToElement(desktops).moveToElement(mac).click().perform();//only perform can create & execute an action
		
		
		
		
		
		
		
		
		

	}

}
