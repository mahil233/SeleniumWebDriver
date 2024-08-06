package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/"); 
		driver.manage().window().maximize();
		
		//handle Horrizontal Slider-dragAndDropBy(element, x axis, y axis);
		Actions act=new Actions(driver);
		
		
		//1 minimum slider
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		
		//getLocation()-capture the locations of slider, in which location slider is present
		//capture location of Web Element we use getLocation()
		System.out.println("Current location of min_slider: "+min_slider.getLocation());  //Current location of min_slider: (59, 250). 59 is x axis & 250 is y axis                                                                                      
		
		act.dragAndDropBy(min_slider, 100,250).perform(); //move the x axis increment from 59 to 159 position
		
		System.out.println("Location of min_slider after moving "+min_slider.getLocation()); //Location of min_slider after moving (161, 250)
		
		
		//2 maximum slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("Current location of max slider "+max_slider.getLocation()); //Current location of max slider (544, 250)

		act.dragAndDropBy(max_slider, -100, 250).perform();  //move the x axis decrement from from 544 to 444 position
		System.out.println("Location of max slider after moving "+max_slider.getLocation()); //Location of max slider after moving (442, 250)

		
		
		
		
		
		
		
		
		
		
		

	}

}
