package day23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
	    driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        
        //1 enter selenium in google search box
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        
        Thread.sleep(3000);
        
        //2 Find out total number of suggestions
        List<WebElement> lists=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
        System.out.println("Number of suggestions "+lists.size()); //Number of suggestions 12
        
        //3 Capture each value from suggestion & print in console window
       /* 
        for(int i=0;i<lists.size();i++)
        {
        	System.out.println(lists.get(i).getText());   //lists.get(i) will retrieve each web element one by one. from that web element we r extracting the text value 
        
        }
        */
        
        //4 I want to select selenium python from all autosuggestion value or select an option from list
        for(int i=0;i<lists.size();i++)
        {
        	String text=lists.get(i).getText(); //list.get(i) it will return the webelement.from that webelement we r capturing the text  using getText()
        	
        	if(text.equals("selenium python"))
        	{
        		lists.get(i).click();
        		break;                 //once click on selenium python then come out from loop thats why used break otherwise it go to next item
        	}
        }
        
        
        
        
        
        

	}

}
