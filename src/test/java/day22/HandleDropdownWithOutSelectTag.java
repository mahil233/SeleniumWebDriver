 package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownWithOutSelectTag {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
	    driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        
        //1 clicking on multi select dropdown
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        
        //2 want to capture all options from dropdown
        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        
        //3 find total no of options
        System.out.println("Total no of options "+options.size()); //Total no of options 14s
        
        //4 print all options from dropdown using normel for loop
        /*
        for(int i=0;i<options.size();i++)
        {
        	System.out.println(options.get(i).getText());
        }
        */
        
        //5 Select Java options from drop-down
        /*
        for(int i=0;i<options.size();i++)
        {
             if(options.get(i).getText().equals("Java"))
             {
            	 options.get(i).click();
            	 break;  //break is used after select java option it will exit from loop, otherwise it will select other option
             }
        }
        */
        
        //6 Select Java & Python options from drop-down using for loop
        /*
        for(int i=0;i<options.size();i++)
        {
        	String option=options.get(i).getText();
        	
             if(option.equals("Java") || option.equals("Python") )
             {
            	 options.get(i).click();
            	 
             }
        }
        */
        
      //7 Select Java & Python options from drop-down using for each loop
        
        for(WebElement option:options)
        {
        	String text=option.getText();
        	if(text.equals("Java") || text.equals("Python"))
        	{
        		option.click();
        	}
        }
        
        
        

	}

}
