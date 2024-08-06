package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver=new ChromeDriver();
	       
	       //once u create implicit wait command that is applicable for every statement in automation script
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
	       
	       driver.get("https://testautomationpractice.blogspot.com/");
	       
	       //1 Select specific one checkbox
	      // driver.findElement(By.xpath("//input[@id='monday']")).click();
	       
	       //2 count total no of checkboxes
	       //List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	       //or
	       List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'] [@type='checkbox']"));
	       
		   System.out.println("Total number of checkboxes "+checkboxes.size()); //Total number of checkboxes 7
		   
		   //3 select all the checkboxes
		   /*
		   for(int i=0;i<checkboxes.size();i++)  //i is represent element which r avaliable in list collection
		   {
			   checkboxes.get(i).click();                //checkboxes.get(i)- it will get u first checkbox then second....etc &then perform click operation
		   }
		   
		   
		   
		   //or
		   for(WebElement chkbox:checkboxes)
		   {
			   chkbox.click();
		   }
		   
		   
		   
		   //4 requirement is select last 2 check boxes
		   //formula is-total no of checkboxes-how many checkboxes to be selected=starting index
		   //ex-7-2=5 (5 is starting index)
		   
		   for(int i=5;i<checkboxes.size();i++)  
		   {
			   checkboxes.get(i).click();                
		   }
		   
		   
		   
		   //5 Select first 2 check boxes
		   
		   for(int i=0;i<2;i++)
	       {
			   checkboxes.get(i).click();   
	       }
		   
		   
		   //or
		   
		   for(int i=0;i<checkboxes.size();i++)  //i is represent element which r avaliable in list collection
		   {
			   if(i<2)
			   {
			   checkboxes.get(i).click();      
			   }
		   }
		   
		   
		   
		   
		   //6 clear/Uncheck the checkboxes
		   
		   for(int i=0;i<checkboxes.size();i++)  
		   {
			   checkboxes.get(i).click();                
		   }
		   Thread.sleep(3000);
		   
		   //if checkbox is already selected, if do click operation one more time it will unselect automatically or if already selected the it will unselect the checkboxes
		   for(int i=0;i<checkboxes.size();i++)  
		   {
			   checkboxes.get(i).click();                
		   }
		   
		   
		   //7 requirement is to select first 3 check boxes & then unselect this 3 check boxes.
		   //(a)using normel for loop
		   
		   for(int i=0;i<3;i++)  
		   {
			   checkboxes.get(i).click();                
		   }
		   
		   Thread.sleep(3000);
		   
		   for(int i=0;i<checkboxes.size();i++)  
		   {
			   if(checkboxes.get(i).isSelected())  //if check box is selected it will return true then only it will unselected
			{
			   checkboxes.get(i).click();  
			}
			
			*/
		   
		   //(b)using for loop & for-each loop
		   
		   for(int i=0;i<3;i++)  //this loop will select first 3 check boxes
		   {
			   checkboxes.get(i).click();                
		   }
		   
		   Thread.sleep(3000);
		   
		   
		   for(WebElement checkbox:checkboxes)  //this loop will unselect first 3 check boxes
		   {
			if(checkbox.isSelected())  
			{
			  checkbox.click();
		   
		    }
		   
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		

	}

}
