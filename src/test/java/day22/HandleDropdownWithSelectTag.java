package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownWithSelectTag {

	public static void main(String[] args) {


		   WebDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
	       driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
           driver.manage().window().maximize();
           
           //1 Dropdown having select tag in DOM
           WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
           Select drpCountry=new Select(drpCountryEle);
           
           //(a)Selecting an option from the dropdown
           //drpCountry.selectByVisibleText("France");
           //drpCountry.selectByValue("4");
           //drpCountry.selectByIndex(3);
           
           //2 Find total options in the drop-down
           List<WebElement> options=drpCountry.getOptions();
           System.out.println("Total no of options: "+options.size()); //Total no of options: 6
           
           //3 Print options in console window or read each option from the drop-down using for loop
         /*  
           for(int i=0;i<options.size();i++)
           {
        	   System.out.println(options.get(i).getText()); //getText() is used to get the text from option web element
           }
         */
           
           //or
           //using for each loop or enhanced loop
           for(WebElement op:options)
           {
        	   System.out.println(op.getText());
           }
           
           
           
           
           
           
	}

}
