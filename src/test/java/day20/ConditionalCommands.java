package day20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//1 isDisplayed() 
		//Logo Element. scenario is want to check logo is present/displayed or not
		
		/*
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo: "+logo.isDisplayed());  //Display status of logo: true
		*/
		
		//or
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status); //true
		
		
		//2 isEnabled() 
		//Search Box is element.Scenario is want to check Search Box is displayed or not 
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status: "+searchbox.isDisplayed()); //Display Status: true
		
		
		//3 Search Box is element.Scenario is want to check Search Box is enabled or not
		System.out.println("Enable status: "+searchbox.isEnabled()); //Enable status: true
		

		//4 isSelected()
		//Verify whether radio button is already selected or not
		WebElement mail_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));	
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//before radio button selection
		System.out.println("Before Selection.....");
		System.out.println(mail_rd.isSelected());   //false
		System.out.println(female_rd.isSelected()); //false
		
		//after selection of male radio button
		System.out.println("After selection of male radio button.......");
		mail_rd.click();
		System.out.println(mail_rd.isSelected());  //true
		System.out.println(female_rd.isSelected());//false
		
		//after selection of female radio button
		System.out.println("After selection of female radio button.......");
		female_rd.click();
		System.out.println(mail_rd.isSelected());  //false
		System.out.println(female_rd.isSelected());//true
		
	}

}
