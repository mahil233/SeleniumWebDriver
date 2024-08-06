package day16;

import org.openqa.selenium.By;

/*Test Case


1)Launch Browser

2)Open Url

3)Provide username-Admin

4)Provide password-admin123

5)click on Login Button

6)Verify the title of dashboard page
  Exp title- OrangeHRM

7)close browser
 
 */



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;



public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {


	//	System.setProperty("webdriver.chrome.driver","D:\\Selenium-java_Pavan\\chromedriver_win32\\chromedriver.exe");
	//or
	//	WebDriverManager.chromedriver().setup();
		
		//a) This statement is enough to launch our browser
		//ChromeDriver driver=new ChromeDriver();//if create variable as chrome driver, u hv to create chrome driver class object. this variable(driver) will hold only object of chromedriver 

		//b) when working with multiple browser, always prefer second approach 
		//after 4.6.0 version, only below line is sufficient to launch the browser 
		
		// 1)Launch Browser
		WebDriver driver=new ChromeDriver();//if create variable with webdriver, u can create object with any class(chrome driver, edge driver)
	
	   // 2)Open URL on the browser 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();  //to maximize the page
		Thread.sleep(5000);
		
		//3)Provide username-Admin
		//WebElement txtUsername=driver.findElement(By.name("username")); //variable is txtUsername & type of variable is WebElement 
		//txtUsername.sendKeys("Admin");
	
	    //or
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		// 4)Provide password-admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// 5)click on Login Button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
		
	/*	//6 Verify title of dashboard page
		//(a) Title Validation   
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		
		else
		{
			System.out.println("Test failed");
		}
	*/
		
		//(b) Label validation after successful login
		// Using Copy Xpath
		
		String act_label=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String exp_label="Dashboard";
		
		if(act_label.equals(exp_label))
		{
			System.out.println("test passed");
		}
		
		else
		{
			System.out.println("test failed");
		}
		
		
		
		//7 close browser
		//driver.close();
	      driver.quit();
	}
	

}
