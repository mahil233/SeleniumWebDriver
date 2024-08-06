package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	//creating WebDriver variable as class variable, so that i can refer variable in every test method
	WebDriver driver;
	
    @BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
	}
	
    
    //This login test repeat multiple times with different sets of email & password
    
    @Test(dataProvider="dp") //this data is coming from dp method. here data provider is parameter of test annotation
	void testLogin(String email, String pwd) //this two parameter sent by data provider method
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//validate the title of home page
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
	}
	
    @AfterClass
	void tearDown()
	{
		driver.close();;
	}
    
    
    //In data provider method we have to specify data provider annotation. data provider method name is loginData()
    
    @DataProvider(name="dp", indices= {0,4})  //here data provider is annotation. indices means suppose want to execute only first & last data
    String [][] loginData()
    {
    	String data[][]= {
    			              //valid & invalid username & password data sets
    			
    			            {"abc@gmail.com","test123"},
    			            {"sardanam@gmail.com","test321"},
    			            {"sard@gmail.com","test444"},
    			            {"sardanamahil@gmail.com","Mahil@321"},
    			            {"seww@gmail.com","Test@321"}
    			
    			
    	                 };
    	return data;
    }
    
    
    
}
