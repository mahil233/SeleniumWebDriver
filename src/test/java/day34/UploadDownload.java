package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;

public class UploadDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		/*
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");	
		//scenario is download the excel document then update & upload then wait for success message
		
		// 1 download functionality
		//driver.findElement(By.cssSelector("downloadButton")).click();
		
		
		
		//2 upload functionality
		WebElement upload=driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("‪C:\\Users\\htc\\Downloads\\download.xlsx");
		
		//3 wait for success message to show up &  wait for disappear
		By toastLocator=By.cssSelector("//div[@class='Toastify__toast-body']/div[2]");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//it means wait untill visibility of element located
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		
		//4 want to confirm this message is correctly coming or not
		String toastText=driver.findElement(toastLocator).getText();
		//Assert.assertEquals(Expected result,actual result);
		Assert.assertEquals("Updated Excel Data Successfully.",toastText);
		
		//5 wait until when visibility of element is invisible
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
		*/
		
		
		//6 Upload using robot class
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid&action=modalOpen");
		
		//1 click on upload resume on naukri
		driver.findElement(By.xpath("//span[text()='Upload resume']")).click();
		Thread.sleep(3000);
		
		//2 create the object of Robot class
		Robot r=new Robot();
		
		//3 store the path of file to be uploaded using StringSelection class object
		StringSelection filepath=new StringSelection("C:\\Users\\htc\\Downloads\\download.xlsx"); //paasing path of the file
		
		//4 copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
		
		//5 then press control
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		//6 press v
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		//7 release v
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		//8 release control
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		//9 press enter
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//10 release enter
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		System.out.println("file upload successfully using robot class");
		
		
		
		
	}
}
