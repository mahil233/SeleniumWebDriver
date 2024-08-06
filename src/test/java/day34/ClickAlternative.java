package day34;

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
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClickAlternative {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
        driver.get("https://www.yatra.com/flights");	
		
		WebElement oneWay=driver.findElement(By.xpath("//a[@title=\"One Way\"]"));
		WebElement roundTrip=driver.findElement(By.xpath("//a[@title=\"Round Trip\"]"));
		WebElement multiCity=driver.findElement(By.xpath("//a[@title=\"Multicity\"]"));
		
		/*
		//1 using click()
		Thread.sleep(3000);
		//roundTrip.click();
		
		//2.1 using sendkeys
		Thread.sleep(3000);
		multiCity.sendKeys(Keys.ENTER);
		
		//2.2 using sendkeys
		Thread.sleep(3000);
		roundTrip.sendKeys(Keys.RETURN);
		
		//3 using javascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()",oneWay);
		
		//note-we can click multiple leemnt also using javascript
		//js.executeScript("arguments[0].click();arguments[1].click();",oneWay,twoway);
		*/
		
		//4.1 using Actions Class click()
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.click(multiCity).perform();
		
		//4.2 using Actions Class moveToElement()
		Thread.sleep(3000);
		actions.moveToElement(roundTrip).click().perform();
		
		//4.3 using Actions Class clickAndHold()
		Thread.sleep(3000);
		actions.clickAndHold(oneWay).release().perform();
		
		
		}		
		}

