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

public class EnterAlternative {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
        driver.get("https://www.google.com");
        /*
        //1 using sendKeys()
        WebElement element=driver.findElement(By.name("q"));
        
        element.sendKeys("alternative ways for sendkeys");
        
        //2 using javascriptExecutor
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='sendkeys'",element);
		
        //3 using Actions class
        Actions a=new Actions(driver);
        a.sendKeys(element,"Ramesh Kumar").perform();
        */                             
        
        //4 using robot class
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_SPACE);
        r.keyRelease(KeyEvent.VK_SPACE);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);
        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);
        
        
        
		
		
		}		
		}

