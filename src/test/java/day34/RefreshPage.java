/*
package RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");	
		Thread.sleep(3000);
		
		//1 using refresh()
		driver.navigate().refresh();
		
		//2 sendkeys(Keys.F5) of action class
		Actions  actions=new Actions(driver);
		actions.sendKeys(Keys.F5).build().perform();
		
		//3 using Javascript Executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location.reload();");
		
		//4 by using get command
		driver.get(driver.getCurrentUrl()); //instead of passing url we can pass getCurrentUrl
		
		//5 using navigate command)
		driver.navigate().to(driver.getCurrentUrl()); //instead of passing url we can pass getCurrentUrl
		
		
		
		
	}

*/
package day34;


