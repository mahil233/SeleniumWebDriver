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
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DeleteAllCookies {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		
		//1 for maximize the window
		driver.manage().window().maximize();
		
		
		//2 delete all cookies & make sure that element are not prepopulted in the website
		driver.manage().deleteAllCookies();
		
		//3 delete specific cokkie like session key
		driver.manage().deleteCookieNamed("session key");
		
		driver.get("https://google.com");	
		
	}
}
