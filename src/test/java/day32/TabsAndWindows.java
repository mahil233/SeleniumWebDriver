package day32;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//requirement is in first tab open opencart application & in second tab open orange hrm application;
		driver.get("https://www.opencart.com/"); 
		
		//1 this command is used to open new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//2 this command is used to open completely another window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		

	}

}
