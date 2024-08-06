package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");	
		//tagname is nothing but label
		
		//1 above()-fetch the label element which is above of name editbox using above()
		WebElement nameEditBox=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		//2 Below()- want to click on submit button below of the date of birth. we r not handle dateofbirth input box because it is flex
		WebElement dateofBirth=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		
		//3 toLeftOf()-select the checkbox which is left to of description
		 //on basis of checkbox label we can check the checkbox
		WebElement icecreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecreamLabel)).click();
		
		//4 toRightOf()- find out the label of radio button & extract the text which is avaliable at the right side
		WebElement studentRadioButton=driver.findElement(By.id("inlineRadio1"));
		//System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(studentRadioButton)).getText());)
	
		
		
	}
}
