package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		
		//1 enter text in input box1 using sendkeys
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to automation");
		
		Actions act=new Actions(driver);
		
		
		//keyDown() will perform key down actions on this element then press 'a' from keyboard
		
		//2 Control+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//3 Control+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//4  Press tab
		act.keyDown(Keys.TAB).keyUp(Keys.UP).perform();
		
		//5 if we want to press single key then prefrer this & we can also used sendkeys() method
		//act.sendKeys(Keys.TAB).perform();
		
		//6 Control+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		

	}

}
