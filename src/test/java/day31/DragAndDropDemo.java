package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); 
		driver.manage().window().maximize();
		
		//first identify what is source, what is target
		
		//Scenario1- want to drag from Rome to italy. Rom is source element & italy is target element
		//first capture source & target element
		
		Actions act=new Actions(driver);
		
		//capture the source element
		WebElement rome=driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		
		//capture the target element
		WebElement italy=driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		
		
		act.dragAndDrop(rome, italy);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
