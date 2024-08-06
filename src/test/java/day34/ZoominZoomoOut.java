package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;

public class ZoominZoomoOut {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.google.com/");	
		Thread.sleep(3000);
		
		//1 To Zoomin  3 times one way for zoomin-press control & +
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		for(int i=0;i<3;i++) {
			
			robot.keyPress(KeyEvent.VK_ADD);
			
			robot.keyRelease(KeyEvent.VK_ADD);
			
		}
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(7000);
		//1 To Zoomout  3 times
			
		for(int i=0;i<3;i++) {
			
			//one way for zoomout-press control & -
			//robot.keyPress(KeyEvent.VK_CONTROL);
			//robot.keyPress(KeyEvent.VK_SUBTRACT);
			//robot.keyRelease(KeyEvent.VK_CONTROL);
			//robot.keyRelease(KeyEvent.VK_SUBTRACT);
				
			//anoother way is press control & 0
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_0);
		}
		Thread.sleep(7000);
				
		
		
		
		
		
		
		
	}
}
