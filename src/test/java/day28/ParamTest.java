package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest 
{
	
	WebDriver driver; //Global Variable so that we can use in multiple test methods

@BeforeClass
@Parameters({"browser","url"})
void setup(String br,String appurl) throws InterruptedException  //setup() is used for launching application, launching browser
{
	if(br.equals("chrome")) //if browser value is equal to chrome then if condition will execute
	{
	driver=new ChromeDriver();
	}
	
	else if(br.equals("edge")) //if br value equal to edge then else block will execute
	{
		driver=new EdgeDriver();
	}
	
	else 
	{
	driver=new FirefoxDriver();	
	}
	
	driver.get(appurl);
	driver.manage().window().maximize();
	Thread.sleep(5000);
}


@Test(priority=1)
void testLogo() //verify whether logo is present in the application or not
{
	
	//we r identify the logo element & checking whether it is display or not 
	
	try
	{
	boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed(); //if element is available this method(isDisplayed) will return true 
    Assert.assertEquals(status, true);
	}
	
	catch(Exception e)
	{
		Assert.fail();
	}
}


@Test(priority=2)
void testHomePageTitle()
{
	Assert.assertEquals(driver.getTitle(), "OrangeHRM","Title are not matched...");
}


@AfterClass
void closeApp()
{
	driver.quit();
}
}
