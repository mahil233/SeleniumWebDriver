package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit command
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    
    //1 Find total number of rows
    
    //approach-1(this approach is preferable)
    //int rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size(); //using absolute xpath
   
    //or
    
   // int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //using relative xpath
   // System.out.println("Number of rows: "+rows); //Number of rows: 7
    
    
    //approach-2 (use this approach only if u have single table in page)
    int rows=driver.findElements(By.tagName("tr")).size();
    System.out.println("Number of rows "+rows); //Number of rows 14
    
    
    
    //(1.1) Find out the first row
    //int rows1=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]")).size(); //using relative xpath
    //System.out.println("Number of row: "+rows1); 
    
    
    //2 Find total number of columns
    
    int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //approach-1
    //or
    
    //approach-2
    //int columns=driver.findElements(By.tagName("th")).size(); //don't prefer approach-2 if u have multiple tables
    System.out.println("Number of columns "+columns); //Number of columns 4
    
    
    //3 Read specific row & column data. ex-want to capture the data 'Master In Selenium'
   // String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
   // System.out.println(value); //Master In Selenium

    
    //4 Read data from all the rows & columns
    //two for loop is required, one for row incrementation other for column incrementation.outer loop is represent rows in table
    
    //print the header
    System.out.println("Book Name"+"     "+"Author"+"      "+"Subject"+"     "+"Price");
    
    
    /*
    for(int r=2;r<=rows;r++)  //r value start from 2 because actual data start from second tr. rows represent total no of rows
    {
    	for(int c=1;c<=columns;c++) //columns represent total no of columns
    	{
    		
    		//we r passing the row number, column number dynamically in below column
    		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText(); //we can pass r & c value into xpath.this is called parsing value into xpath.
    	    System.out.println(value+"    ");	 //print will print statement in same line
    	}
    	System.out.println(); //println will go to next line
    }
    
    
    //5 Print book names whose author is Amit
    for(int r=2;r<=rows;r++)
    {
    	//we r passing dynamic row number value
    	Thread.sleep(5000);
    	String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
    	//System.out.println(author);
    	
    	//we need to compare whether author is amit or not
    	if(author.equals("Amit"))
    	{
    		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
    		System.out.println(author+" "+bookname); 

    	}
    }
    */
    
    //6 Find sum of prices for all the books
    int sum=0;
    for(int r=2;r<=rows;r++)
    {
    	String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
       // System.out.println(price);
        
        sum=sum+Integer.parseInt(price);  //we convert string to integer using parseInt
    }
    System.out.println("Total price of books "+sum);
    
    
	}
}
