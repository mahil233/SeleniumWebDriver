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
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.findElement(By.id("input#autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		//traverse from parent to child using css selector.our goal is to get all the options present in autosuggestive dropdown
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		//our goal is to iterate each & every options & see if it matches with our requirement
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) { //if india match found, then click on it
		
			   option.click();
			   break; //after finding india, it will come outside the loop
			}
		}
		}		
		
		}

