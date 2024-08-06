package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/"); 
		
		driver.manage().window().maximize();
		
		// date picker is inside the iframe. so first we switch to the frame.
		driver.switchTo().frame(0);  //switch to the frame
		
		
		//Approach-1 using sendkeys()
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/15/2022"); //accept mm/dd/yyyy  format
		
		
		
		//approach-2 select future date
		
		String year="2020";
		String month="March";
		String date="25";
		
		//will open the date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//need to capture the month & year from date picker & compare with expected value. if both are matching, then select date

		//(a) select month & year
		while(true)
		{
			//get the month text
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			//get the year text
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month)  && (yr.equals(year)))
			{
				break;
			}
			
			//click on next arrow for future date
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			//click on previous arrow for past date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
			
			
			//(b) select date from datepicker
			
			//it will give u all dates which is available in calendar
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			for(WebElement dt:allDates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
			
			
		}
		
		
		
		
	}

}
